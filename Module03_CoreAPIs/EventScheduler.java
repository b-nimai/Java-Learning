package Module03_CoreAPIs;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class EventScheduler {
    String eventName;
    LocalDate date;

    EventScheduler(String eventName, LocalDate date) {
        this.eventName = eventName;
        this.date = date;
    }

    public static void main(String[] args) {
        EventScheduler ev2 = new EventScheduler("Team Meetup", LocalDate.of(2026, 04, 13));
        EventScheduler ev1 = new EventScheduler("Java Exam", LocalDate.of(2026, 04, 10));
        EventScheduler ev3 = new EventScheduler("Java Exam", LocalDate.of(2026, 04, 21));
        EventScheduler ev4 = new EventScheduler("Java Exam", LocalDate.of(2026, 04, 02));

        EventScheduler[] events = { ev1, ev2, ev3, ev4 };
        Arrays.sort(events, (e1, e2) -> e1.date.compareTo(e2.date));
        LocalDate today = LocalDate.now();

        System.out.println("=== Upcoming Events ===");
        for (EventScheduler event : events) {
            StringBuilder st = new StringBuilder();
            long days = ChronoUnit.DAYS.between(today, event.date);
            if (days <= 7)
                st.append("[SOON] ");

            st.append(event.eventName);
            st.append(" - ");
            st.append(event.date.toString());
            st.append(" (" + days + " days away)");
            System.out.println(st);
        }
    }
}
