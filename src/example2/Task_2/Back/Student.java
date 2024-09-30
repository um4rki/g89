package example2.Task_2.Back;

import example2.Task_2.Back.Enums.EducationStage;
import example2.Task_2.Back.Enums.StackEnum;

public non-sealed class Student extends User {
    private static int developerCounter = 1;

    private int developerId;
    private double salary;
    private EducationStage status;
    private StackEnum stack;

    public Student(String fullName, String email, String password, double salary, EducationStage status, StackEnum stack) {
        super(developerCounter, fullName, email, password);
        this.developerId = developerCounter++;
        this.salary = salary;
        this.status = status;
        this.stack = stack;
    }

    public int getStudentId() {
        return developerId;
    }

    public void setStudentId(int developerId) {
        this.developerId = developerId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public EducationStage getStatus() {
        return status;
    }

    public void setStatus(EducationStage status) {
        this.status = status;
    }

    public StackEnum getStack() {
        return stack;
    }

    public void setStack(StackEnum stack) {
        this.stack = stack;
    }
}
