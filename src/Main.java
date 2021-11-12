import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ProductRepository productList = new ProductRepository();
        productList.products = productList.getData();

        System.out.println("1. In thông tin dựa trên danh mục ");
        System.out.println("2. In thông tin các sản phẩm dựa theo hãng");
        System.out.println("3. In thông tin sản phẩm dựa trên mức giá và danh mục.");
        System.out.println("4. Nhập vào một chuỗi bất kỳ và in ra các sản phẩm có tên tương tự chuỗi đó");
        System.out.print("Nhập lựa chọn: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                productList.cau1(productList.products);
                break;
            case 2:
                productList.cau2(productList.products);
                break;
            case 3:
                productList.cau3(productList.products);
                break;
            case 4:
                productList.cau4(productList.products);
                break;
        }
    }
}
