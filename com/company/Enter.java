package com.company;


import java.io.File;

public class Enter {
    public static int[][] enter(String[] args) {

        int[][] arr2 = new int[][]{};
        if (args.length > 1) {
            File file = new File (args[1]);
            if (file.exists()) {
                arr2 = ArrayUtils.readIntArray2FromFile(args[1]);
            }
        }

        return arr2;
    }
}
