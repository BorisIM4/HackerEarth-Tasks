package Basic_Programming.Input_Output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class Divisibility {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arraySize = Integer.parseInt(br.readLine());

        int[] array = Arrays
                .stream(br.readLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String test = "";

        for (int i = 0; i < array.length; i++) {
            int currentNumber = array[i];

            int lastDigitDigit = Math.abs(currentNumber) % 10;
            String lastDigitAsString = String.valueOf(lastDigitDigit);

            test = test.concat(lastDigitAsString);
        }


        BigInteger numberAsBigInt = new BigInteger(test);

        BigInteger modAsBigInt = BigInteger.valueOf(10);

        BigInteger result = numberAsBigInt.mod(modAsBigInt);

        BigInteger zeroAsBigInt = BigInteger.ZERO;

        if (result.equals(zeroAsBigInt)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
