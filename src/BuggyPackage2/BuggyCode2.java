package BuggyPackage2;

import java.util.*;

public class BuggyCode2 {
    public static class Product {
        String sku;
        int stock;

        public Product(String sku, int stock) {
            this.sku = sku;
            this.stock = stock;
        }

        @Override
        public String toString() {
            return sku + "(" + stock + ")";
        }
    }

    private final List<Product> products = new ArrayList<>();
    private final Map<Product, Double> prices = new HashMap<>();

    public void add(Product p, double price) {
        products.add(p);
        prices.put(p, price);
    }

    public void removeOutOfStock() {
        for (Product p : products) {
            if (p.stock == 0) {
                products.remove(p);
            }
        }
    }

    public Double lookupPrice(String sku, int stock) {
        return prices.get(new Product(sku, stock));
    }

    public List<Product> topStocked(int n) {
        List<Product> sorted = new ArrayList<>(products);
        sorted.sort(Comparator.comparingInt((Product p) -> p.stock).reversed());
        List<Product> result = new ArrayList<>();
        for (int i = 0; i <= n && i < sorted.size(); i++) {
            result.add(sorted.get(i));
        }
        return result;
    }

    public List<Product> getProducts() {
        return products;
    }
}
