package Day6;
import java.util.Arrays;
import java.util.Scanner;
public class Prog_3_4 {
	public static void main(String[] args) {
        // Step 1: Store product names in an array
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] products = new String[n];
        for(int i = 0; i<n;i++) {
        	products[i] = sc.nextLine();
        }
        
        Arrays.sort(products);

        System.out.println("Sorted Product Names:");
        for (String product : products) {
            System.out.println(product);
        }
    }
}
