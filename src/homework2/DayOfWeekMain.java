package homework2;

public class DayOfWeekMain {
    public static void main(String[] args) {
      /*    for (DayOfWeek d : DayOfWeek.values()) {
          System.out.println(d.ordinal() + 1 + ". " + d + "- " + d.getType() + " " + d.getWorkHours());
         }*/
        System.out.println(getWorkingHours(DayOfWeek.FRIDAY));
        System.out.println(getWorkingHours(DayOfWeek.SATURDAY));
    }

    public static String getWorkingHours(DayOfWeek day) {
        int hours = 0;
        if (day.getWorkHours() != 0) {
            DayOfWeek[] Week = DayOfWeek.values();
            for (int i = day.ordinal(); i < Week.length; i++) {
                hours += Week[i].getWorkHours();
            }
        } else {
            return day.name() +" - " +  day.getType();
        }
        return day.name() +" - " + "До окончания недели осталось: " + hours + " рабочих часов";
    }
}



