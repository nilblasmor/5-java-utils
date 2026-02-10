package javautils.level1.exercise1;

import java.io.File;
import java.util.Arrays;

public class DirectoryLister {
        public static void main(String[] args) {

            File dir = new File(args[0]);
            String[] files = dir.list();

            Arrays.sort(files);

            for (int i = 0; i < files.length; i++) {
                System.out.println(files[i]);
            }
        }
}

