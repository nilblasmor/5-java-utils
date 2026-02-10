package javautils.level1.exercise3;

import java.io.File;
import java.io.FileWriter;

public class SaveAsTxt {

    public static void main(String[] args) throws Exception {
        File root = new File(args[0]);
        FileWriter writer = new FileWriter(args[1]);
        printTree(root, 0, writer);
        writer.close();
    }

    public static void printTree(File file, int level, FileWriter writer) throws Exception {

        for (int i = 0; i < level; i++) {
            writer.write("  ");
        }

        if (file.isDirectory()) {
            writer.write("(D) " + file.getName() + "\n");
        } else {
            writer.write("(F) " + file.getName() + "\n");
        }

        if (file.isDirectory()) {
            File[] files = file.listFiles();

            for (int i = 0; i < files.length; i++) {
                printTree(files[i], level + 1, writer);
            }
        }
    }

}