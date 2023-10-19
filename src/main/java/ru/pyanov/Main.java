package ru.pyanov;

import java.util.List;

/**
 * Создать справочник сотрудников.
 * Необходимо:
 * Создать класс справочник сотрудников, который содержит внутри коллекцию
 * сотрудников - каждый сотрудник должен иметь следующие атрибуты:
 * Табельный номер.
 * Номер телефона.
 * Имя.
 * Стаж.
 * Добавить метод, который ищет сотрудника по стажу (может быть список).
 * Добавить метод, который выводит номер телефона сотрудника по имени (может быть список).
 * Добавить метод, который ищет сотрудника по табельному номеру.
 * Добавить метод добавление нового сотрудника в справочник.
 */
public class Main {
    public static void main(String[] args) {
        EmployeeDirectory employeeDirectory = new EmployeeDirectory();

        Employee employee1 = new Employee(123, "555-1234", "Иванов", 5);
        Employee employee2 = new Employee(456, "555-5678", "Петров", 3);
        Employee employee3 = new Employee(789, "555-9876", "Сидорова", 8);

        employeeDirectory.addEmployee(employee1);
        employeeDirectory.addEmployee(employee2);
        employeeDirectory.addEmployee(employee3);

        System.out.println(employeeDirectory.findEmployeeByExperience(5));
        System.out.println(employeeDirectory.findPhoneNumberByName("Сидорова"));
        System.out.println(employeeDirectory.findEmployeeByServiceNumber(456));
    }
}