package Library;

import Realization.AddLibraryFromDB;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.Iterator;

public class Database {

    private FileInputStream fileinput;
    private XSSFWorkbook workbook;
    private XSSFSheet sheet;
    private Iterator<Row> rowIterator;
    private AddLibraryFromDB addLibraryFromDB;



    public void setFileinput(FileInputStream fileinput) {
        this.fileinput = fileinput;
    }

    public FileInputStream getFileinput() {
        return fileinput;
    }

    public void setWorkbook(XSSFWorkbook workbook) {
        this.workbook = workbook;
    }

    public XSSFWorkbook getWorkbook() {
        return workbook;
    }

    public void setSheet(XSSFSheet sheet) {
        this.sheet = sheet;
    }
    public XSSFSheet getSheet() {
        return sheet;
    }

    public Iterator<Row> getRowIterator() {
        return rowIterator;
    }

    public void setRowIterator(Iterator<Row> rowIterator) {
        this.rowIterator = rowIterator;
    }

    public AddLibraryFromDB getAddLibraryFromDB() {
        return addLibraryFromDB;
    }

    public void setAddLibraryFromDB(AddLibraryFromDB addLibraryFromDB) {
        this.addLibraryFromDB = addLibraryFromDB;
    }
}





