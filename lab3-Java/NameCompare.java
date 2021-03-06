import java.util.Comparator;

public class NameCompare implements Comparator<Item> {
    public int compare(Item item1, Item item2) {
        return item1.getName().compareTo(item2.getName());
    }
}