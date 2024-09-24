class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(String title, String author, int publicationYear, int issueNumber) {
        super(title, author, publicationYear);
        this.issueNumber = issueNumber;
    }

    public void flipPages() {
        System.out.println("Flipping through the pages of '" + title + "', issue number " + issueNumber + ".");
    }

    @Override
    public void displayInfo() {
        System.out.println("Magazine: " + title + ", Issue Number: " + issueNumber + ", Year: " + publicationYear);
    }
}
