package javautils.level1.exercise2;

import java.io.File;

public class TreeLister {

    public static void main(String[] args) {
        File root = new File(args[0]);
        printTree(root, 0);
    }

    public static void printTree(File file, int level) {

        for (int i = 0; i < level; i++) {
            System.out.print("  ");
        }

        if (file.isDirectory()) {
            System.out.print("(D) ");
        } else {
            System.out.print("(F) ");
        }

        System.out.println(file.getName());

        if (file.isDirectory()) {
            File[] files = file.listFiles();

            for (int i = 0; i < files.length; i++) {
                printTree(files[i], level + 1);
            }
        }
    }

}