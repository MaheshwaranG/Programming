package learn.iterator.nullcheck;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Objects;

public class NullCheck {

    public static void main(String args[]) {
        ArrayList strList = new ArrayList<String>();
        strList.add("");
        strList.add("B");
        if (!(strList == null || strList.isEmpty())) {
            System.out.println("Collection is Not Empty.");
            Iterator<String> itr = getIterator(strList);
            if (Objects.nonNull(itr) && itr.hasNext()) {
                String s = itr.next();
                System.out.println("First Element is : " + s);
            } else {
                System.out.println("No Elements");
            }

        } else {
            System.out.println("Collection is Empty or Null");
        }
    }

    public static Iterator<String> getIterator(ArrayList<String> list) {
        if (list.size() == 1) {
            return null;
        }
        return list.iterator();
    }
}