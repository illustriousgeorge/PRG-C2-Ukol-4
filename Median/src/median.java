import java.util.*;

public class median {
    public static void main(String args[]){

        Scanner s=new Scanner(System.in);
        System.out.println("Enter number: ");

        int a=s.nextInt();
        double[] next=new double[a];

        System.out.println("Enter "+a+" number: ");
        for(int x=0;x<a;x++) {
            next[x]=s.nextDouble();

        }
        double b = Median1(a,next);
        System.out.println("Median is :"+b);
    }
    static double Median1(int e,double in[]){

        double c=0;
        if(e%2==1) {
            c=in[((e+1)/2)-1];
        }
        else {
            c=(in[e/2-1]+in[e/2])/2;
        }
        return c;
    }
}