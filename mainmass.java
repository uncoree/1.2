import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10]; 

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int even = 0;
        int odd = 0;
        int moreZero = 0;
        int lessZero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            if (arr[i] > 0) {
                moreZero++;
            }

            if (arr[i] < 0) {
                lessZero++;
            }
        }

        System.out.println(even);
        System.out.println(odd);
        System.out.println(moreZero);
        System.out.println(lessZero);
    }
}

