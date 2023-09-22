package Aeds2;
import com.azure.core.credential.AzureKeyCredential;
import com.azure.core.http.rest.PagedIterable;
import com.azure.ai.textanalytics.TextAnalyticsClient;
import com.azure.ai.textanalytics.models.*;
import com.azure.ai.textanalytics.TextAnalyticsClientBuilder;
import com.azure.ai.textanalytics.models.TextAnalyticsApiKeyCredential;
import com.azure.ai.textanalytics.models.TextSentiment;
import com.azure.ai.textanalytics.TextAnalyticsServiceVersion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Projeto01 {
    private static final String ENDPOINT = "YOUR_TEXT_ANALYTICS_ENDPOINT";
    private static final String KEY = "YOUR_TEXT_ANALYTICS_KEY";

    public static void main(String[] args) {
        TextAnalyticsClient textAnalyticsClient = new TextAnalyticsClientBuilder()
            .credential(new TextAnalyticsApiKeyCredential(KEY))
            .serviceVersion(TextAnalyticsServiceVersion.V3_2)
            .endpoint(ENDPOINT)
            .buildClient();

        List<String> texts = Arrays.asList(
            "I love this product!",
            "This is terrible.",
            "Neutral text here."
        );

        System.out.println("Sentiment Analysis Results:");
        for (String text : texts) {
            TextDocumentInput document = new TextDocumentInput().setId("1").setText(text);
            AnalyzeSentimentOptions options = new AnalyzeSentimentOptions().setIncludeOpinionMining(true);
            AnalyzeSentimentResult sentimentResult = textAnalyticsClient.analyzeSentimentBatchSingleDocument(document, options, null);

            System.out.println("Text: " + text);
            System.out.println("Sentiment: " + sentimentResult.getSentiment());
            System.out.println("Sentiment scores: Positive=" + sentimentResult.getSentimentScores().getPositive() +
                    ", Neutral=" + sentimentResult.getSentimentScores().getNeutral() +
                    ", Negative=" + sentimentResult.getSentimentScores().getNegative());

            for (SentenceOpinion opinion : sentimentResult.getSentences().get(0).getOpinions()) {
                System.out.println("Opinion: " + opinion.getText());
                System.out.println("Sentiment: " + opinion.getSentiment());
            }

            System.out.println();
        }
    }
}
