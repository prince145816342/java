import java.util.Scanner;

public class Week4 {
    private int n;
    private int fact;
    private int terms;
    private int firstTerm;
    private int secondTerm;
    private int nextTerm;

    public void setN(int n){
        this.n = n;
    }

    public void setFact(int fact){
        this.fact = fact;
    }

    public void setTerms(int terms){
        this.terms = terms;
    }

    public void setFirstTerm(int firstTerm){
        this.firstTerm = firstTerm;
    }

    public void setSecondTerm(int secondTerm){
        this.secondTerm = secondTerm;
    }

    public void setNextTerm(int nextTerm){
        this.nextTerm = nextTerm;
    }

    public int getN(){
        return n;
    }

    public int getFact(){
        return fact;
    }

    public int getTerms(){
        return terms;
    }

    public int getFirstTerm(){
        return firstTerm;
    }

    public int getSecondTerm(){
        return secondTerm;
    }

    public int getNextTerm(){
        return nextTerm;
    }

    public static void main(String[] args) {
        Week4 math = new Week4();
        Scanner sc = new Scanner(System.in);
        int n = 0;

        while (n != 6) {
            System.out.println("Welcome to the Math Operations Program!");
            System.out.println("1. Calculate factorial");
            System.out.println("2. Generate Fibonacci series");
            System.out.println("3. Check even or odd");
            System.out.println("4. Check Leap Year");
            System.out.println("5. Swap two Numbers");
            System.out.println("6. Exit");
            System.out.println(" ");
            System.out.println("Enter Your Choice");
            n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Enter the number to calculate Factorial:");
                    int a = sc.nextInt();
                    math.setFact(1);
                    for (int i = 1; i <= a; i++) {
                        math.setFact(math.getFact() * i);
                    }
                    System.out.println("Factorial of " + a + " is " + math.getFact());
                    break;
                case 2:
                    System.out.println("Enter the number of terms for Fibonacci series:");
                    int terms = sc.nextInt();
                    math.setTerms(terms);
                    math.setFirstTerm(0);
                    math.setSecondTerm(1);
                    System.out.println("Fibonacci Series:");
                    System.out.print(math.getFirstTerm() + " " + math.getSecondTerm() + " ");
                    for (int i = 3; i <= terms; i++) {
                        math.setNextTerm(math.getFirstTerm() + math.getSecondTerm());
                        System.out.print(math.getNextTerm() + " ");
                        math.setFirstTerm(math.getSecondTerm());
                        math.setSecondTerm(math.getNextTerm());
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Enter a number to Check odd or even:");
                    int b = sc.nextInt();
                    if (b % 2 == 0) {
                        System.out.println(b + " is Even");
                    } else {
                        System.out.println(b + " is odd");
                    }
                    break;
                case 4:
                    System.out.println("Enter a Year to Check leap Year:");
                    int year = sc.nextInt();
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        System.out.println(year + " is a leap year");
                    } else {
                        System.out.println(year + " is not a leap year");
                    }
                    break;
                case 5:
                    System.out.println("Enter The First Number:");
                    int first_number = sc.nextInt();
                    System.out.println("Enter Second Number:");
                    int second_number = sc.nextInt();

                    first_number = first_number + second_number;
                    second_number = first_number - second_number;
                    first_number = first_number - second_number;

                    System.out.println("After swapping, first number is: " + first_number + " and second number is: " + second_number);
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
            System.out.println(" ");
        }
    }
}
