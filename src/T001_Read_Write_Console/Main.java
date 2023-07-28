package T001_Read_Write_Console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());
        String s = br.readLine();

        System.out.println(number * 2);
        System.out.println(s);
    }
}
