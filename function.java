import java.util.Scanner;

public class function {
    public static void main(String[] args) {
    addition();

    }
    public static int addition() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the  number :");
        int a = input.nextInt();
        int b = input.nextInt();
        return a+b ;

    }
}
