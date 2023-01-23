package ArrayHomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayHW {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 5 numbers:");
        int[] values=new int[5];
        int sum=0;
        for (int i = 0; i < values.length ; i++) {
            values[i]=input.nextInt();
            sum+=values[i];

        }
        System.out.println(Arrays.toString(values));
        System.out.println("The sum of the valuse if:"+sum);
    }
}
