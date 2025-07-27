import java.util.Scanner;
public class areaofrectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the lenght of the rectangle: ");
        int lenght = input.nextInt();
        System.out.println("please enter the bredth of the rectangle : ");
        int bredth = input.nextInt();
        int area = lenght * bredth ;

        System.out.println("the area of the rectangle is : "+ area );
    }
}
