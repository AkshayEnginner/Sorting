import java.util.*;
class akshay
{
    int a[] = {6,38,95,23,8,1,4,25,63,92};
    int temp =0;
    
    void check()
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        
        for(int i=0;i<a.length-1;i++)
        {
            System.out.println(a[i]);
        }
    }
}

class Bubblesort
{
    public static void main(String args[])
    {
        akshay a = new akshay();
        a.check();
    }
}