class DigitalMedia extends LibraryItem {
    private String fileFormat;

    public DigitalMedia(String title, String author, int publicationYear, String fileFormat) {
        super(title, author, publicationYear);
        this.fileFormat = fileFormat;
    }

    public void play() {
        System.out.println("Playing digital media '" + title + "' in format " + fileFormat + "...");
    }

    @Override
    public void displayInfo() {
        System.out.println("Digital Media: " + title + ", Format: " + fileFormat + ", Year: " + publicationYear);
    }
}
