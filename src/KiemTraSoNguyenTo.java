import java.util.Scanner;

public class KiemTraSoNguyenTo {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Nhap vao mot so");
        // int snt = sc.nextInt();
        // int temp = 0;
        // for (int i = 1; i <= snt; i++) {
        // if (snt % i == 0) {
        // temp++;
        // }
        // }
        // if (temp == 2) {
        // System.out.printf("%d la so nguyen to\n", snt);

        // } else {
        // System.out.printf("%d khong phai la so nguyen to\n", snt);
        // }
        // sc.close();
        // }
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mot so");

        // Thêm kiểm tra đầu vào để tránh lỗi InputMismatchException
        if (sc.hasNextInt()) {
            int snt = sc.nextInt();
            int temp = 0;

            for (int i = 1; i <= snt; i++) {
                if (snt % i == 0) {
                    temp++;
                }
            }

            if (temp == 2) {
                System.out.printf("%d la so nguyen to\n", snt);
            } else {
                System.out.printf("%d khong phai la so nguyen to\n", snt);
            }
        } else {
            System.out.println("Vui long nhap mot so nguyen hop le.");
        }

        sc.close();
    }
}
