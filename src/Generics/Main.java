package Generics;
public class Main {
    public static void main(String[] args) {

        MediaLibrary<Book> bookLibrary = new MediaLibrary<>();
        MediaLibrary<Video> videoLibrary = new MediaLibrary<>();
        MediaLibrary<Newspaper> newspaperLibrary = new MediaLibrary<>();
        MediaLibrary<Media> library = new MediaLibrary<>();

        Book book1 = new Book("Diary of a wimpy kid", "Tony");
        Book book2 = new Book("The Maze Runner", "John");

        Video video1 = new Video("Inception", "Christopher Nolan");
        Video video2 = new Video("Oppenheimer", "Christopher Nolan");

        Newspaper newspaper1 = new Newspaper("The New York Times", "The New York Times Company");
        Newspaper newspaper2 = new Newspaper("The Washington Times", "Washington Times Company");

        bookLibrary.addMedia(book1);
        bookLibrary.addMedia(book2);

        videoLibrary.addMedia(video1);
        videoLibrary.addMedia(video2);

        newspaperLibrary.addMedia(newspaper1);
        newspaperLibrary.addMedia(newspaper2);

        library.addMedia(book1);
        library.addMedia(book2);
        library.addMedia(video1);
        library.addMedia(video2);
        library.addMedia(newspaper1);
        library.addMedia(newspaper2);

        System.out.println("\nBook Library");
        bookLibrary.displayMedia();

        System.out.println("\nVideo Library");
        videoLibrary.displayMedia();

        System.out.println("\nNewspaper Library");
        newspaperLibrary.displayMedia();

        System.out.println("\nMedia Library");
        library.displayMedia();


    }
}