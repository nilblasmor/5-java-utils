package javautils.level1.exercise4;

import java.io.BufferedReader;
import java.io.FileReader;

public class TxtFileReader {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

}