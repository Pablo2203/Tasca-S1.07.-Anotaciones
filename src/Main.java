import entities.Employee;
import entities.EmployeeWFHome;
import entities.EmployeeWFOffice;
import serializer.level2.SerializeEmployees;

import java.util.ArrayList;
import java.util.List;

public class Main {
    @SuppressWarnings("Deprecated") //EX2
    public static void main(String[] args) {
    EmployeeWFOffice employee1 = new EmployeeWFOffice("Juan", "Perez", 19);
    EmployeeWFHome employee2 = new EmployeeWFHome("Pedro", "Pascal", 18);

    System.out.println(employee1.getName() + " gana: " + employee1.calculateSalary(144));
    System.out.println(employee2.getName() + " gana: " + employee2.calculateSalary(150));


    //EX2
    System.out.println("--------------EX2--------------------");
    System.out.println(employee1.getName() + " gana: " + employee1.calculateSalaryWithoutPluses(144));
    System.out.println(employee2.getName() + " gana: " + employee2.calculateSalaryWithoutPluses(150));


    //LVL2 EX 1
    System.out.println("--------------LEVEL2 EX1--------------------");
    List<Employee> employees = new ArrayList<>();
    employees.add(employee1);
    employees.add(employee2);

    SerializeEmployees serializer = new SerializeEmployees(employees);

    SerializeEmployees.processSerialization(serializer);



    }



    }
