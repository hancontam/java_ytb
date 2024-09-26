import java.util.Arrays;
import java.util.Scanner;

public class ThaoTacVoiMangSoNguyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so luong phan tu cua mang");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap lan luot tung phan tung cua mang");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        System.out.println("mang da sap xep" + Arrays.toString(arr));
        int max = arr[n - 1]; // so lon nhat la phan tu cuoi cung sau khi sort
        int min = arr[0]; // so nho nhat la phan tu cuoi cung sau khi sort
        System.out.println("phan tu lon nhat trong mang la " + max);
        System.out.println("phan tu lon nhat trong mang la " + min);
        sc.close();
    }
}
