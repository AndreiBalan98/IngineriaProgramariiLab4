package org.example;

public class Seller {
    private int id;
    private String name;
    private String address;
    private String phone;
    private String email;
    private String password;
    private boolean isLogged;
    private Product products[];


    public Seller(int id, String name, String address, String phone, String email, String password)
    {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }

    public void SignIn(Seller sellers[]) {
        System.out.println("Write your name: ");
        this.name = System.console().readLine();
        System.out.println("Write your address: ");
        this.address = System.console().readLine();
        System.out.println("Write your phone: ");
        this.phone = System.console().readLine();
        System.out.println("Write your email: ");
        this.email = System.console().readLine();
        System.out.println("Write your password: ");
        this.password = System.console().readLine();

        for (Seller seller : sellers) {
            if (seller != null && (seller.email.equals(this.email) || seller.phone.equals(this.phone))) {
                System.out.println("Email or phone number already in use.");
                return;
            }
        }
    }
    public void logIn(Seller sellers[])
    {
        System.out.println("Write your email: ");
        String email = System.console().readLine();
        for(Seller seller : sellers)
        {
            if(seller.email.equals(email))
            {
                System.out.println("Write your password: ");
                String password = System.console().readLine();
                if(seller.password.equals(password))
                {
                    System.out.println("You are logged in");
                    seller.isLogged = true;
                    return;
                }
                else
                {
                    System.out.println("Wrong password");
                    return;
                }
            }
        }
    }

    public void logOut()
    {
        this.isLogged = false;
    }

    public void changePassword()
    {
        System.out.println("Write your old password: ");
        String oldPassword = System.console().readLine();
        if(this.password.equals(oldPassword))
        {
            System.out.println("Write your new password: ");
            this.password = System.console().readLine();
        }
        else
        {
            System.out.println("Wrong password");
        }
    }

    public void changeEmail()
    {
        System.out.println("Write your new email: ");
        this.email = System.console().readLine();
    }

    public void changePhone()
    {
        System.out.println("Write your new phone: ");
        this.phone = System.console().readLine();
    }

    public void changeAddress()
    {
        System.out.println("Write your new address: ");
        this.address = System.console().readLine();
    }

    public void showProfile()
    {
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Phone: " + this.phone);
        System.out.println("Email: " + this.email);
    }

    public void addProduct(Product product)
    {
        for(int i = 0; i < this.products.length; i++)
        {
            if(this.products[i] == null)
            {
                this.products[i] = product;
                return;
            }
        }
    }

    public void changeQuantity(Product product, int quantity)
    {
        int oldQuantity=0;
        int newQuantity=0;
        for(int i = 0; i < this.products.length; i++)
        {
            if(this.products[i] == product)
            {
                oldQuantity = this.products[i].getQuantity();
                newQuantity = quantity;
                this.products[i].setQuantity(quantity);
                return;
            }
        }

        System.out.println("Quantity changed from " + oldQuantity + " to " + newQuantity);
    }

    public void changePrice(Product product, double price)
    {
        double oldPrice=0;
        double newPrice=0;
        for(int i = 0; i < this.products.length; i++)
        {
            if(this.products[i] == product)
            {
                oldPrice = this.products[i].getPrice();
                newPrice = price;
                this.products[i].setPrice(price);
                return;
            }
        }
        System.out.println("Price changed from " + oldPrice + " to " + newPrice);
    }
}
