package Class9.ArrayTask;

import java.lang.ref.Cleaner;

public class Task1 {
    public static void main(String[] args) {
        char [] letters = {'A', 'B', 'C', 'D', 'E', 'F'};

        System.out.println(letters[1]);


        System.out.println("******************************");

        for (int i = 0; i <letters.length ; i++) {
            if(i==1)
            System.out.println(letters[i]);

        }
    }

    }

