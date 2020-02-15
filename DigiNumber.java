import java.util.*;
class DigiNumber
{
    long num;
    DigiNumber()
    {
        num=0;
    }
    DigiNumber(long n)
    {
        num=n;
    }
    void digitFrequency()
    {
        long l=0,c=0;
        for (long i=0;i<=9;i++)
        {
            for (long j=num;j>0;j=j/10)
            {
                l=j%10;
                if (l==i)
                    c++;
            }
            if (c!=0)
                System.out.println("Frequency of "+i+" is "+c);
            c=0;
        }
    }
    long sumDigits(long n)
    {
        if (n==0)
            return 0;
        return n%10+sumDigits(n/10);
    }
    void PrintSum()
    {
        System.out.println("Sum of digits is "+sumDigits(num));
    }
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        long a=sc.nextLong();
        DigiNumber obj=new DigiNumber(a);
        obj.digitFrequency();
        obj.PrintSum();
    }
}