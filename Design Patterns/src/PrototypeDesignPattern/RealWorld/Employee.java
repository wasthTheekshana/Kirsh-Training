package PrototypeDesignPattern.RealWorld;

public class Employee extends UNivercityPerson{

    private String UniEmployeeId;
    private int salary;

    public String getUniEmployeeId() {
        return UniEmployeeId;
    }

    public void setUniEmployeeId(String uniEmployeeId) {
        UniEmployeeId = uniEmployeeId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "UniEmployeeId='" + UniEmployeeId + '\'' +
                ", salary=" + salary +
                '}';
    }
}
