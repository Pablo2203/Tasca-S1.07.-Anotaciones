package serializer.level2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serializer implements Serializable {
    public static void serializeObject(Serializable object, String file) {

        try {
            ObjectOutputStream employee_staff = new ObjectOutputStream(new FileOutputStream(file));
            employee_staff.writeObject(object);
            employee_staff.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
