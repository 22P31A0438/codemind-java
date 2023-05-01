import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        Scanner mr=new Scanner(System.in);
        double m,r;
        double n;
        m=mr.nextDouble();
        r=mr.nextDouble();
        n=(m+r)/2;
        System.out.format("%.4f",n);
    }
}