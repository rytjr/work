import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int count = 0;

        int[] arr = new int[n1];

        for(int i = 0; i < n1; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = n1 - 1; i >= 0; i--) {
            count += n2/arr[i];
            n2 = n2 % arr[i];
        }

        System.out.print(count);


    }

}