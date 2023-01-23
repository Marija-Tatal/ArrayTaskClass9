package ArrayHomeWork;

public class ArrayHW4 {
    public static void main(String[] args) {
       int[][] numbers={{2,4,3,8},{10,5,7,9}};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {

               if(numbers[i][j]%2==0){
                   System.out.println(numbers[i][j]);

               }

            }

        }

    }

}
