import java.util.ArrayList;
import java.util.List;

public class Ludic {

    // Returns a list containing all Ludic numbers
    // smaller than or equal to n.
    public static List<Integer> getLudic(int n)
    {
        // ludics list contain all the ludic numbers
        List<Integer> ludics = new ArrayList<Integer>(n);
        for (int i = 1; i <= n; i++)
            ludics.add(i);

        // Here we have to start with index 1 and will remove nothing
        // from the list
        for (int index = 1; index < ludics.size(); index++) {

            // Here first item should be included in the list
            // and the deletion is referred by this first item
            // in the loop .
            int first_ludic = ludics.get(index);

            // remove_index variable is used to store
            // the next index which we want to delete
            int remove_index = index + first_ludic;
            while (remove_index < ludics.size()) {

                // removing the next item
                ludics.remove(remove_index);

                // remove_index is updated so that
                // we get the next index for deletion
                remove_index = remove_index + first_ludic - 1;
            }
        }
        return ludics;
    }

    public static void main(String[] args)
    {
        int n = 15;
        System.out.println(getLudic(n));
    }
}