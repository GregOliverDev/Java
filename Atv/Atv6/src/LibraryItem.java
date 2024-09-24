abstract class LibraryItem implements iBorrowable {
    protected String title;
    protected String author;
    protected int publicationYear;

    public LibraryItem(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public abstract void displayInfo();

    @Override
    public void borrow() {
        System.out.println("Item '" + title + "' has been borrowed.");
    }

    @Override
    public void returnItem() {
        System.out.println("Item '" + title + "' has been returned.");
    }
}
