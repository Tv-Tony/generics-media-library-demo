package Generics;

public class Video implements Media{
    private String title;
    private String director;

    public Video(String title, String director) {
        this.title = title;
        this.director = director;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }
}
