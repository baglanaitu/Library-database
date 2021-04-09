import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        InterfaceNew book1 = new Database_New("Mukhtar Auezov", "The path of Abai", "AMP0032");
        InterfaceNew book2 = new Database_New("Imre Kertesz", "Fateless", "KIF0014");
        InterfaceNew book3 = new Database_New("Mikhail Bulgakov", "The Master and Margarita", "BMT0023");
        InterfaceNew book4 = new Adapter(new Database_Old("Kevin Zhang | Design Patterns| ZKD0121"));
        InterfaceNew book5 = new Adapter(new Database_Old("Mario Puzo | The Godfather | PMG1210"));

        // Catalogue of books for searching
        ArrayList<InterfaceNew> catalogue = new ArrayList<InterfaceNew>();
        catalogue.add(book1);
        catalogue.add(book2);
        catalogue.add(book3);
        catalogue.add(book4);
        catalogue.add(book5);

        // Our desired books
        String author = "Imre Kertesz";
        String title = "The path of Abai";

        // Searching by author
        for(int i = 0; i < catalogue.size(); i++){
            if (catalogue.get(i).getAuthor().equalsIgnoreCase(author)) {
                System.out.println("Author: " + catalogue.get(i).getAuthor() + "\nTitle: " + catalogue.get(i).getTitle() + "\nLocation: " + catalogue.get(i).getLocation());
                System.out.println();
            }
        }

        // Searching by title
        for(int i = 0; i < catalogue.size(); i++){
            if (catalogue.get(i).getTitle().equalsIgnoreCase(title)) {
                System.out.println("Author: " + catalogue.get(i).getAuthor() + "\nTitle: " + catalogue.get(i).getTitle() + "\nLocation: " + catalogue.get(i).getLocation());
            }
        }
    }
}
