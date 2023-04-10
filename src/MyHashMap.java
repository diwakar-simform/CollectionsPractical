import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> studentsData = new HashMap<>();
        studentsData.put(1,"Diwakar");
        studentsData.put(2,"Shruti");
        studentsData.put(3,"Hinal");
        studentsData.put(4,"Nimit");
        studentsData.put(5,"Hardeek");

        // iterating HashMap using for each loop
        System.out.println("Students Data :-> ");
        for (Map.Entry<Integer, String> entry : studentsData.entrySet()) {
            System.out.println("Id = "+entry.getKey()+", Name = "+entry.getValue());
        }

    }
}
