import java.util.Scanner;
public class AreaofaRectangle {
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the length");
       double length=sc.nextDouble();
       System.out.print("enter the breadth");
       double breadth=sc.nextDouble();
       double area=length*breadth;
       System.out.println("area of the rectangle is: "+area);
    }
}
