import java.util.*;
import java.util.stream.Collectors;

public class Comparable {
    //    public void star4(){
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
                new Person("Reem", "Al Sarrih"),
                new Person("Ziad", "Al Sarrih"),
                new Person("Kassem", "Al Sarrih"),
                new Person("Rayan", "Al Sarrih"),
                new Person("Ahmad", "Al Sarrih"),
                new Person("Ra2ouf", "Al Sarrih"),
                new Person("Kamel", "Al Sarrih"),
                new Person("Ali", "Al Sarrih"));

        System.out.println("sorted array");
        list.sort(new NameComparator());
        System.out.println(list);

        Set<Person> personS = new HashSet<>();
        personS.add(new Person("Reem",   "Al Sarrih"));
        personS.add(new Person("Ziad",   "Al Sarrih"));
        personS.add(new Person("Kassem", "Al Sarrih"));
        personS.add(new Person("Rayan",  "Al Sarrih"));
        personS.add(new Person("Ahmad",  "Al Sarrih"));
        personS.add(new Person("Ra2ouf", "Al Sarrih"));
        personS.add(new Person("Kamel",  "Al Sarrih"));
        personS.add(new Person("Ali",    "Al Sarrih"));
        List<Person> collect = personS.stream().sorted(new NameComparator()).collect(Collectors.toList());
        System.out.println("set");
        System.out.println(collect);

        HashMap<Person, String> hashMap = new HashMap<>();
        hashMap.put(new Person("Reem",   "Al Sarrih"), "1");
        hashMap.put(new Person("Ziad",   "Al Sarrih"), "2");
        hashMap.put(new Person("Kassem", "Al Sarrih"), "3");
        hashMap.put(new Person("Rayan",  "Al Sarrih"), "4");
        hashMap.put(new Person("Ahmad",  "Al Sarrih"), "5");
        hashMap.put(new Person("Ra2ouf", "Al Sarrih"), "6");
        hashMap.put(new Person("Kamel",  "Al Sarrih"), "7");
        hashMap.put(new Person("Ali",    "Al Sarrih"), "8");
        System.out.println("hashMap");
        List<Map.Entry<Person, String>> collect1 = hashMap.entrySet().stream().sorted(new EntryNameComparator()).collect(Collectors.toList());
        System.out.println(collect1);
    }
}
