import java.util.*;
class Adder
{
    int a[];
    Adder()
    {
        a=new int[2];
        a[0]=0;a[1]=0;
    }
    void ReadTime()
    {
        System.out.println("Enter hours and minutes");
        Scanner sc=new Scanner(System.in);
        a[0]=sc.nextInt();
        a[1]=sc.nextInt();
    }
    void AddTime(Adder x,Adder y)
    {
        a[0]=x.a[0]+y.a[0];
        a[1]=x.a[1]+y.a[1];
        if (a[1]>=60)
        {
            a[0]+=1;
            a[1]-=60;
        }
    }
    void DispTime()
    {
        System.out.println("Sum="+a[0]+" hours "+a[1]+" minutes");
    }
    static void main()
    {
        Adder x=new Adder();
        Adder y=new Adder();
        x.ReadTime();
        y.ReadTime();
        x.AddTime(x,y);
        x.DispTime();
    }
}