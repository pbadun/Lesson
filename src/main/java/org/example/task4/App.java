package org.example.task4;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class App {

    public static void main(String[] args) {
        Random r = new Random();
        Map<Integer, Ob> as = new HashMap<>();

        for (int a = 0; a < 10000; a++) {
            as.put(a, new Ob(1, 1));
        }

        System.out.println(as.size());

        for (Integer i : as.keySet()) {
            as.get(i).inc();
        }
        for (int a = 10000; a < 20000; a++) {
            as.put(a, new Ob(2, 2));
        }

        System.out.println(as.size());
    }
}
