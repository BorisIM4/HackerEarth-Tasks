package T002_Array_Sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numberOfElement = Integer.parseInt(br.readLine());

        long[] elements = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();

        long sumOfElementsArray = Arrays.stream(elements).sum();

        System.out.println(sumOfElementsArray);
    }
}
