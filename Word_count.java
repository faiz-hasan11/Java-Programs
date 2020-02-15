import java.util.*;
class Word_count
{
    String s;
    int count;
    Word_count(String a)
    {
        s=a;
        count=0;
    }
    boolean check(String a)
    {
        String vowels="AEIOUaeiou";
        if (vowels.indexOf(a.charAt(0))>=0)
            return true;
        else
            return false;
    }
    void frequency()
    {
        StringTokenizer st=new StringTokenizer(s," .");
        int l=st.countTokens();
        for (int i=1;i<=l;i++)
        {
            if (check(st.nextToken())==true)
                count+=1;
        }
        System.out.println(s);
        System.out.println("FREQUENCY="+count);
    }
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String a=sc.nextLine();
        Word_count obj=new Word_count(a);
        obj.frequency();
    }
}
            