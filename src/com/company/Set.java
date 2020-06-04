package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Set {
    Scanner sc;

    public void set() {
        try {
            sc = new Scanner(new File("/Users/nadiahansen/Desktop/Project/Generic/src/com/company/whale2.txt"));


            HashSet hashSet = new HashSet<String>();
            TreeSet treeSet = new TreeSet<String>();
            while (sc.hasNext()) {
                String word = sc.next();
                word = word.toLowerCase();
                if (word.startsWith("t") && word.length() == 3) {
                    hashSet.add(word);
                    treeSet.add(word);
                }
            }
            System.out.println("HashSet - unsorted set: " + hashSet);
            System.out.println("TreeSet - Sorted set: " + treeSet);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

