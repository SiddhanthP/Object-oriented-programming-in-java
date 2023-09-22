import java.util.*;

class Switch {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the Operator (+,-,*,/) : ");
        char operator = inp.next().charAt(0);
        System.out.println("Enter the First Operand : ");
        double first = inp.nextDouble();
        System.out.println("Enter the Second Operand : ");
        double second = inp.nextDouble();
        double result = 0;
        switch (operator) {
            case '+':
                result = first + second;
                System.out.println("The Result is : " + first + " " + operator + " " + second + " = " + result);
                break;
            case '-':
                result = first - second;
                System.out.println("The Result is : \n " + first + " " + operator + " " + second + " = " + result);
                break;
            case '*':
                result = first * second;
                System.out.println("The Result is : " + first + " " + operator + " " + second + " = " + result);
                break;
            case '/':
                result = first / second;
                System.out.println("The Result is : \n " + first + " " + operator + " " + second + " = " + result);
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }
    }
}