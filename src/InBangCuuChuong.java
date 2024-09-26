import java.util.Scanner;

public class InBangCuuChuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mot so nguyen duong");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d * %d = %d\n", n, i, n * i);
            }

        } else {
            System.out.println("so nguyen duong khong hop le");
        }
        sc.close();
    }
}
