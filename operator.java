import java.util.Scanner;
public class operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the age of the person");
        int age = input.nextInt();
        boolean isFemale = input.nextBoolean();
        if ( age < 5){
            System.out.println("75 persent discount unlocked");
        }else if ( isFemale && age >= 5){
            System.out.println("50 persent discount will be available");

        } else {
            System.out.println("no discoutnt will be available");
        }
    }

}
