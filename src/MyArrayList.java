import java.util.ArrayList;
import java.util.Iterator;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> bookList = new ArrayList<>();
        bookList.add("1. Let us C");
        bookList.add("2. JAVA a comprehensive guide");
        bookList.add("3. Headfirst HTML");
        bookList.add("4. Headfirst JavaScript");
        bookList.add("5. Python beginners guide");

        //Iterating ArrayList using iterator() function & Iterator interface.
        System.out.println("Available Books :->");
        Iterator book = bookList.iterator();
        while (book.hasNext()){
            System.out.println("Book : "+book.next());
        }
    }
}
