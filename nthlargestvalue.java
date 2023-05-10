import java.util.*;
class aks
{
    int a[]= {34,35,36,37,39,20,69,57,48,38};
    int temp=0;
    int k=5;
    void check()
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-1;j++)
            {
                if(a[j]<a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println ( a[i] );
        }
        System.out.println(+k+"th largest value is " +a[k-1]);
        
    }
}
class nthlargestvalue
{
    public static void main(String args[])
    {
        aks a = new aks();
        a.check();
    }
}