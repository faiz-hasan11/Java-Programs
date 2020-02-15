import java.util.*;
class Prime_Palin
{
    int m,n,rev,c;
    Prime_Palin(int mm,int nn)
    {
        m=mm;
        n=nn;        
    }
    boolean isPrime(int a)
    {
        if (a==1)
            return false;
        if (c==a)
            return true;
        if (a%c==0)
            return false;
        c++;
        return isPrime(a);
    }
    int revNum(int a)
    {
        int q=1;
        if (a==0)
            return 0;
        for (int i=a;i>9;i=i/10)
            q=q*10;
        return (a%10)*q+revNum(a/10);    
    }
    void Print()
    {
        int f=0;
        System.out.println("The Prime Palindromes are : ");
        for (int i=m;i<=n;i++)
        {
            c=2;
            rev=revNum(i);
            if (isPrime(i)==true && rev==i)
            {
                System.out.println(i);
                f++;
            }
        }
        c=f;
        System.out.println("Frequency :"+c);
    }
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range");
        int a=sc.nextInt();
        int b=sc.nextInt();
        /*if (a>=3000 || b>=3000)
        {
            System.out.println("Input out of range");
            System.exit(0);
        }*/
        Prime_Palin obj=new Prime_Palin(a,b);
        obj.Print();
    }
}
                