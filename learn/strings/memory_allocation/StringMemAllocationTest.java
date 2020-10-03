import java.util.*;

public class StringMemAllocationTest {
    public static void main(String args[]) {
        String a = "aaa"; // stores at GC string pool
        String b = "aaa"; // stores at DC string pool (not it a reference)
        String d = new String("aaa"); // stores at heap memory
        StringClass2 c = new StringClass2();
        if (a == newClass.a) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
        System.out.println("Hash : a = " + a.hashCode() + " : Obj.c = " + c.hashCode() + " : d = " + d.hashCode());
    }
}

class StringClass2 {
    public String c = "aaa";
}