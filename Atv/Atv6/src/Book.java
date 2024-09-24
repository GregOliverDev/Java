class Book extends LibraryItem {
    private String genre;

    public Book(String title, String author, int publicationYear, String genre) {
        super(title, author, publicationYear);
        this.genre = genre;
    }

    public void readSample() {
        System.out.println("Reading a sample of '" + title + "'...");
    }

    @Override
    public void displayInfo() {
        System.out.println("Book: " + title + " by " + author + ", Genre: " + genre + ", Year: " + publicationYear);
    }
}