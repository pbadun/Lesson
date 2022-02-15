package org.example.task2;

public class Blogs extends AllPress {

    private String url;
    private String author;

    /**
     * @param pressName Название блога
     * @param url       ссылка на блог
     */
    public Blogs(String pressName, String url) {
        super(pressName);
        this.url = url;
    }

    @Override
    public String getAllAuthor() {
        return author;
    }

    @Override
    public void addAuthor(String author) {
        // У блога только один автор.
        this.author = author;
    }


    public String getUrl() {
        return url;
    }
}
