import java.util.Comparator;
import java.util.Map;

public class EntryNameComparator implements Comparator<Map.Entry<Person,String>> {
    @Override
    public int compare(Map.Entry<Person, String> o1, Map.Entry<Person, String> o2) {
        String name1 = o1.getKey().getName();
        String name2  = o2.getKey().getName();
        return name1.compareTo(name2);
    }
}
