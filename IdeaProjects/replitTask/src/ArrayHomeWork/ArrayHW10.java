package ArrayHomeWork;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class ArrayHW10 {
    public static void main(String[] args) {

       int largest=0;
       int secondLargest=0;
       int[]arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            } else if (arr[i]>secondLargest) {
                secondLargest=arr[i];

            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println("The second largest number is:"+secondLargest);
    }
}



