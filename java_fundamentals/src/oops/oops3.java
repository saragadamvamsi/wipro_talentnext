package oops;

class Author {
    String name;
    String email;
    char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String toString() {
        return name + " (" + gender + ") - " + email;
    }
}

class Book {
    String name;
    double price;
    int quantity;
    Author author = new Author("Vamsi Saragadam", "saragadamvamsi2004@gmail.com", 'M');

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

public class oops3 {
    public static void main(String[] args) {
        Book obj = new Book();
        obj.setName("Mastering Java");
        obj.setPrice(40000);
        obj.setQuantity(19);

        System.out.println("Book name: " + obj.getName());
        System.out.println("Author: " + obj.author);
        System.out.println("Price of Book: ₹" + obj.getPrice());
        System.out.println("Quantity of Books: " + obj.getQuantity());
    }
}
