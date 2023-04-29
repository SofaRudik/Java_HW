
import java.util.Scanner;

public class task1_3 {
    
    public static void main(String[] args) {
        System.out.printf("Введите число: ");
        Scanner iScanner = new Scanner(System.in);
        int i = iScanner.nextInt();
        System.out.printf("Факториал числа = %d\n", getFactorial(i));
        iScanner.close();

        public static int getFactorial(int f) {
            int result = 1;
            for (int i = 1; i <= f; i++) {
               result = result * i;
            }
            return result;
          }
    }
}     
