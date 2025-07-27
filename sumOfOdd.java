import java.util.Scanner;

public class sumOfOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the sum of odd number calculator ");
        System.out.println("enter the no till you wanted to print: ");
        int num = input.nextInt();
       int sum =  oddno(num);
        System.out.println(sum);


    }
    public static int oddno(int num ){
        int sum = 0;
        int i = 1;
        while (i <= num){

            sum = sum + i;
            i = i+2;

        }
        return sum;

    }
}
