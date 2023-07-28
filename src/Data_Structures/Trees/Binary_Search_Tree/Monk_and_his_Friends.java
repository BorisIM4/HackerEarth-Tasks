package Data_Structures.Trees.Binary_Search_Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Monk_and_his_Friends {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numberOfTests = Integer.parseInt(br.readLine());

        while (numberOfTests-- > 0){
            int[] numberOfStudents = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int numberOfStudentsWithCandies = numberOfStudents[0];

            long[] numberOfCandies = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();

            Set<Long> studentsWithCandies = new HashSet<>();

            for (int i = 0; i < numberOfCandies.length; i++) {
                long currentNumberOfCandies = numberOfCandies[i];

                if (i < numberOfStudentsWithCandies) {
                    studentsWithCandies.add(currentNumberOfCandies);
                } else {
                    if (studentsWithCandies.contains(currentNumberOfCandies)) {
                        System.out.println("YES");

                    } else {
                        System.out.println("NO");
                        studentsWithCandies.add(currentNumberOfCandies);
                    }
                }
            }

        }
        //2
        //2 3
        //3 2 9 11 2
        //3 3
        //1 2 3 1 2 3
        //
    }
}
