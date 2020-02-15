import java.util.*;
class DeciOct
{
    int oct,n;
    DeciOct()
    {
        oct=0;
        n=0;
    }
    void getnum(int x)
    {
        oct=x;
    }
    void OctDeci()
    {
        int c=0;
        for (int i=oct;i>0;i=i/10)
            c++;
        n=n+(oct/(int)Math.pow(10,c-1))*((int)Math.pow(8,c-1));
        oct=oct-(oct/(int)Math.pow(10,c-1))*(int)Math.pow(10,c-1);
        if (oct==0)
            return;
        OctDeci();
    }
    void show()
    {
        System.out.println("Decimal eq = "+n);
    }
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        DeciOct obj=new DeciOct();
        obj.getnum(a);
        obj.OctDeci();
        obj.show();
    }
}