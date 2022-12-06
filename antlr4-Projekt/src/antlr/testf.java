package antlr;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class testf {
    public static void main(String[] args) {
        Map<String, String> s = new LinkedHashMap<>();

        s.put("i", "int");
        s.put("v", "float");
        s.put("z", "bool");
        s.put("s", "string");

        System.out.println(s);
    }
}
