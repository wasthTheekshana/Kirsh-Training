package PrototypeDesignPattern.RealWorld;

import java.util.HashMap;
import java.util.Map;

public class RegisteryPerson {

    private Map<PersonType,UNivercityPerson> person = new HashMap<>();

    public RegisteryPerson() {
        this.initaited();
    }

    public UNivercityPerson getPerson(PersonType personType){
        UNivercityPerson uni = null;

        try {
            uni = (UNivercityPerson) person.get(personType).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return  uni;
    }


    private void initaited() {

        Student st = new Student();
        st.setName("ABC");
        st.setNIC("9714141554");

        Employee em = new Employee();
        em.setSalary(50000);
        em.setName("DGF");

        person.put(PersonType.STUDENT,st);
        person.put(PersonType.EMPLOYEE,em);
    }



}
