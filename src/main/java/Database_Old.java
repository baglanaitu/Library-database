public class Database_Old implements InterfaceOld{
    private String indexCard;

    public Database_Old(String indexCard) {
        this.indexCard = indexCard;
    }

    @Override
    public String getIndexCard() {
        return indexCard;
    }
}
