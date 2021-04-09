public class Database_New implements InterfaceNew {
    private String author;
    private String title;
    private String location;

    public Database_New(String author, String title, String location) {
        this.author = author;
        this.title = title;
        this.location = location;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }
}
