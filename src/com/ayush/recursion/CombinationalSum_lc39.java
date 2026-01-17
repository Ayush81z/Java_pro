package com.ayush.recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationalSum_lc39 {
    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        CombinationalSum_lc39 solution = new CombinationalSum_lc39();
        System.out.println(solution.combinationSum(candidates, target));
    }


    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        findcombination (0 , candidates , list , target , new ArrayList<>());
        return list;
    }

    public void findcombination(int index , int[] arr , List<List<Integer>> list , int target , List<Integer> ds) {
        if (index == arr.length) {
            if (target == 0) {
                list.add(new ArrayList<>(ds));
            }
            return;
        }

        if (arr[index] <= target) {
            ds.add(arr[index]);
            findcombination(index , arr , list , target-arr[index] , ds); //take
            ds.remove(ds.size() - 1); //remove if it goes to non take (backtracking oof recursion tree)

        }
        findcombination(index+1 , arr , list , target , ds);
    }
}
