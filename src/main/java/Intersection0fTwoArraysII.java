import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Intersection0fTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.putIfAbsent(num, 0);
            map.put(num, map.get(num) + 1);
        }

        List<Integer> listOfIntersection = new ArrayList<>();
        for (int num : nums2) {
            if (map.containsKey(num)) {
                if (map.get(num) >= 1) {
                    listOfIntersection.add(num);
                }
                map.put(num, map.get(num) - 1);
            }
        }

        int[] answer = new int[listOfIntersection.size()];
        for (int i = 0; i < listOfIntersection.size(); i++) {
            answer[i] = listOfIntersection.get(i);
        }

        return answer;
    }
}


