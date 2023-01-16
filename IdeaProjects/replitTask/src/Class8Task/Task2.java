package Class8Task;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        for (int i = 1; i <=10; i++) {
            System.out.println("Do you Want to apply for credit card?");
            boolean card= input.nextBoolean();
            if (card){
               break;
            }
            System.out.println(" ");
        }


    }
}

