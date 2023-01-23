package ArrayHomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class OODHW4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] values=new int[6];
        int sum=0;
        for (int i = 0; i < values.length ; i++) {
            System.out.println("Please enter the "+"integer values of the array");
            values[i]=input.nextInt();
            sum+=values[i];

        }
        System.out.println(Arrays.toString(values));
        System.out.println("The sum of the valuse if:"+sum);
    }
}
