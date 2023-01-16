package Class9.ArrayTask;

public class Task5 {
    public static void main(String[] args) {
        int [] number = {5,15,15,20,25,30,35,40,45,50,55,60,65,70};
        int sum=0;
        for (int i = 0; i <number.length ; i++) {
            sum+=number[i];
        }
        System.out.println(sum);
    }
}
