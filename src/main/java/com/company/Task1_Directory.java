package com.company;

import java.io.*;
import java.util.stream.Collectors;

public class Task1_Directory {
    public void viewDrives() {
        File[] roots = File.listRoots();
        for (int i = 0; i < roots.length; i++)
        {
            System.out.println("Name: " + roots[i].getName());
            System.out.println("AbsolutePath: " + roots[i].getAbsolutePath());
            System.out.println(
                    "Size: " + roots[i].getTotalSpace() / (1024 * 1024) + "GB"
            );
            System.out.println(
                    "Free space: " + roots[i].getFreeSpace() / (1024 * 1024)
            );
            System.out.println("---\n");
        }
    }

    public void viewAllDevices() throws IOException, InterruptedException {
        /* for Linux */
        Process process = Runtime.getRuntime().exec("df -h");
        process.waitFor();

        InputStream is = process.getInputStream();

        String result
                = new BufferedReader(new InputStreamReader(is))
                .lines()
                .collect(Collectors.joining("\n"));
        System.out.println(result);
    }
}
