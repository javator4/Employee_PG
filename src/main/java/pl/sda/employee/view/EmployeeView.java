package pl.sda.employee.view;

import pl.sda.employee.database.EmployeeDataBase;

public class EmployeeView {

    public void showAllEmployees(){

    // 1. Imie : Nazwisko: Płeć:
    // 2. Imie : Nazwisko: Płeć:

        for (int i = 0; i < EmployeeDataBase.employeeList.size(); i++) {

            System.out.println((i+1)+" " +EmployeeDataBase.employeeList.get(i).getName()+ " "+
                    EmployeeDataBase.employeeList.get(i).getLastName() + " "+ EmployeeDataBase.employeeList.get(i).getSex());

        }



    }

}
