import java.util.*;

public class ProductRepository {
    ArrayList<Product> products;
    HashMap<Integer, Product> productHashMap;

    public void getData() {
        products = new ArrayList<>();
        productHashMap = new HashMap<>();

//        Collections homework
        productHashMap.put(1, new Product("1", "Tai nghe", "Ghi chu", 1000000, 22, 3, "Company 1", Product.Category.ACCESSORY));
        productHashMap.put(2, new Product("2", "Iphone 6", "Ghi chu", 12000000, 42, 10, "APPLE", Product.Category.APPLE));
        productHashMap.put(3, new Product("3", "Iphone 7", "Ghi chu", 1400000, 12, 6, "APPLE", Product.Category.APPLE));
        productHashMap.put(4, new Product("4", "Iphone 12", "Ghi chu", 18000000, 22, 3, "APPLE", Product.Category.APPLE));
        productHashMap.put(5, new Product("5", "Note 7", "Ghi chu", 18000000, 72, 43, "Samsung", Product.Category.PHONE));
        productHashMap.put(6, new Product("6", "HP Envy 15", "Ghi chu", 20000000, 12, 9, "HP", Product.Category.LAPTOP));
        productHashMap.put(7, new Product("7", "HP Envy 17", "Ghi chu", 21000000, 15, 15, "HP", Product.Category.LAPTOP));
        productHashMap.put(8, new Product("8", "Samsung S9", "Ghi chu", 24000000, 22, 9, "Samsung", Product.Category.PHONE));
        productHashMap.put(9, new Product("9", "Airpod", "Ghi chu", 8000000, 92, 78, "APPLE", Product.Category.ACCESSORY));
        productHashMap.put(10, new Product("10", "Airpod Pro", "Ghi chu", 10000000, 47, 45, "APPLE", Product.Category.ACCESSORY));
        productHashMap.put(11, new Product("11", "Dell 20", "Ghi chu", 26000000, 2, 0, "Dell", Product.Category.LAPTOP));

//        FPTSHOP homework
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

    }

    public void cau1(ArrayList<Product> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("C?? 4 danh m???c: 1. ??i???n tho???i, 2. Laptop, 3. Appe, 4. Ph??? ki???n: ");
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
        System.out.print("Nh???p t??n h??ng: ");
        String temp = sc.nextLine();
        for (Product p : list) {
            if (temp.equals(p.company)) {
                System.out.println(p);
            }
        }
    }

    public void cau3(ArrayList<Product> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("C?? 4 danh m???c: 1. ??i???n tho???i, 2. Laptop, 3. Appe, 4. Ph??? ki???n: ");
        int tempCategory = sc.nextInt();
        System.out.print("\nC?? 5 m???c gi??: \n1. D?????i 2 tri???u, \n2. T??? 2 - 4 tri???u, \n3. T??? 4 - 7 tri???u, \n4. T??? 7 - 13 tri???u, \n5. Tr??n 13 tri???u\n");
        System.out.print("Nh???p m???c gi??: ");
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
        System.out.print("Nh???p chu???i: ");
        String searchParam = sc.nextLine();

        list.removeIf(product -> !product.name.toLowerCase().contains(searchParam.toLowerCase()));
        for (Product p : list) {
            System.out.println(p);
        }
    }

    public void cau5(HashMap<Integer, Product> list) {
        List<Product.Category> typeArray = Arrays.asList(Product.Category.values());
        for (Product.Category category: typeArray) {
            System.out.print("\n" + category + " : ");
            Long sum = list.values().stream().filter(product -> product.getType() == category).count();
            System.out.println(sum);
            list.values().stream().filter(product -> product.getType() == category).forEach(System.out::println);
        }
    }

    public void cau6(HashMap<Integer, Product> list) {
        HashSet<String> companies = new HashSet<>();
        for (Product product : list.values()) {
            companies.add(product.getCompany());
        }
        for (String company : companies) {
            int count = 0;
            for (Product product : list.values()) {
                if (product.getCompany() == company) {
                    count++;
                }
            }
            System.out.println(company + ": " + count);
        }
    }

    public void cau7(HashMap<Integer, Product> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nh???p chu???i: ");
        String searchParam = sc.nextLine();

        list.entrySet().removeIf(product -> !product.getValue().getName().toLowerCase().contains(searchParam.toLowerCase()));
        System.out.println("So san pham tim duoc: " + list.size());
        for (Product p : list.values()) {
            System.out.println(p);
        }
    }
}
