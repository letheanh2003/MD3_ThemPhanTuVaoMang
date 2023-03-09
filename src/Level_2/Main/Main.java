package Level_2.Main;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // input => arr(length)

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai array: ");
        int arrayLength = sc.nextInt();
        int[] arr = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Nhap phan tu: " + i);
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Nhap gia tri muon them vao: ");
        int[] newArr = new int[arrayLength + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        // arr {0,1,2,3} 4
        newArr[newArr.length - 1] = sc.nextInt();
        System.out.println(Arrays.toString(newArr));
        // them phan tu => nhap => length = arraylength +  1 => them no vao cuoi => in ra
    }
}

