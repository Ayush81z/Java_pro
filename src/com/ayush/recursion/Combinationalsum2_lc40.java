package com.ayush.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combinationalsum2_lc40 {
    public static void main(String[] args) {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;

        Combinationalsum2_lc40 solution = new Combinationalsum2_lc40();
        System.out.println(solution.combinationSum2(candidates, target));
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<>();
        findunique(0 , candidates , target , list , new ArrayList<>());
        return  list;
    }

    public void findunique(int index , int[] arr , int target , List<List<Integer>> list ,List<Integer> ds ) {
        if (target == 0) {
            list.add(new ArrayList<>(ds));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            if (i > index && arr[i] == arr[i-1]) continue; //we check if the value is same as prev or not , if it is skip this itteration completely
            if (arr[i] > target) break;

            ds.add(arr[i]);
            findunique(i+1 , arr , target - arr[i] ,list , ds);
            ds.remove(ds.size()-1);
        }
    }

}
