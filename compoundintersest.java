

import java.util.Scanner;
public class compoundintersest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the compound interest calculator ");
        System.out.println(" enter the principle amount : ");
        double  principle = input.nextDouble();
        System.out.println(" enter the rate of the amount:" );
        double rate = input.nextDouble();
        System.out.println("enter the time of the amount : ");
        double time = input.nextDouble();
        double interest = principle * Math.pow(( 1+ rate / 100),time);
        System.out.println(" the compound interest of the sum is : " + interest );
        double amount = principle + interest ;
        System.out.println(" the amount is : " + amount);



    }

}
