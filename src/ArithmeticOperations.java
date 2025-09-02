import java.util.Scanner;
public class ArithmeticOperations {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int add;
        int sub;
        int mul;
        int div;
        int mod;
        System.out.println("enter the first number");
        int firstNum=sc.nextInt();
        System.out.println("enter the second number");
        int secondNum=sc.nextInt();
        add=firstNum+secondNum;
        sub=firstNum-secondNum;
        mul=firstNum*secondNum;
        div=firstNum/secondNum;
        mod=firstNum%secondNum;
        System.out.println("Addition: "+add+"\n"+"subtraction: "+sub+"\n"+"Multiplication:"+mul+"\n"+"division:"+div+"\n"+"modulus:"+mod);
        sc.close();

    }
}
