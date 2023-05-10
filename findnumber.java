import java.util.*;
class aks
{
    int a[] = {1,3,6,8,35,82};
    int n;
    int temp=0;
    
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
    }
    void check()
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==n)
            {
                System.out.println("The number is present at "+i+"   index");
                temp=temp+1;
            }
        }
        if(temp==0)
        {
           System.out.println("The number not present"); 
        }
    }
}
class findnumber
{
    public static void main(String args[])
    {
        aks a = new aks();
        a.input();
        a.check();
    }
}