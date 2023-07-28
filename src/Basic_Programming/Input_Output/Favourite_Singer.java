package Basic_Programming.Input_Output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Favourite_Singer {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long[] song = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();

        Map<Long, Long> singerNumber = new HashMap<>();
        for (int i = 0; i < song.length; i++) {
            long currSong = song[i];

            singerNumber.putIfAbsent(currSong, 0L);

            if (singerNumber.containsKey(currSong)) {
                singerNumber.put(currSong, singerNumber.get(currSong) + 1);
            }

        }

        Long topSinger = 0L;
        Long count = 0L;

        for (Map.Entry<Long, Long> set : singerNumber.entrySet()) {
            Long currValue = set.getValue();

            if (currValue > topSinger) {
                topSinger = currValue;
                count = 1L;
            } else if (currValue == topSinger) {
                count++;
            }
        }

        System.out.println(count);

    }
}
