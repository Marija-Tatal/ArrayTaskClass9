package OOPHomeWork;

public class D2ArraysTask5 {
    public static void main(String[] args) {

        int[][] numb={{1,2,3,4,5},{6,7,8,9,},{10,11,12,13}};

        int sum=0;
        for (int i = 0; i < numb.length; i++) {
            for (int j = 0; j <numb[i].length ; j++) {
                sum+=numb[i][j];


            }
            System.out.println(sum+" ");
        }

    }
}
