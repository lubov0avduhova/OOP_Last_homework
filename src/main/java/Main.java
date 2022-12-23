import Classes.Duration;
import Classes.Genre;
import Classes.Studio;
import Library.ImportDB;
import Library.Library;
import Library.PrintLibrary;
import Realization.FindMovie;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        Library lib = new Library();

        ImportDB db = new ImportDB("C:\\Users\\The Sun\\Desktop\\Studies\\OOP\\OOP_Last_homework\\src\\main\\java\\Import movie.xlsx");
        db.importDB(lib);

        lib.addToLibrary("Тест", Studio.Warner, 1995, Genre.Comedy, Duration.lessHour);
        FindMovie findMovie = new FindMovie();

        PrintLibrary printLibrary = new PrintLibrary();
        printLibrary.printLibrary();

        findMovie.findMoviebyStudio(lib, Studio.Warner);
        findMovie.findMoviebyTitle(lib, "Зеленая миля");

    }
}

