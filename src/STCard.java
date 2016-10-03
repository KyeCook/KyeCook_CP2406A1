/**
 * Created by Kye Cook on 29/09/2016.
 */
public class STCard {
    private int id;

    public STCard(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "Card ID : " + id;
    }
}
