package Realization;

import Classes.Studio;
import Library.Library;

public class FindMovie {


    public void findMoviebyTitle(Library library, String title) {
        System.out.println("\nФильмы, которые я нашел по названию: ");
        for (int i = 0; i < library.getLibrary().size(); i+=5) {
            if (title.equals(library.getLibrary().get(i))) {
                System.out.println(library.getLibrary().get(i) + " " +
                        library.getLibrary().get(i + 1) + " " +
                        library.getLibrary().get(i + 2) + " " +
                        library.getLibrary().get(i + 3) + " " +
                        library.getLibrary().get(i + 4));

            }
        }

    }

    public void findMoviebyStudio(Library library, Studio studio) {
        System.out.println("\nФильмы, которые я нашел по студии: ");
        for (int i = 6; i < library.getLibrary().size(); i += 5) {
            if (library.getLibrary().get(i).equals(studio.getName())) {

                System.out.println(library.getLibrary().get(i - 1) + " " +
                        library.getLibrary().get(i) + " " +
                        library.getLibrary().get(i + 1) + " " +
                        library.getLibrary().get(i + 2) + " " +
                        library.getLibrary().get(i + 3));

            }
        }
    }
}
