import java.util.Arrays;
import java.util.Scanner;

public class demSLsinhVienThiDo {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        int[] arr;
        do {
            System.out.print("Nhập độ dài mảng:");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("Số lượng sinh viên ");
            }
        } while (size > 30);
        arr = new int[size];
        int i = 0;
        while (i < args.length) {
            System.out.print("Nhập điểm học sính thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        System.out.print("Danh sách điểm thi : ");
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length; j++) {
            if (arr[i] >= 5) {
                count++;
            }
        }
        System.out.println("Số học sinh thi đỗ là: " + count);

    }
}
