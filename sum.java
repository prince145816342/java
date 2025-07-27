import java.util.Scanner;
 class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("sum calculator: ");
        System.out.println("enter the first number: ");
        int first = input.nextInt();
        System.out.println("enter the second number: ");
        int second = input.nextInt();
        int addition = first + second ;
        System.out.println(" the sum of the number is : " + addition);
        
    }
}
