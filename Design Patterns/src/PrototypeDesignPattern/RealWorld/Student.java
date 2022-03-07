package PrototypeDesignPattern.RealWorld;

public class Student extends UNivercityPerson{

    private String UniID;

    public String getUniID() {
        return UniID;
    }

    public void setUniID(String uniID) {
        UniID = uniID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "UniID='" + UniID + '\'' +
                '}';
    }
}
