public class Dice {
    private static int[] faceValues;

    static {
        faceValues = new int[6];
        for (int i = 0; i < 6; i++) {
            faceValues[i] = i + 1;   // needs a loop — can't do this in one inline expression
        }
        System.out.println("Dice faces initialized once for the whole program.");
    }
    public static void main(String[] args){
        // Dice d1 = new Dice();
        // Dice d2 = new Dice();
        // Dice d3 = new Dice();

        

    }
}