package ArrayHomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayHW2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter countries : ");
        String[]countries={" Germany "," USA "," France "," Turkey "};
        for (int i = 0; i < countries.length; i++) {
            countries[i]=input.next();
            System.out.println("Enter the capital of the country");
            String capital=input.next();
            System.out.println("The capital of "+countries[i]+" is "+capital);

        }



    }

}
