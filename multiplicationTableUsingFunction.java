import java.util.Scanner;

public class multiplicationTableUsingFunction {
    public static void main(String[] args) {
    int n = table();
    int i= 0 ;
    while(i<=10){
        System.out.println(n*i);
        i++;
    }

    }
    public static int table(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the table that you wanted to print ");
        int n = input.nextInt();
        return n;
    }

}
