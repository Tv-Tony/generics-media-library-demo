package Generics;
import java.util.ArrayList;
import java.util.List;
class MediaLibrary<T extends Media> {
    private List<T> mediaCollection;

    public MediaLibrary() {
        mediaCollection = new ArrayList<>();
    }

    public void addMedia(T media) {
        mediaCollection.add(media);
        System.out.println(media.getTitle() + " added to the library.");
    }

    public void displayMedia() {
        System.out.println("Media in the library:");
        for (T media : mediaCollection) {
            System.out.println(media.getClass().getSimpleName() + ": " + media.getTitle());
        }
    }
}
