package current;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public String encode(List<String> strs) {
        if (strs.isEmpty()) {
            return "[]";
        }
        StringBuilder strinbuilder = new StringBuilder("[");
        for (String string : strs) {
            strinbuilder.append("\"");
            strinbuilder.append(string);
            strinbuilder.append("\",");
        }
        strinbuilder.deleteCharAt(strinbuilder.length() - 1);
        strinbuilder.append("]");
        return strinbuilder.toString();
    }

    public List<String> decode(String str) {
        if (str.equals("[]")) {
            return new ArrayList<>();
        }

        List<String> result;
        result = Arrays.asList(str.split("\",\""));

        String first = result.get(0);
        first = first.substring(2);
        result.set(0, first);

        String last = result.get(result.size() - 1);
        last = last.substring(0, last.length() - 2);
        result.set(result.size() - 1, last);
        return result;
    }
}
