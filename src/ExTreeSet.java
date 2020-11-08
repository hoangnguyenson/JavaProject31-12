import java.util.*;

public class ExTreeSet {

    //Treeset extends from SorterSet
    public static void main(String[] args) {
        // Creating a TreeSet
        Set<String> fruits = new HashSet<>();

        // Adding new elements to a TreeSet
        fruits.add("Banana");
        fruits.add("Pineapple");
        fruits.add("Apple");
        fruits.add("Orange");

        System.out.println("Fruits Set : " + fruits);

        // Duplicate elements are ignored
        fruits.add("Apple");
        System.out.println("After adding duplicate element \"Apple\" : " + fruits);

        // This will be allowed because it's in lowercase.
        fruits.add("banana");
        System.out.println("After adding \"banana\" : " + fruits);


        List<String> arrayList = new ArrayList<>();
        arrayList.add("PHP");
        arrayList.add("Python");
        arrayList.add("Java");
        arrayList.add("C++");
        arrayList.add("C++");
        System.out.println("Các phần tử của ArrayList");
        System.out.print("\t" + arrayList + "\n");

        List<String> linkedList = new LinkedList<>();
        linkedList.add("PHP");
        linkedList.add("Python");
        linkedList.add("Java");
        linkedList.add("C++");
        System.out.println("Các phần tử của LinkedList");
        System.out.print("\t" + linkedList + "\n");

        // new TreeSet() sẽ sắp xếp các phần tử
        Set<String> hashSet = new HashSet<>();
        hashSet.add("PHP");
        hashSet.add("Python");
        hashSet.add("Java");
        hashSet.add("Java");
        hashSet.add("C++");
        System.out.println("Các phần tử của Set");
        System.out.print("\t" + hashSet + "\n");

        // new TreeMap() sẽ sắp xếp các phần tử dự vào key của chúng
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("Windows", "2000");
        hashMap.put("Windows", "XP");
        hashMap.put("Windows", "X");
        hashMap.put("Language2", "Java");
        hashMap.put("Language1", ".Net");
        System.out.println("Các phần tử của Map");
        System.out.print("\t" + hashMap);
    }

}
