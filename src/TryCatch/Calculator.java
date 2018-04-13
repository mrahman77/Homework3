package TryCatch;
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int num =1;

        do {
            try {
                System.out.println("Enter the First number:");
                int n1 = scanner.nextInt();
                System.out.println("Enter the Second number:");
                int n2 = scanner.nextInt();
                int sum = n1 / n2;
                System.out.println("Answer is: "+sum);
                num =2;
            } catch (Exception e) {
                System.out.println("Numbers Error, Can't do that!");
            }
        }while (num ==1);

    }
}
