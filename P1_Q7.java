import java.util.Scanner;
public class Main{
    private static final String string = " ";
    public static void main(String[] args){
        int number = 0;
    for (int row = 0; row <= 7; row++) {
        for (int column = 1; column <= 7 - row; column++) {
            System.out.printf("%4s", string);
        }
        for (int column = 0; column <= row; column++) {
            number = (int) Math.pow(2, column);
            System.out.printf("%4d", number);
        }
        for (int column = row - 1; column >= 0; column--) {
            number = (int) Math.pow(2, column);
            System.out.printf("%4d", number);
        }
        System.out.println();
        }
    }
}
