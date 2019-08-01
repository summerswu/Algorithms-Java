class Solution {
     public String[] findRestaurant(String[] list1, String[] list2) {
        if (list2.length < list1.length) {
            return findRestaurant(list2, list1);
        }
        int minSum = Integer.MAX_VALUE;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        List<String> res = new ArrayList<>();
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                int sum = map.get(list2[i]) + i;
                if (sum < minSum) {
                    minSum = sum;
                    res = new ArrayList<>();
                    res.add(list2[i]);
                } else if (sum == minSum) {
                    res.add(list2[i]);
                }
            }
        }
        String[] result = new String[res.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = res.get(i);
        }
        return result;
    }
}
