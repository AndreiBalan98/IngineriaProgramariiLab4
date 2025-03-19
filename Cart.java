import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<String> products;

    public Cart() {
        this.products = new ArrayList<>();
    }

    // Adaugă un produs în coș
    public void addProduct(String product) {
        products.add(product);
        System.out.println("Produsul '" + product + "' a fost adăugat în coș.");
    }

    // Elimină un produs din coș
    public void removeProduct(String product) {
        if (products.remove(product)) {
            System.out.println("Produsul '" + product + "' a fost eliminat din coș.");
        } else {
            System.out.println("Produsul '" + product + "' nu se află în coș.");
        }
    }

    // Golește întregul coș
    public void clearCart() {
        products.clear();
        System.out.println("Coșul a fost golit.");
    }

    // Returnează lista de produse din coș
    public List<String> getProducts() {
        return products;
    }

    // Returnează numărul de produse din coș
    public int getCartSize() {
        return products.size();
    }
}
