package Library;

import Realization.AddLibraryFromDB;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ImportDB extends Database {
    private String path;

    public ImportDB(String path) {
        this.path = path;
    }

    public void importDB(Library lib) throws IOException {
        setFileinput(new FileInputStream(path));
        setWorkbook(new XSSFWorkbook(getFileinput()));
        setSheet(getWorkbook().getSheetAt(0));

        setRowIterator(getSheet().iterator());
        System.out.println("Импорт библиотеки прошел успешно");

        setAddLibraryFromDB(new AddLibraryFromDB());

        getAddLibraryFromDB().addToLibrary(lib, getRowIterator());

    }
}
