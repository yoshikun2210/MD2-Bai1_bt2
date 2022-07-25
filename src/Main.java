import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chuyển đổi tiền tệ");
        int tien = 23000;
        System.out.println("Nhập số tiền");
        int USD = scanner.nextInt();
        int VND = USD * tien;
        System.out.printf("%d USD = %d VND",USD,VND);
    }

}

