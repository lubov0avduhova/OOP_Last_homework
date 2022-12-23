package Realization;

import Library.Library;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.util.Iterator;

public class AddLibraryFromDB {

    private Iterator<Cell> cellIterator;
    private Row currentRow;


    public void addToLibrary(Library lib, Iterator<Row> rowIterator) {


        while (rowIterator.hasNext()) {
            currentRow = rowIterator.next();
            cellIterator = currentRow.iterator();

            for (int i = 0; i < currentRow.getLastCellNum(); i++) {
                lib.addToLibrary(String.valueOf(currentRow.getCell(i)));
            }
        }
        System.out.println("Добавление в библиотеку прошло успешно");

    }
}
