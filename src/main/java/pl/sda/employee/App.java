package pl.sda.employee;

import pl.sda.employee.controller.EmployeeController;
import pl.sda.employee.database.EmployeeDataBase;
import pl.sda.employee.model.Employee;
import pl.sda.employee.service.EmployeeService;
import pl.sda.employee.view.EmployeeView;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(EmployeeDataBase.employeeList);

        EmployeeDataBase.employeeList.add(new Employee("Wojtek", "Kaszubski", 'M', 4));
        System.out.println(EmployeeDataBase.employeeList);


        Scanner input = new Scanner(System.in);


        EmployeeController controller = new EmployeeController(new EmployeeView(), new EmployeeService());
        while (true){
            System.out.println("1. Dodaj pracownika");
            System.out.println("2. Pokaż pracowników");
            System.out.println("0. Zamknij program");
        int value = input.nextInt();
        if(value == 0){ break;}
        switch(value) {
            case 1:
                controller.prepareEmployee();
                // metoda na dodanie - wywolane z poziomu kontrolera
                break;
            case 2:
                // metoda na pokazanie - wywolana z poziomu kontrolera
                controller.showEmployee();
                break;
            case 0:
                // cokolwiek
                break;
        }
        }
        System.out.println(EmployeeDataBase.employeeList);
    }
}
