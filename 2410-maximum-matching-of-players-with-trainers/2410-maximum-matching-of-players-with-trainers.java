import java.util.Arrays;

class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);

        int c = 0;
        int start = 0;
        int end = 0;

        while (start < players.length && end < trainers.length) {
            if (players[start] <= trainers[end]) {
                c++;
                start++;
            }
            
            end++; 
        }

        return c;
    }
}