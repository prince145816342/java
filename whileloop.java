import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);
        System.out.println("enter the first number");
        int i = 1;
        while ( i < 10){

            int inp = input.nextInt();
            System.out.println("the number is: "+ inp);
            i += 1;
        }
    }
}
