import java.util.TreeSet;

public class MyTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> roomNo = new TreeSet<>();
        roomNo.add(101);
        roomNo.add(104);
        roomNo.add(504);
        roomNo.add(404);
        roomNo.add(501);

        // iterating TreeSet using for each loop
        System.out.println("Available Rooms :->");
        for (Integer room: roomNo) {
            System.out.println("RoomNo. : "+room);
        }
    }
}
