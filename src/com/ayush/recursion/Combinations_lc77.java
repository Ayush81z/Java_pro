package com.ayush.recursion;

import java.util.ArrayList;
import java.util.List;

public class Combinations_lc77 {
    public static void main(String[] args) {
        int n = 13;
        int k = 12;

        Combinations_lc77 solution = new Combinations_lc77();
        System.out.println(solution.combine(n, k));
    }
    //Given two integers n and k, return all possible combinations of k numbers chosen from the range [1, n].
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        recurse(n , k , new ArrayList<>() , list , 1);
        return list;
    }

    public void recurse(int n , int k , List<Integer> ds , List<List<Integer>> list , int i ) {
        if (ds.size() == k) {
            list.add(new ArrayList<>(ds));
        }

        for (int j = i ; j <= n; j++) {
            ds.add(j);
            recurse(n, k, ds, list, j + 1);
            ds.remove(ds.size() - 1);
        }
    }

}
