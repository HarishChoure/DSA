package Recursion;

import java.util.ArrayList;
import java.util.List;

public class subsequences {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        addAns(0, new ArrayList<>(), nums, ans);
        return ans;
    }

    public static void addAns(int ind, List<Integer> current, int[] arr, List<List<Integer>> ans) {
        if (ind == arr.length) {
            ans.add(new ArrayList<>(current));
            return;
        }

        // Include the current element
        current.add(arr[ind]);
        addAns(ind + 1, current, arr, ans);

        // Exclude the current element
        current.remove(current.size() - 1);
        addAns(ind + 1, current, arr, ans);
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1};
        List<List<Integer>> result = subsets(arr);
        System.out.println(result);
    }
}
