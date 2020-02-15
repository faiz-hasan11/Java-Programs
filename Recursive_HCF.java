class Recursive_HCF
{
    int HCF(int a, int b)
    {
        if (a%b==0)
            return b;
        return HCF(b,a%b);
    }
}