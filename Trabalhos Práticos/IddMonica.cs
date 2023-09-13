using System;

public class IdadeMonica
{
    public static void Main(string[] args)
    {
        int m = Convert.ToInt32(Console.ReadLine());
        int a = Convert.ToInt32(Console.ReadLine());
        int b = Convert.ToInt32(Console.ReadLine());
        int c = 0;

        if (m >= 44 && m <= 110 && a >= 1 && a < m && b >= 1 && b < m && a != b)
        {
            c = m - a - b;
            if (a > b && a > c)
            {
                Console.Write(a);
            }
            else if (b > a && b > c)
            {
                Console.Write(b);
            }
            else
            {
                Console.Write(c);
            }
        }
    }
}
