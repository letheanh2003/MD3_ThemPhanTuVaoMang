import java.util.Arrays;
import java.util.Scanner;

public class BT2_ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] array = {2, 4, 64, 7, 8, 11, 15, 0, 0};
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập phần tử muốn xóa: ");
        int X = input.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (X == array[i]) {
                array[i] = 0;
                System.out.print((array[i]) + ",");
            } else {

                System.out.print((array[i]) + ",");
            }
        }
    }
}