package lesson.task3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) throws Exception {
        String url = "https://habr.com/ru/company/oleg-bunin/blog/649319/";
        Document doc = Jsoup.parse(new URL(url), 5000);
        Map<String, Integer> map = new HashMap<>();
        String[] c = doc.text().split(" ");
        for (String st : c) {
            if (st.length() <= 3) {
                continue;
            }
            if (map.get(st) != null) {
                Integer i = map.get(st);
                map.put(st, ++i);
            } else {
                map.put(st, 1);
            }
        }
        map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}
