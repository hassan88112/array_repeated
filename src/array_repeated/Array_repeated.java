package array_repeated;

import java.util.Scanner;

public class Array_repeated {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int arr[] = {0, 3, 4, 2, 1, 0};

        int sum = 0;

        for (int i = 0; i < 6; i++) {

            sum += arr[i];
        }
        int res = (4 * (4 + 1)) / 2;
        System.out.println(sum - res);

    }

}
