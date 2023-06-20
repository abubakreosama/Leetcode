import java.util.HashSet;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int result = 0;
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (jewels.charAt(i) == stones.charAt(j)) {
                    result++;
                }
            }
        }
        return result;
    }

    // OTHER SOLUTION USING SETS
    public int numJewelsInStonesOther(String jewels, String stones) {
        HashSet<Character> jew = new HashSet<>();
        int result = 0;

        for (int i = 0; i < jewels.length(); i++) {
            jew.add(jewels.charAt(i));
        }
        for (int i = 0; i < stones.length(); i++) {
            if (jew.contains(stones.charAt(i))) {
                result++;
            }
        }
        return result;

    }
}