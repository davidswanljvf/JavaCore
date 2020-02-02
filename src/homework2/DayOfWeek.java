package homework2;

public enum DayOfWeek {
    MONDAY("Рабочий день", 8),
    TUESDAY("Рабочий день", 8),
    WEDNESDAY("Рабочий день", 8),
    THURSDAY("Рабочий день", 8),
    FRIDAY("Рабочий день", 8),
    SATURDAY("Выходной", 0),
    SUNDAY("Выходной", 0);

    private String type;
    private int workHours;


    DayOfWeek(String type, int workHours) {
        this.type = type;
        this.workHours = workHours;
    }

    public String getType() {
        return type;
    }

    public int getWorkHours() {
        return workHours;
    }
}
