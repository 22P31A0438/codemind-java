import java.util.*;
public class Sample
{
    public static boolean MR(int r)
    {
        for(int i=2;i<=(int)Math.sqrt(r);i++)
        {
            if(r%i==0)
            return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner mr=new Scanner(System.in);
        int m,c=0;
        m=mr.nextInt();
        for(int i=2;i<=(int)Math.sqrt(m);i++)
        {
            if(MR(i))
            c++;
        }
        System.out.println(c);
    }
}