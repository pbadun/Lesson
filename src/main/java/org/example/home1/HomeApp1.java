package org.example.home1;

import java.util.HashMap;
import java.util.Map;

public class HomeApp1 {

    public static void main(String[] args) {
        new HomeApp1().task1();
        //new HomeApp1().task2();
    }

    //Создайте HashMap, содержащий пары значений  - имя игрушки и объект игрушки (класс Product).
    private void task1() {
        Map<String, Product> productMap = new HashMap<>();
        productMap.put("Слон", new Product(1d, 3));
        productMap.put("Кот", new Product(1d, 1));
        productMap.put("Сабак", new Product(3d, 2));
        productMap.put("Машинка", new Product(5d, 3));
        __entrySet(productMap);
        __keySet(productMap);
        __values(productMap);
    }

    //Перебрать и распечатать пары значений - entrySet().
    private void __entrySet(Map<String, Product> productMap) {
        // v1
        productMap.entrySet()
                .stream()
                .forEach(System.out::println);
        // v2
        for (Map.Entry<String, Product> e : productMap.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue().toString());
        }
    }

    //Перебрать и распечатать набор из имен продуктов  - keySet().
    private void __keySet(Map<String, Product> productMap) {
        for (String name : productMap.keySet()) {
            System.out.println(name);
        }
    }

    //Перебрать и распечатать значения продуктов - values().
    private void __values(Map<String, Product> productMap) {
        for (Product p : productMap.values()) {
            System.out.println(p);
        }
    }

    //Задание с *
    // Дана строка String str = "I love java as like others java developers, to be java developer is great to be good";
    //При помощи коллекции HashMap сделать подсчёт слов в строке. Программа должна подсчитать сколько каждое слово встречается в строке.
    private void task2() {
        String str = "I love java as like others java developers, to be java developer is great to be good";
        Map<String, Integer> dic = new HashMap<>();
        String[] st = str.split(" ");
        for (String s : st) {
            String sl = s.replaceAll("[^A-Za-z0-9\\-]", "");
            if (dic.get(sl) == null) {
                dic.put(sl, 1);
            } else {
                dic.put(sl, dic.get(sl) + 1);
            }
        }
        dic.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }


}
