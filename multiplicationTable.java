import java.util.Scanner;

public class multiplicationTable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" welcome to table calculator");
        System.out.println(" print the table that you wanted to print : ");
        int n = input.nextInt();

        int i = 1 ;
        while ( i <= 10){
            System.out.println( n+"*"+ i + "="+ n*i);
            i++;
        }
    }
}
