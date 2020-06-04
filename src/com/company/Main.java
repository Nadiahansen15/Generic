package com.company;

import java.io.FileNotFoundException;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {

        Main main = new Main();
        Set set = new Set();
        Map map = new Map();

        main.generic();
        //set.set();
        //map.Hashmap();
        //map.treeMap();

    }

    public void generic() {
        Box<Integer> integerBox = new Box<>(15);
        Box<String> stringBox = new Box<>("katte");
        System.out.println(integerBox.getT());
        System.out.println(stringBox.getT());

    }
}
