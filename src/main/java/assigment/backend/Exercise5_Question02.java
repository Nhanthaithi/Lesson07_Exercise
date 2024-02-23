package assigment.backend;

import assigment.utils.LogsUtils;

import java.io.IOException;
import java.time.LocalDate;

public class Exercise5_Question02 {
    public static void Question02() {
        String filePath = "files/Exception.ser";
        try {
            // Một số mã có thể ném ra Exception
            throw new Exception("Demo Exception");
        } catch (Exception e) {
            try {
                LogsUtils.writeLog("Error occurred 1", "Demo Reason 1", e.getStackTrace(), LocalDate.now());
                LogsUtils.writeLog("Error occurred 2", "Demo Reason 2", e.getStackTrace(), LocalDate.now());
                LogsUtils.readExceptionFile(filePath);
            } catch (IOException ex) {
                ex.fillInStackTrace();
            } catch (ClassNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
