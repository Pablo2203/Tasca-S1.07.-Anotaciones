package entities;

public class EmployeeWFHome extends Employee {
    private static final int INTERNET_PLAN = 40;
    public EmployeeWFHome(String name, String surname, int pricePerHour) {
        super(name, surname, pricePerHour);
    }

    @Override
    public double calculateSalary(double workedHours) {
        return workedHours * getPricePerHour() + INTERNET_PLAN;

    }

    @Deprecated //EX2
    public double calculateSalaryWithoutPluses(double workedHours) {
        return getPricePerHour() * workedHours;
    }
}
/*En los trabajadores online, el método para calcular su sueldo recibirá por parámetro
el número de horas trabajadas al mes. A la hora de calcular el sueldo se multiplicará
el número de horas trabajadas por el precio/hora y se le sumará el precio de la tarifa
plana de Internet, que será una constante de la clase Trabajador Online. */


