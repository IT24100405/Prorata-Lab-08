import java.util.Scanner;

public class IT24100405Lab8Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[6];
        int i = 0;
        
        while (i < 6) {
            System.out.print("Enter a Positive Number (" + (i + 1) + "/6): ");
            int number = scanner.nextInt();
            
            if (number <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                array[i] = number;
                i++;
            }
        }
        
        System.out.println("Array Contents:");
        for (int j = 0; j < 6; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.println();
        
        int max = array[0];
        for (int j = 1; j < 6; j++) {
            if (array[j] > max) {
                max = array[j];
            }
        }
        
        System.out.println("The Maximum Number Entered: " + max);
        
        scanner.close();
    }
}