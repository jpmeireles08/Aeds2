import java.util.*;

public class Questao1 {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
        String num = sc.nextLine();
        String cutoff = sc.nextLine();
        char valor = '0';
        char[] proxChar = new char[100];
        char[] proxNum = new char[100];

        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) != '.' && num.charAt(i) != '0') {
                valor = num.charAt(i);
                i = num.length();
            }
        }

        for (int i = 0; i < cutoff.length(); i++) {
            if (cutoff.charAt(i) != '.') {
                proxChar[i] = cutoff.charAt(i);
            }
        }

        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == '.') {
                proxNum[i] = num.charAt(i+1);
            }
        }

        if (proxNum.length > proxChar.length) {
            for (int i = 0; i < proxChar.length; i++) {
                    if (proxNum[i] > proxChar[i]) {
                        valor += 1;
                    } else if (proxNum[i] == proxChar[i]) {
                        i++;
                    } 
            }
        } else {
            for (int i = 0; i < proxNum.length; i++) {
                if (proxNum[i] > proxChar[i]) {
                    valor += 1;
                } else if (proxNum[i] == proxChar[i]) {
                    i++;
                }
            }
        }

       
    
        System.out.print(valor);
    }
        sc.close();
    
        
    }
}