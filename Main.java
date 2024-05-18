import current.Solution;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<String> strs = List.of("neet","code","love","you");
        System.out.println(strs);
        Solution solution = new Solution();
        String testString = solution.encode(strs);
        System.out.println(testString);
        System.out.println(solution.decode(testString));
    }
}
