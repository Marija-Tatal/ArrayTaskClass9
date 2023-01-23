package ArrayHomeWork;
import java. util.Arrays;
public class ArrayHW5 {
    public static void main(String[] args) {

       int[][] num={{2,4,6,8,10},{3,5,7,9}};

       int sum1=0;
       int sum2=0;

        for (int i = 0; i <num.length ; i++) {
            for (int j = 0; j<num[i].length; j++) {
                if(num[i][j]%2==0){
                    System.out.println(sum1+=num[i][j]);
                } else if (num[i][j]%2!=0) {
                    System.out.println(sum2+=num[i][j]);

                }


            }

        }
        System.out.println("The sum even "+sum1);
        System.out.println("The sum odd"+sum2);
        System.out.println("The sum even and odd is :"+(sum1+sum2));
        }



}
