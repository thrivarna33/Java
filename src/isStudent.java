import java.util.Scanner;
public class isStudent {
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Are you a student?");
    String answer=sc.nextLine();
    if(answer.equalsIgnoreCase("yes"))
    {
        System.out.println("You are a student!");
    }
    else {
        System.out.println("you are not a student!");
    }
}
}
