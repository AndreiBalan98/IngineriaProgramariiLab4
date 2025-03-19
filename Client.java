import java.util.ArrayList;
import java.util.List;

public class Client {
    // Atributele clientului
    private String firstName;
    private String lastName;
    private String phone;
    private String address;      // Adresa de livrare curentă
    private String email;
    private String password;

    // Pentru simplitate, folosim o listă de String pentru coșul de cumpărături
    private List<String> cart;

    // Constructorul care simulează fereastra de sign up
    public Client(String firstName, String lastName, String phone, String address, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.password = password;
        this.cart = new ArrayList<>();
    }

    // 2.1.2 Login - verifica emailul si parola
    public boolean login(String email, String password) {
        if (this.email.equals(email) && this.password.equals(password)) {
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Invalid email or password!");
            return false;
        }
    }

    // 2.1.3 Logout - simulează delogarea
    public void logout() {
        System.out.println("Logout successful! Va rugam sa va reconectati pentru a continua.");
    }

    // 2.1.4 Modificare parola - presupune confirmare prin email (simulată)
    public boolean changePassword(String oldPassword, String newPassword) {
        if (this.password.equals(oldPassword)) {
            // Simulare confirmare prin email
            if (sendEmailConfirmation()) {
                this.password = newPassword;
                System.out.println("Parola a fost modificată cu succes!");
                return true;
            } else {
                System.out.println("Confirmarea prin email a eșuat!");
                return false;
            }
        } else {
            System.out.println("Parola veche nu corespunde!");
            return false;
        }
    }

    // Metodă privată care simulează trimiterea de confirmare prin email
    private boolean sendEmailConfirmation() {
        System.out.println("Confirmare prin email trimisă... (simulare)");
        // Într-o aplicație reală aici se va implementa logica de trimitere a email-ului
        return true;
    }

    // 2.1.5 Modificare adresa de livrare
    public void changeShippingAddress(String newAddress) {
        this.address = newAddress;
        System.out.println("Adresa de livrare a fost actualizată la: " + newAddress);
    }

    // 2.1.6 Căutare Produs - simulare a unei căutări după nume
    public void searchProduct(String productName) {
        System.out.println("Căutare pentru produsul: " + productName);
        // Logica reală ar implica interogarea unui catalog de produse
        System.out.println("Produsul '" + productName + "' a fost găsit! (simulare)");
    }

    // 2.1.7 Adăugare Produs în Coș
    public void addProductToCart(String product) {
        cart.add(product);
        System.out.println("Produsul '" + product + "' a fost adăugat în coș.");
    }

    // 2.1.8 Scriere recenzii
    public void writeReview(String product, String review) {
        // Într-o aplicație reală s-ar salva recenzia asociată produsului
        System.out.println("Recenzie pentru produsul '" + product + "': " + review);
    }

    // 2.1.9 Procesare Comandă
    public void processOrder(String paymentMethod, String shippingAddress) {
        System.out.println("Procesare comandă:");
        System.out.println("Metoda de plată selectată: " + paymentMethod);
        System.out.println("Adresa de livrare: " + shippingAddress);
        // Aici se va crea și procesa un obiect de tip Order în aplicații reale
    }

    // 2.1.10 Urmărire Comandă
    public void trackOrder(int orderId) {
        // Într-o aplicație reală se va interoga statusul comenzii
        System.out.println("Urmărire comandă cu ID: " + orderId);
        System.out.println("Starea comenzii " + orderId + " este: În procesare (simulare).");
    }

    // Metodă pentru afișarea informațiilor despre client (fără a expune parola)
    @Override
    public String toString() {
        return "Client{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    // Exemplu de utilizare
    public static void main(String[] args) {
        // Sign up (creare cont)
        Client client = new Client("Ion", "Popescu", "0712345678", "Str. Exemplu, Nr. 1", "ion.popescu@example.com", "parola123");

        // Login
        client.login("ion.popescu@example.com", "parola123");

        // Modificare parola
        client.changePassword("parola123", "nouaParola456");

        // Modificare adresa de livrare
        client.changeShippingAddress("Str. Noua, Nr. 2");

        // Căutare produs
        client.searchProduct("Televizor LED");

        // Adăugare produs în coș
        client.addProductToCart("Televizor LED 42\"");

        // Scriere recenzie
        client.writeReview("Televizor LED 42\"", "Produs de calitate, livrare rapidă.");

        // Procesare comandă
        client.processOrder("Card de credit", "Str. Noua, Nr. 2");

        // Urmărire comandă
        client.trackOrder(101);

        // Logout
        client.logout();
    }
}
