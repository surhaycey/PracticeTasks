package CollectionsUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionsUtil {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,6,54,8));

        Collections.sort(list);

        System.out.println(list);

        Collections.swap(list,2,3);
        System.out.println(list);


    }
}
