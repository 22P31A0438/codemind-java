import java.util.*;
public class Sample
{
    public static void unique(int a[],int s)
    {
        int c=0,f=0;
        for(int i=0;i<s;i++)
        {
            if(a[i]!=-1)
            {
                c=1;
                for(int j=i+1;j<s;j++)
                {
                    if(a[i]==a[j])
                    {
                        c++;
                        a[j]=-1;
                    }
                }
                if(c==1)
                {
                    f=1;
                    System.out.print(a[i]+" ");
                }
            }
        }
        if(f==0)
        System.out.println("-1");
    }
    public static void main(String args[])
    {
        Scanner mr=new Scanner(System.in);
        int n,x[],i;
        n=mr.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        x[i]=mr.nextInt();
        unique(x,n);
    }
}










