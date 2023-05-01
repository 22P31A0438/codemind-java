import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        Scanner mr=new Scanner(System.in);
        double a,b,c,s;
         double r;
        a=mr.nextDouble();
        b=mr.nextDouble();
        c=mr.nextDouble();
        s=(a+b+c)/2;
        r=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",r);
    }
}