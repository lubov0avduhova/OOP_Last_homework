package Classes;

public enum Studio {
    Warner("Warner Bros. Pictures"),
    Paramount("Paramount Pictures"),
    New_Line("New Line Cinema");

    private String name;

    Studio(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}



