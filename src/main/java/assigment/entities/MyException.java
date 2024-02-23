package assigment.entities;

import java.io.Serializable;
import java.time.LocalDate;

public class MyException extends Exception implements Serializable {
    public static final long serialVersionUID = 1L;
    private final String reason;
    private final LocalDate time;

    public MyException(String message, String reason, StackTraceElement[] stackTrace, LocalDate time) {
        super(message);
        this.reason = reason;
        this.setStackTrace(stackTrace);
        this.time = time;
    }

    public String getReason() {
        return reason;
    }

    public LocalDate getTime() {
        return time;
    }
}
