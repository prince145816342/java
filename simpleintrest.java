import java.util.Scanner;

public class simpleintrest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" welcome to simple intrest calcuator : ");
        System.out.println(" enter the principle amount rs : ");
        double principle = input.nextDouble();
        System.out.println(" enter the rate of the amount : ");
        float rate = input.nextFloat();
        System.out.println(" enter the time of the interst : ");
        double time = input.nextDouble();

        double interest = (principle * rate * time )/100 ;

        System.out.println(" the simple interest of the amount is : "+ interest);
        double amount = principle + interest ;
        System.out.println(" the amount is: "+ amount);

    }
}
