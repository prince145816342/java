import java.util.Scanner;

public class sumofdigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the sum of digit");
        System.out.println("enter the number");
        int num = input.nextInt();
        int sum = digit(num);
        System.out.println(" the sum of the digit : "+ sum);

    }
    public static int digit (int num){
        int sum = 0;

        while ( num > 0  ){
            sum = sum + (num % 10);
            num = num /10 ;

        }


        return sum;
    }
}
