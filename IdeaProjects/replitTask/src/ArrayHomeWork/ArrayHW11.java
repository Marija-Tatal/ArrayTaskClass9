package ArrayHomeWork;

public class ArrayHW11 {

    public static void main(String[] args) {
        String[] input = {"hello", "world", "hello", "masha", "judi", "java"};
        for (int i = 0; i < input.length-1; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i].equals(input[j]) &&  (i != j)) {

                    System.out.print(input[i]);


                }


            }
        }
    }
}



