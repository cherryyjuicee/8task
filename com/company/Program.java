package com.company;

import java.io.*;


public  class Program {

    public static int[][] main(String[] args) throws IOException {

        int[][] arr2 = Enter.enter(args);
        ArrayUtils.writeArrayToFile(args[2], Task.process(arr2));

        return arr2;
    }
}
