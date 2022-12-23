package Library;


import Classes.Duration;
import Classes.Genre;
import Classes.Studio;

import java.util.LinkedList;

public class Library {
    private LinkedList<String> library;

    public Library() {
        library = new LinkedList<>();
    }

    public void addToLibrary(String info) {
        library.add(info);
    }

    public void addToLibrary(String title, Studio studio, int year, Genre genre, Duration duration) {

        library.add(title);
        library.add(String.valueOf(studio.getName()));
        library.add(String.valueOf(year));
        library.add(genre.getName());
        library.add(duration.getName());

    }

    public LinkedList<String> getLibrary() {
        return library;
    }


}

