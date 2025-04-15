package entities;

public class EmployeeWFOffice extends Employee {
    private static double fuel = 80;
    public EmployeeWFOffice(String name, String surname, int pricePerHour) {
        super(name, surname, pricePerHour);

    }

    @Override
    public double calculateSalary(double workedHours) {
      return workedHours * getPricePerHour() + fuel;
    }
    @Deprecated //EX2
    public double calculateSalaryWithoutPluses(double workedHours) {
        return getPricePerHour() * workedHours;
    }
}
