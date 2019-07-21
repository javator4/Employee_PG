package pl.sda.employee.service;

import pl.sda.employee.database.EmployeeDataBase;
import pl.sda.employee.model.Employee;

public class EmployeeService {
    public void addEmployee(Employee employee){
        EmployeeDataBase.employeeList.add(employee);


    }

    public void removeEmployee(int index){


    }
    public void  increaseSalary(float p){


    }


}
