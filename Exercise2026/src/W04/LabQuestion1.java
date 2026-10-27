import java.util.Scanner;

public class LabQuestion1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the first number");
        int firstNumber = input.nextInt();
        input.nextLine();
        System.out.println("Input the second number");
        int secondNumber = input.nextInt();
        input.nextLine();
        System.out.println("Choose operator +, -, * or /");
        char operator = input.next().charAt(0);
        switch (operator){
            case '+' -> System.out.println(firstNumber + secondNumber);
            case '-' -> System.out.println(firstNumber - secondNumber);
            case '*' -> System.out.println(firstNumber * secondNumber);
            case '/' -> System.out.println(firstNumber / secondNumber);
            default -> System.out.println("Invalid operator ");
        }
    }
}
