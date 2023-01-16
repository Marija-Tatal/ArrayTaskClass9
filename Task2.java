package Class9.ArrayTask;

public class Task2 {
    public static void main(String[] args) {

        String [] names={"Slava","Safi","Marija","Jason","Ana"};
        System.out.println(names[2]);

        System.out.println("*******************************");
        for (int i = 0; i < names.length ; i++) {
            if(i==2){
                System.out.println(names[i]);
            }

        }

    }
}
