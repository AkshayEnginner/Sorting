import java.util.*;
class aks
{
    int a[]= {34,35,36,37,39,20,69,57,48,38};
    int temp=0;
    void check()
    {
        for(int i=0;i<a.length;i++)
        {
           for(int j=i+1;j<a.length;j++)
           {
              if(a[i]==a[j])
             {
              System.out.println ("Duplicate elements are" + a[j]);
              //temp=temp+1;
             }
               
            }
        }
         if(temp==0)
    {
        System.out.print(" Duplicate element not found ");
    }
        
        
    }
}
class dublicatevalue
{
    public static void main(String args[])
    {
        aks a = new aks();
        a.check();
    }
}