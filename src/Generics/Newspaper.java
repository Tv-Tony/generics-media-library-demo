package Generics;

public class Newspaper implements Media{
    private String title;
    private String publisher;

    public Newspaper(String title, String publisher) {
        this.title = title;
        this.publisher = publisher;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }
}
