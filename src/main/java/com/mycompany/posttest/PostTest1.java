/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest;
import com.employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author fauza
 */
public class PostTest1 {
    public static void main(String[] args) {
        
        Employee employee1 = new Employee("Fauzan Gifari", 001, 1000000);
        Employee employee2 = new Employee("Muhammad Sumbul", 002, 700000);
        Employee employee3 = new Employee("Khalid Kashmiri", 003, 500000);
        Employee employee4 = new Employee("Khidir Karawita", 004, 500000);
        Employee employee5 = new Employee("Ismail Ahmad Kanabawi", 005, 700000);
        Employee employee6 = new Employee("Usman Abdul Jalil Sisha", 006, 800000);
        Employee employee7 = new Employee("Yaqub Qamar Ad-Din Dibiazah", 007, 900000);
        
        
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        employees.add(employee7);
        
        for (Employee employee : employees){
            String employeeName = "Nama Pegawai " + employee.name;
            String employeeId = " ID " + employee.employeeId;
            String employeeSalary = " Gaji " + employee.salary;
            System.out.println(employeeName.concat(" dengan" + employeeId + " memiliki" + employeeSalary));
        }
    }
}
