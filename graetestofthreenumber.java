import java.util.Scanner;

public class graetestofthreenumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to gratest number calculator ");
        System.out.println(" enter the first number: ");
        int first = input.nextInt();
        System.out.println("enter the second number :  ");
        int second = input.nextInt();
        System.out.println("finally enter the third number : ");
        int third = input.nextInt();

        if ( first >= second && first >= third){
            System.out.println(first + " is the greatest one");

        }else if (second >= third ){
            System.out.println(second + " is the greatest one ");

    }else {
            System.out.println("third is the gratest one ");
        }
    }
}
