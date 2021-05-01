package JavaBasic;

public class GenerateTables {


    public static void main(String[] args) {

        int data[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(data[j] + " ");
            }
            System.out.println();

        }
    }

}



