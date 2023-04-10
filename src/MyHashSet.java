import java.util.HashSet;

public class MyHashSet {
    public static void main(String[] args) {

        HashSet<Integer> studentsRollno = new HashSet<>();
        studentsRollno.add(102);
        studentsRollno.add(200);
        studentsRollno.add(322);
        studentsRollno.add(111);
        studentsRollno.add(231);

        // iterating HashSet using forEach() method
        System.out.println("Students Roll No:->");
        studentsRollno.forEach((Integer set)->{
            System.out.println("RollNo : "+set);
        });

    }
}
