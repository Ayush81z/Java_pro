package com.ayush.leetcode;
import java.util.Arrays;

//same as leetcode 455

class leetcode_2410 {
        public int matchPlayersAndTrainers(int[] players, int[] trainers) {
            Arrays.sort(players);
            Arrays.sort(trainers);
            int i = 0 , j = 0;
            if (players.length == 0 && trainers.length == 0) return 0;
            while (i < players.length && j < trainers.length)  {
                if (trainers[j] >= players[i]) {
                    i++;
                }
                j++;
            }
            return i;

        }
    }

