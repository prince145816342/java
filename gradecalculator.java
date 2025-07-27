import java.sql.SQLOutput;
import java.util.Scanner;

public class gradecalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" welcome to the grade calculator ");
        System.out.println(" please enter the marks that you get in the exam : ");
        double marks = input.nextDouble();

        if (marks >= 90){
            System.out.println(" congratulation you get A Grade ");

        }else if (marks >=75  ){
            System.out.println(" well done you got B Grade ");

        } else if ( marks >= 60  ){
            System.out.println(" bravo! you get c Grade ");

        }else if ( marks >= 30  ){
            System.out.println(" improvement needed you got d grade");

        }else {
            System.out.println(" keep trying , you get failed ");
        }
    }
}
