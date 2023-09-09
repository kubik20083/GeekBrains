package sem1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task1 {
    public static void run() {
        System.out.println("Hello world");
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("Дата: dd.MM.yyyy., время: hh ч. mm мин. ss сек.");
        System.out.println(formatter.format(now));


    }
}
