package Classes;

public enum Genre {
    Drama("Драма"), Comedy("Комедия"), Horror("Ужасы");

    private String name;

    Genre(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
