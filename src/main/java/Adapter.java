public class Adapter implements InterfaceNew {
    private Database_Old adapter;

    public Adapter(Database_Old adapter) {
        this.adapter = adapter;
    }

    @Override
    public String getAuthor() {
        String[] part = adapter.getIndexCard().split("|");
        return part[0];
    }

    @Override
    public String getTitle() {
        String[] part = adapter.getIndexCard().split("|");
        return part[1];
    }

    @Override
    public String getLocation() {
        String[] part = adapter.getIndexCard().split("|");
        return part[2];
    }


}
