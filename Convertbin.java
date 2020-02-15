class Convertbin
{
    long convert(int n)
    {
        if (n==0)
            return 0;
        return convert(n/2)*10+(n%2);    
    }
}