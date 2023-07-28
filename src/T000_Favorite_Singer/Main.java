package T000_Favorite_Singer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] song = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Map<Integer, Integer> singerNumber = new HashMap<>();
        for (int i = 0; i < song.length; i++) {
            int currSong = song[i];

            singerNumber.putIfAbsent(currSong, 0);

            if (singerNumber.containsKey(currSong)) {
                singerNumber.put(currSong, singerNumber.get(currSong) + 1);
            }

        }

        int topSinger = 0;
        int count = 0;

        for (Map.Entry<Integer, Integer> set : singerNumber.entrySet()) {
            Integer currValue = set.getValue();

            if (currValue > topSinger) {
                topSinger = currValue;
                count = 1;
            } else if (currValue == topSinger) {
                count++;
            }
        }

        System.out.println(count);

    }
}
