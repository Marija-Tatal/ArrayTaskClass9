package Class9.ArrayTask;

public class Task6 {
    public static void main(String[] args) {
        String[] country={ " Serbia " , " USA ", " Germany ", " France ", " Turkey "};
        String [] capital={" Belgrade ", " Washington ", " Berlin ", " Paris ", " Ankara" };
        for (int i = 0; i < country.length ; i++) {
            for (int j = 0; j <capital.length ; j++) {
                System.out.println(country[i] + capital[j]);
                i++;
            }



        }

    }
}
