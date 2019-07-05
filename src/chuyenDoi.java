import java.util.Scanner;
public class chuyenDoi {
    public static void main(String[] args) {
        double exchangeRate = 23000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tien:");
        double USD = sc.nextDouble();
        double VND = USD*exchangeRate;
        System.out.println("Tien quy doi sang VND: "+VND);
    }
}
