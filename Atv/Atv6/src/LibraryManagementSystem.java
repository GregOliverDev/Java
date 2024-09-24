import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Criar instâncias de diferentes materiais da biblioteca
        Book book = new Book("1984", "George Orwell", 1949, "Dystopian");
        Magazine magazine = new Magazine("National Geographic", "Various Authors", 2023, 789);
        DigitalMedia digitalMedia = new DigitalMedia("Inception", "Christopher Nolan", 2010, "MP4");

        // Demonstrar polimorfismo e ações dos itens da biblioteca
        List<LibraryItem> items = new ArrayList<>();
        items.add(book);
        items.add(magazine);
        items.add(digitalMedia);

        for (LibraryItem item : items) {
            item.displayInfo();
            item.borrow();
            item.returnItem();
            System.out.println();
        }

        // Métodos específicos de cada classe
        book.readSample();
        magazine.flipPages();
        digitalMedia.play();
    }
}
