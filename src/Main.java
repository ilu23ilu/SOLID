import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws  ArrayIndexOutOfBoundsException {
        Shop shop = new Shop();
        shop.printItem();

        System.out.println("Введите два слова: название товара и количество. Или end");
        Scanner scanner = new Scanner(System.in);
        Basket basket = new Basket(Shop.getProducts().keySet().size());
        while (true) {
            try {
                String line = scanner.nextLine();
                if ("end".equals(line)) break;
                String[] parts = line.split(" ");
                String product = parts[0];
                int count = Integer.parseInt(parts[1]);
                basket.addPurchase(product, count);
            } catch (ArrayIndexOutOfBoundsException e) {
                String line = scanner.nextLine();
                if ("end".equals(line)) break;
                String[] parts = line.split(" ");
                String product = parts[0];
                int count = Integer.parseInt(parts[1]);
                basket.addPurchase(product, count);
            }
        }
        long sum = basket.sum(Shop.getProducts());
        System.out.println("ИТОГО: " + sum);
    }
}