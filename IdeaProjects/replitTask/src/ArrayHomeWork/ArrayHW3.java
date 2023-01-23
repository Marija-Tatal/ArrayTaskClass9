package ArrayHomeWork;

import java.util.Scanner;

public class ArrayHW3 {
    public static void main(String[] args) {
       int[][] num={{2,4,6,8,10},{3,5,7,9},{12,14,15,13}};
       int sum=0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j <num[i].length ; j++) {
                sum+=num[i][j];
                System.out.println(num[i][j]);

            }

        }
        System.out.println(sum);


    }

}
