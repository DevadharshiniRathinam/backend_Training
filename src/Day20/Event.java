package Day20;
/*
Use Date and Time API, Factory Methods, and Streams to build a simple scheduling system.
Create a class Event with fields name, dateTime, and duration.
Create a list of events using List.of().
Provide the following functionality:
Display all events.
Filter events based on a specific date.
Calculate the duration between events using Duration.between.
Example Input:
Events:
"Meeting", 2025-01-28T10:00, 1 hour
"Workshop", 2025-01-28T13:00, 2 hours
Example Output:
Events on 2025-01-28:
"Meeting"
"Workshop"
 explain this question
 */
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
public class Event {
    String meeting;
    LocalDateTime  localDateTime;
    Duration duration;
    public Event(String meeting, LocalDateTime  localDateTime, Duration duration) {
        this.meeting=meeting;
        this. localDateTime= localDateTime;
        this.duration=duration;
    }
    public String getMeeting() {
        return meeting;
    }
    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }
    public Duration getDuration() {
        return duration;
    }
    @Override
    public String toString()
    {
        return( meeting+","+localDateTime+","+duration.toHours());
    }
    public static void main(String[] args) {
        List<Event> l=List.of(new Event("Meeting",LocalDateTime.of(2025,01,28,10,00)
                , Duration.ofHours(1)),
                new Event("Workshop",LocalDateTime.of(2025,01,28,13,00)
                        ,Duration.ofHours(2)));
        l.forEach(System.out::println);
        LocalDate find=LocalDate.of(2025,01,28);
        l.stream().filter(v->v.getLocalDateTime().toLocalDate().equals(find)).forEach(v -> System.out.println(v.getMeeting()));
        Event meeting=l.get(0);
        Event work=l.get(1);
        Duration d=Duration.between(meeting.localDateTime, work.localDateTime);
        System.out.println(d.toHours());
    }
}
