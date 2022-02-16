import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        char operator;
        int number2;
        int result=0;
        System.out.print("please enter the first number :");
        int number1= scanner.nextInt();
        System.out.print("please enter the operator :");
        operator=scanner.next().charAt(0);
        System.out.print("please enter the second number :");
        number2= scanner.nextInt();
        System.out.println(number1+" "+operator+" "+number2);
        if(operator=='+')
           result=number1 + number2;
        else if (operator=='-')
            result=number1-number2;
        else if(operator=='*')
            result=number1*number2;
        else if(operator=='/')
            result=number1/number2;
        else if(operator=='%')
            result=number1%number2;
        else
            System.out.println("invalid input");

        System.out.println(result);


    }
}
