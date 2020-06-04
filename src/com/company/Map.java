package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Map {
    public static final int Occurrences = 2000;

    HashMap<String, Integer> hashMap = new HashMap<>();
    TreeMap<String, Integer> treeMap = new TreeMap<>();

    public void Hashmap() {

        try {
            Scanner in = new Scanner(new File("/Users/nadiahansen/Desktop/Project/Generic/src/com/company/whale2.txt"));
        while (in.hasNext()) {
            String word = in.next().toLowerCase();
            if (hashMap.containsKey(word)) {
                //seen this word before: increment count
                int hashCount = hashMap.get(word);
                hashMap.put(word, hashCount + 1);
            } else
                // never seen this word before
            hashMap.put(word, 1);
        }
            System.out.println("unsorted Map: ");
       for (String word: hashMap.keySet()) {
            int hashCount = hashMap.get(word);
            if(hashCount > Occurrences) {
                System.out.println(word + " occurs " + hashCount + " times");
            }
        }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("\n");
    }
    public void treeMap() {
        try {
            Scanner sc = new Scanner(new File("/Users/nadiahansen/Desktop/Project/Generic/src/com/company/whale2.txt"));
        while (sc.hasNext()) {
            String word = sc.next().toLowerCase();
            if (treeMap.containsKey(word)) {
                //seen this word before: increment count
                int treeCount = treeMap.get(word);
                treeMap.put(word, treeCount + 1);
            } else
                // never seen this word before
                treeMap.put(word, 1);
        }
            System.out.println("sorted Map: ");
        for (String word: treeMap.keySet()) {
            int treeCount = treeMap.get(word);
            if(treeCount > Occurrences) {
                System.out.println(word + " occurs " + treeCount + " times");
            }
        }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
