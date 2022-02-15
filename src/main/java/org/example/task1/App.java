package org.example.task1;

import org.example.task2.Blogs;
import org.example.task2.NewsPaper;
import org.example.task2.Press;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        Breathing a = new Animal();
        a.breathe();
        a.sneeze();
        a.holdBreath();
        Breathing b = new Person();
        b.breathe();
        b.sneeze();
        b.holdBreath();
    }

    public static void task2() {
        Press blog = new Blogs("Блог Васи", "http://blog-vasi.com/");
        blog.addAuthor("Вася");

        System.out.println("Название: " + blog.getPressName());
        System.out.println("Ссылка на сайт: " + ((Blogs) blog).getUrl());
        System.out.println("Автор: " + blog.getAllAuthor());

        NewsPaper np = new NewsPaper("Комсомолка", 1000);
        np.addAuthor("Вася");
        np.addAuthor("Петя");
        np.addAuthor("Сережа");

        System.out.println("Название: " + np.getPressName());
        System.out.println("Тераж: " + ((NewsPaper) np).getCirculation());
        System.out.println("Автор: " + np.getAllAuthor());

    }

}
