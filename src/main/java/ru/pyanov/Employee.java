package ru.pyanov;

public class Employee {
    private int employeeNumber;
    private String phoneNumber;
    private String name;
    private int workExperience;

    /**
     * Конструктор
     *
     * @param employeeNumber Табельный номер
     * @param phoneNumber    Номер телефона
     * @param name           Имя
     * @param workExperience Стаж работы
     */
    public Employee(int employeeNumber, String phoneNumber, String name, int workExperience) {
        this.employeeNumber = employeeNumber;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.workExperience = workExperience;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    @Override
    public String toString() {
        return "Сотрудник{" +
                "табельный номер: " + employeeNumber +
                ", номер телефона: '" + phoneNumber + '\'' +
                ", имя: '" + name + '\'' +
                ", стаж: " + workExperience +
                '}';
    }
}
