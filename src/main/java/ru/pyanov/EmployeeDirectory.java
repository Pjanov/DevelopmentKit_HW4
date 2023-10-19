package ru.pyanov;

import java.util.ArrayList;
import java.util.List;

/**
 * Справочник сотрудников
 */
public class EmployeeDirectory {
    private List<Employee> employees;

    public EmployeeDirectory() {
        employees = new ArrayList<>();
    }

    /**
     * Добавить сотрудника
     *
     * @param employee сотрудник
     */
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    /**
     * Найти сотрудника по стажу
     *
     * @param workExperience Стаж
     * @return Список сотрудников
     */
    public List<Employee> findEmployeeByExperience(int workExperience) {
        List<Employee> employeeList = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getWorkExperience() == workExperience) {
                employeeList.add(employee);
            }
        }
        return employeeList;
    }

    /**
     * Найти номер телефона по имени
     *
     * @param name имя
     * @return Список номеров
     */
    public List<String> findPhoneNumberByName(String name) {
        List<String> foundPhoneNumbers = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                foundPhoneNumbers.add(employee.getPhoneNumber());
            }
        }
        return foundPhoneNumbers;
    }

    /**
     * Найти сотрудника по табельному номеру
     *
     * @param serviceNumber табельный номер
     * @return Сотрудника
     */
    public Employee findEmployeeByServiceNumber(int serviceNumber) {
        for (Employee employee : employees) {
            if (employee.getEmployeeNumber() == serviceNumber) {
                return employee;
            }
        }
        return null;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "Справочник сотрудников" + employees;
    }
}
