package OOPHomeWork;

public class D2ArraysTask {
    public static void main(String[] args) {
        // Using 2D array create a grocery list.
        //Inside you should have an array of veggies, fruits, dairy and sweets.
        // Retrieve all values from that array using 2 different loops

        String[][] veggiesListandsweets={{"Cucmber","onion","Potatoes","Raddish"},
                {"Mangoes0","Apples","Bananas","orangeres","Pears" },
                {"Cheese","Milk","Yougart"},};
        for (int i = 0; i < veggiesListandsweets.length; i++) {
            for (int j = 0; j < veggiesListandsweets[i].length ; j++) {
                System.out.println(veggiesListandsweets[i][j]+" ");

            }
            System.out.println();
        }

    }
}
