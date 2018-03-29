import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

    static LocalDateTime birthDateTime;

    Gigasecond(LocalDate birthDate) {

        this.birthDateTime = birthDate.atStartOfDay();
        getDate();
    }

    Gigasecond(LocalDateTime birthDateTime) {
        this.birthDateTime = birthDateTime;
        getDate();
    }

    static LocalDateTime getDate() {
        return birthDateTime.plusSeconds(1000000000);
    }

}
