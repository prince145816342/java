public class patternusingwhileloop {
    public static void main(String[] args) {
        int rows = 0;
        while ( rows < 5 ){
            System.out.print("*");
            int i =4;
            while( i > rows){
                System.out.print("*");
                i= i-1;
            }
            System.out.println();
            rows++;
        }

    }
}
