import java.util.ArrayList;

public class ScoreofString {
    public int scoreOfString(String s) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            int num = (int) a;
            arr.add(num);
        }
        int sum = 0;
        for (int i = 1; i < s.length(); i++) {
            sum += Math.abs(arr.get(i - 1) - arr.get(i));
        }
        return sum;

    }
}
