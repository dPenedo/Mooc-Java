import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        double giftValue = Double.valueOf(scan.nextLine());
        double tax1 = (100 + (giftValue - 5000) * 0.08);
        double tax2 = (1700 + (giftValue - 25000) * 0.1);
        double tax3 = (4700 + (giftValue - 55000) * 0.12);
        double tax4 = (22100 + (giftValue - 200000) * 0.15);
        double tax5 = (142100 + (giftValue - 1000000) * 0.17);

        if (giftValue < 5000) {
            System.out.println("No tax!");
        } else if (giftValue >= 5000 && giftValue < 25000) {
            System.out.println("Tax:" + tax1);
        } else if (giftValue >= 25000 && giftValue < 55000) {
            System.out.println("Tax:" + tax2);
        } else if (giftValue >= 55000 && giftValue < 200000) {
            System.out.println("Tax:" + tax3);
        } else if (giftValue >= 200000 && giftValue < 1000000) {
            System.out.println("Tax:" + tax4);
        } else if (giftValue >= 1000000) {
            System.out.println("Tax:" + tax5);
        }
    }
}
