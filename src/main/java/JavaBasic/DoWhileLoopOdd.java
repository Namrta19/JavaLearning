package JavaBasic;

public class DoWhileLoopOdd {
    public static void main(String[] args) {
        int a = 1;

        System.out.println("0dd number");

        do {

            if (a % 2 != 0) 
            {
                System.out.println(" " + a);
            }
            a++;
        } while (a <= 20);
    }
}




