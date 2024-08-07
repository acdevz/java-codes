package DateTime;

public class basics {
    public static void main(String[] args) {
        // Get the current date and time
        java.time.LocalDateTime currentDateTime = java.time.LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime);

        // Get the current date
        java.time.LocalDate currentDate = java.time.LocalDate.now();
        System.out.println("Current Date: " + currentDate);

        // Get the current time
        java.time.LocalTime currentTime = java.time.LocalTime.now();
        System.out.println("Current Time: " + currentTime);

        // Get the current day
        java.time.DayOfWeek currentDay = java.time.DayOfWeek.from(currentDate);
        System.out.println("Current Day: " + currentDay);

        // Get the current month
        java.time.Month currentMonth = java.time.Month.from(currentDate);
        System.out.println("Current Month: " + currentMonth);

        // Get the current year
        java.time.Year currentYear = java.time.Year.from(currentDate);
        System.out.println("Current Year: " + currentYear);

        // Get the current hour
        int currentHour = currentTime.getHour();
        System.out.println("Current Hour: " + currentHour);

        // Get the current minute
        int currentMinute = currentTime.getMinute();
        System.out.println("Current Minute: " + currentMinute);

        // Get the current second
        int currentSecond = currentTime.getSecond();
        System.out.println("Current Second: " + currentSecond);

        // Get the current nanosecond
        int currentNano = currentTime.getNano();
        System.out.println("Current Nano: " + currentNano);

        /* ⭐⭐ */
        // Get the current time in milliseconds
        long currentMillis = System.currentTimeMillis();
        System.out.println("Current Time in Milliseconds: " + currentMillis);

        // Get the current time in nanoseconds
        long currentNanos = System.nanoTime();
        System.out.println("Current Time in Nanoseconds: " + currentNanos);
    }
}
