import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        Scanner mr=new Scanner(System.in);
        float m,r,n;
        m=mr.nextFloat();
        r=mr.nextFloat();
        n=m*r;
        System.out.format("%.2f",n);
    }
}