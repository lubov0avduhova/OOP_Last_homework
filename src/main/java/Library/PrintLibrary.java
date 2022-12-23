package Library;

public class PrintLibrary extends Library{
    public void printLibrary() {
        for (int i = 0; i < getLibrary().size() - 1; i += 5) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%-40s", getLibrary().get((i + j)));
            }
            System.out.println("\t");
        }
    }
}
