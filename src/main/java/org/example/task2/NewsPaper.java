package org.example.task2;

import java.util.ArrayList;
import java.util.List;

public class NewsPaper extends AllPress {
    private int circulation;
    private List<String> author;

    public NewsPaper(String pressName, int circulation) {
        super(pressName);
        this.author = new ArrayList<>();
        this.circulation = circulation;
    }

    @Override
    public void addAuthor(String author) {
        this.author.add(author);
    }

    @Override
    public String getAllAuthor() {
        StringBuffer sb = new StringBuffer();
        for (String s : author) {
            sb.append(s);
            sb.append(",");
        }
        return sb.toString();
    }

    public int getCirculation() {
        return circulation;
    }
}
