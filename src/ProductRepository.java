import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ProductRepository {
    ArrayList<Product> products;

    public ArrayList<Product> getData() {
        products = new ArrayList<>();
        products.add(new Product("1", "Tai nghe", "Ghi chu", 1000000, 22, 3, "Company 1", Product.Category.ACCESSORY));
        products.add(new Product("2", "Iphone 6", "Ghi chu", 12000000, 42, 10, "APPLE", Product.Category.APPLE));
        products.add(new Product("3", "Iphone 7", "Ghi chu", 1400000, 12, 6, "APPLE", Product.Category.APPLE));
        products.add(new Product("4", "Iphone 12", "Ghi chu", 18000000, 22, 3, "APPLE", Product.Category.APPLE));
        products.add(new Product("5", "Note 7", "Ghi chu", 18000000, 72, 43, "Samsung", Product.Category.PHONE));
        products.add(new Product("6", "HP Envy 15", "Ghi chu", 20000000, 12, 9, "HP", Product.Category.LAPTOP));
        products.add(new Product("7", "HP Envy 17", "Ghi chu", 21000000, 15, 15, "HP", Product.Category.LAPTOP));
        products.add(new Product("8", "Samsung S9", "Ghi chu", 24000000, 22, 9, "Samsung", Product.Category.PHONE));
        products.add(new Product("9", "Airpod", "Ghi chu", 8000000, 92, 78, "Apple", Product.Category.ACCESSORY));
        products.add(new Product("10", "Airpod Pro", "Ghi chu", 10000000, 47, 45, "Apple", Product.Category.ACCESSORY));
        products.add(new Product("11", "Dell 20", "Ghi chu", 26000000, 2, 0, "Dell", Product.Category.LAPTOP));

        return products;
    }

    public void cau1(ArrayList<Product> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Có 4 danh mục: 1. Điện thoại, 2. Laptop, 3. Appe, 4. Phụ kiện: ");
        int temp = sc.nextInt();
        List<Product.Category> typeArray = Arrays.asList(Product.Category.values());
        for (Product p : list) {
            if (typeArray.get(temp - 1) == p.type) {
                System.out.println(p);
            }
        }
    }

    public void cau2(ArrayList<Product> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên hãng: ");
        String temp = sc.nextLine();
        for (Product p : list) {
            if (temp.equals(p.company)) {
                System.out.println(p);
            }
        }
    }

    public void cau3(ArrayList<Product> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Có 4 danh mục: 1. Điện thoại, 2. Laptop, 3. Appe, 4. Phụ kiện: ");
        int tempCategory = sc.nextInt();
        System.out.print("\nCó 5 mức giá: \n1. Dưới 2 triệu, \n2. Từ 2 - 4 triệu, \n3. Từ 4 - 7 triệu, \n4. Từ 7 - 13 triệu, \n5. Trên 13 triệu\n");
        System.out.print("Nhập mức giá: ");
        int tempPrice = sc.nextInt();
        List<Product.Category> typeArray = Arrays.asList(Product.Category.values());
        for (Product p : list) {
            if (typeArray.get(tempCategory - 1) == p.type) {
                switch (tempPrice) {
                    case 1:
                        if (p.price < 2000000) {
                            System.out.println(p);
                        }
                        break;
                    case 2:
                        if (p.price >= 2000000 && p.price < 4000000) {
                            System.out.println(p);
                        }
                        break;
                    case 3:
                        if (p.price >= 4000000 && p.price < 7000000) {
                            System.out.println(p);
                        }
                        break;
                    case 4:
                        if (p.price >= 7000000 && p.price < 13000000) {
                            System.out.println(p);
                        }
                        break;
                    case 5:
                        if (p.price > 13000000) {
                            System.out.println(p);
                        }
                        break;
                }
            }
        }
    }

    public void cau4(ArrayList<Product> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String searchParam = sc.nextLine();
        list.removeIf(product -> !product.name.contains(searchParam));
        for (Product p : list) {
            System.out.println(p);
        }
    }
}
