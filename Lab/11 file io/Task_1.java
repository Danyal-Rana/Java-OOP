import java.io.*;

class Person implements Serializable {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Book implements Serializable {
    private String name;
    private String publisher;
    private Person author;

    public Book() {
    }

    public Book(String name, String publisher, Person author) {
        this.name = name;
        this.publisher = publisher;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Person getAuthor() {
        return author;
    }

    public void setAuthor(Person author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book Name: " + name + ", Publisher: " + publisher + ", Author: " + author.getName();
    }
}

public class Task_1 {
    public static void main(String[] args) {
        try {
            Book book1 = new Book("Book 1", "Sang e Meel", new Person("Person 1"));
            Book book2 = new Book("Book 2", "Sang e Meel", new Person("Person 2"));
            Book book3 = new Book("Book 3", "Sang e Meel", new Person("Person 3"));
            Book book4 = new Book("Book 4", "Sang e Meel", new Person("Person 4"));
            Book book5 = new Book("book 5", "Sang e Meel", new Person("Person 5"));

            FileOutputStream fos = new FileOutputStream("BookStore.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(book1);
            oos.writeObject(book2);
            oos.writeObject(book3);
            oos.writeObject(book4);
            oos.writeObject(book5);

            System.out.println("Five Book objects written to BookStore.ser.");

            oos.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
