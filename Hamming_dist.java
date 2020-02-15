import java.util.*;
class Hamming_dist
{
    String s1,s2;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two words");
        s1=sc.nextLine();
        s2=sc.nextLine();
    }
    void CheckLength()
    {
        int l1=s1.length();
        int l2=s2.length();
        if (l1>l2)
        {
            for (int i=1;i<=(l1-l2);i++)
                s2=" "+s2;
        }
        else if (l2>l1)
        {
            for (int i=1;i<=(l2-l1);i++)
                s1=" "+s1;
        }
    }
    void Process()
    {
        int hd=0;
        String ss1=s1.toUpperCase();
        String ss2=s2.toUpperCase();
        for (int i=0;i<s1.length();i++)
        {
            if (ss1.charAt(i)!=ss2.charAt(i))
                hd++;
        }
        System.out.println("S1 = "+s1);
        System.out.println("S2 = "+s2);        
        System.out.println("HAMMING DISTANCE = "+hd);
    }
    static void main()
    {
        Hamming_dist obj=new Hamming_dist();
        obj.input();
        obj.CheckLength();
        obj.Process();
    }
}
        