public class breakandcontinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("=================");
        for (int k = 0; k < 10; k++) {
            if (k == 4) {
                continue;// ngung ngay tai do thoi chu van tiep tuc vong for
            }
            System.out.println(k);

        }
    }
}
