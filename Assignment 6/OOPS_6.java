import java.util.Scanner;
public class OOPS_6 {
    public static void main(String[] args) {
        int num1, num2, result;
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter The First Number: ");
            num1 = Integer.parseInt(in.next());
            System.out.println("Enter The Second Number: ");
            num2 = Integer.parseInt(in.next());
            result = num1 / num2;
            System.out.println("Division: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Denominator is ZERO..." + e);
        } catch (NumberFormatException e) {
            System.out.println("Input Is WRONG..." + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                    "Trying to store resuit in the Array for which index does not exist (ArrayIndexOutOfBoundsException)");
        }
    }
}