package homework9;

import java.util.*;

public class Task1 {

    public static void main(String[] args) {

        List<String> joke = new ArrayList<>(Arrays.asList(
                "this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));
        System.out.println(joke);

        markLength4(joke);
        System.out.println(joke);
    }

    public static void markLength4(List<String> strings) {

        ListIterator<String> iterator = strings.listIterator();

        while (iterator.hasNext()) {
            if (iterator.next().length() == 4) {
                iterator.previous();
                iterator.add("****");
                iterator.next();
            }
        }
    }
}
