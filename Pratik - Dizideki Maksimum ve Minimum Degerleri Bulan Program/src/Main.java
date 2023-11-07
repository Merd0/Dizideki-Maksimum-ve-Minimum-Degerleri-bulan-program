import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Size of array :");
        int n = inp.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements in the array :");

        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        for (int i : arr) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Minimum Value :" + min );
        System.out.println("Maximum Value :" + max );

    }
}
  //  Dizideki Maksimum ve Minimum Degerleri bulan program