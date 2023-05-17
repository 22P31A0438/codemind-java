import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        Scanner mr=new Scanner(System.in);
        int t;
        Float x1,x2,y1,y2;
        t=mr.nextInt();
        while(t-->0)
        {
            x1=mr.nextFloat();
            x2=mr.nextFloat();
            y1=mr.nextFloat();
            y2=mr.nextFloat();
            if(y1/x1<y2/x2)
            System.out.println("-1");
            else if(y1/x1>y2/x2)
            System.out.println("1");
            else 
            System.out.println("0");
        }
        mr.close();
    }
}