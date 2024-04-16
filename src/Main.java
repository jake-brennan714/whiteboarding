import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

    }

    public int[] toSum(List<Integer> nums, int target) {
//        for (int i = 0; i < nums.size(); i++) {
//            for (int j = 0; j < nums.size(); j++) {
//                if (nums.get(i) + nums.get(j) == target) {
//                    return new int[] {i, j};
//                }
//            }
//        }
        HashMap<Integer, Integer> hm = new HashMap();

        for (Integer i : nums) {
            hm.put(i, target - i);
        }

        for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
            if (nums.contains(e.getKey()) && nums.contains(e.getValue())) {
                return new int[] {nums.indexOf(e.getKey()), nums.indexOf(e.getValue())};
            }
        }

        return new int[] {-1, -1};
    }

    public HashMap<Character, Integer> getOccurrencesOfEach(String input) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char c : input.toCharArray()) {
            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c) + 1);
            } else {
                hm.put(c, 1);
            }
        }

        return hm;
    }
}
