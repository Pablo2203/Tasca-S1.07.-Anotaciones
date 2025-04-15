package entities;

abstract public class Employee {
    private String name;
    private String surname;
    private int pricePerHour;

    public Employee(String name, String surname, int pricePerHour) {
        this.name = name;
        this.surname = surname;
        this.pricePerHour = pricePerHour;
    }

    public int getPricePerHour() {
        return pricePerHour;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public abstract double calculateSalary(double workedHours);

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", pricePerHour=" + pricePerHour +
                '}';
    }
}
