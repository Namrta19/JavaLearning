package JavaBasic;

public class DoWhileLoopTable {
    public static void main(String []args) {
        int n =1;
        int m =8 ;

        System.out.println("Table of 8");

        do {
            System.out.println(m + "*" + n + "=" + (m * n));
            n++;
        }
        while(n <=10);
        }
}
