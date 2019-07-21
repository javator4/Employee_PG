package pl.sda.employee.controller;

import pl.sda.employee.model.Employee;
import pl.sda.employee.service.EmployeeService;
import pl.sda.employee.view.EmployeeView;

import java.util.Scanner;

public class EmployeeController {

    private EmployeeService employeeService;
    private EmployeeView employeeView;

    public EmployeeController(EmployeeView employeeView, EmployeeService employeeService){
        this.employeeService = employeeService;
        this.employeeView = employeeView;
    }



    public void prepareEmployee(){
        //pobiersanie danych

        Scanner input = new Scanner(System.in);


        System.out.println("Podaj imię: ");
        String name = input.nextLine();
        System.out.println(name);

        System.out.println("Podaj nazwisko: ");
        String lastName = input.nextLine();
        System.out.println(lastName);

        System.out.println("Podaj płeć: ");
        char sex = input.next().charAt(0); // do sprawdzenia nauczenia wyjasnienia
        System.out.println(sex);

        System.out.println("Podaj numer działu: ");
        int departmentNumber = input.nextInt();
        System.out.println(departmentNumber);

       employeeService.addEmployee(new Employee(name, lastName, sex, departmentNumber));

        // tworzenie obiektu emploee
        // przesłanie obiektu

    }

    public void showEmployee(){
        employeeView.showAllEmployees();
    }
}
