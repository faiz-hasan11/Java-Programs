import java.util.*;
class Rotate
{
    int arr[][],deg,a;
    void input()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the side length of sq matrix");
        a=sc.nextInt();
        arr=new int[a][a];
        System.out.println("Enter the elements of the square matrix");
        for (int i=0;i<a;i++)
        {
            for (int j=0;j<a;j++)
                arr[i][j]=sc.nextInt();
        }
        System.out.println("Enter the degrees of rotation(multiple of 90)");
        deg=sc.nextInt();
    }
    void Rotation()
    {
        int rot[][]=new int[a][a];
        for (int i=1;i<=deg/90;i++)
        {
            for (int j=0;j<a;j++)
            {
                for (int k=0;k<a;k++)
                {
                    rot[k][a-1-j]=arr[j][k];
                }
            }
            for (int l=0;l<a;l++)
            {
                for (int m=0;m<a;m++)
                    arr[l][m]=rot[l][m];
                }
        }
        for (int i=0;i<a;i++)
        {
            for (int j=0;j<a;j++)
                System.out.print(rot[i][j]+"\t");
            System.out.println();    
        }
    }
    static void main()
    {  
        Rotate obj=new Rotate();
        obj.input();
        obj.Rotation();
    }
}
            