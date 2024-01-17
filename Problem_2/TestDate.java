// TestDate.java
public class TestDate {
    public static void main(String[] args) {
        Date date = new Date(15, 10, 2021);
        System.out.println(date.toString());
        date.setDay(16);
        date.setMonth(11);
        date.setYear(2022);
        System.out.println(date.toString());
        System.out.println("Day: " + date.getDay());
        System.out.println("Month: " + date.getMonth());
        System.out.println("Year: " + date.getYear());
        date.setDate(25, 12, 2022);
        System.out.println(date.toString());
    }
}