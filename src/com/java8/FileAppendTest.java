package com.java8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by ttnd on 7/5/18.
 */
public class FileAppendTest {
    public static void main(String[] args) {
        for (int i=1; i<100; i++) {
            try (FileWriter fw = new FileWriter("/home/ttnd/Desktop/tv_show.txt", true);
                 BufferedWriter bw = new BufferedWriter(fw);
                 PrintWriter out = new PrintWriter(bw)) {

                out.println("=================================================");
                out.println(i + "===============" + i);

                out.close();
                bw.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();

            }
        }

    }
}

