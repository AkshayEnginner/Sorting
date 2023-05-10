import java.util.*;
class aks
{
    int a[] = {5,8,3,7,28,4};
    int max = a[0];
    
    void check()
    {
    for(int i=0;i<a.length;i++)
    {
        if(a[i]>max)
        {
            max=a[i];
        }
    }
    System.out.println("The maximum value in the list is " +max);
    }
}
class maximumvalue
{
    public static void main(String args[])
    {
        aks a = new aks();
        a.check();
    }
}