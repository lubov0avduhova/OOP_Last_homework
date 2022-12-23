package Classes;

public enum Duration {
    lessHour("Меньше 1 часа (60 минут)"),
    HourtoTwoHours("От 1 до 2-х часов (120 минут)"),
    TwoHourstoThree("От 2-х часов до 3-х часов (180 минут)"),
    moreThreeHours("Более 3-х часов");

    private String name;
    Duration(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
