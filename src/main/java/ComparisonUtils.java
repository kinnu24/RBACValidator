import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparisonUtils {

    public static boolean compareScreenElementsWithIdealRole(List screenElements, List inputAttributes) {

        if (screenElements.size() != inputAttributes.size())
            return false;

        Collections.sort(screenElements,  new SortIgnoreCase());
        Collections.sort(inputAttributes, new SortIgnoreCase());

        for (int i=0; i < screenElements.size(); i++){
            if ( !(screenElements.get(i)).equals(inputAttributes.get(i)) )
                return false;
        }

        return true;
    }

    static class SortIgnoreCase implements Comparator<Object> {
        public int compare(Object o1, Object o2) {
            String s1 = (String) o1;
            String s2 = (String) o2;
            return s1.toLowerCase().compareTo(s2.toLowerCase());
        }
    }
}
