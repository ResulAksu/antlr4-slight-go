package typechecker;

import java.util.LinkedHashMap;
import java.util.Map;

public class MethodsWithMember {

    private Map<String,String> m = new LinkedHashMap<>();

    public Map<String, String> getM() {
        return m;
    }
}
