package ArrayHomeWork;

public class ArrayHW7 {
    public static void main(String[] args) {

        int num=29;
        boolean prime=true;
        for (int i = 2; i < num ; i++) {
            if (num%1==0){
                prime=false;
                break;
            }

        }

        System.out.println(prime);



    }
}

