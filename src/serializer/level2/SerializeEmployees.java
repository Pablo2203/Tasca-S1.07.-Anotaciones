package serializer.level2;

import annotation.level2.level3.SerializeAnnotation;
import entities.Employee;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.List;

import static serializer.level2.Serializer.serializeObject;

public class SerializeEmployees {
    private final List<Employee> employees;

    public SerializeEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @SerializeAnnotation(file = "employees_serialized.json")
    public List<Employee> getEmployeesToSerialize() {
        return employees;
    }


    public static void processSerialization(Object obj) {
            Class<?> clazz = obj.getClass();

            for (Method method : clazz.getDeclaredMethods()) {
                if (method.isAnnotationPresent(SerializeAnnotation.class)) {
                    SerializeAnnotation annotation = method.getAnnotation(SerializeAnnotation.class);
                    String file = annotation.file();


                    try {
                    method.setAccessible(true); // Asegura el acceso
                    Serializable objectToSerialize = (Serializable) method.invoke(obj); // Obtiene el objeto
                    serializeObject(objectToSerialize, file); // Serializa el objeto
                } catch (Exception e) {
                    System.out.println("Error durante la serialización: " + e.getMessage());
                }
            }
        }
    }
}

