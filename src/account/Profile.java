package account;

import java.util.Calendar;
import java.util.GregorianCalendar;
public class Profile {

    // Fields
    private Gender gender;
    private GregorianCalendar birth;
    private String name;

    // Constructors
    public Profile(String name, Gender gender, GregorianCalendar birth) {
        this.name = name;
        this.birth = birth;
        this.gender = gender;
    }

    // Getters and Setters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }


    public void setBirth(GregorianCalendar birth) {
        this.birth = birth;
    }

    public GregorianCalendar getBirth() {
        return birth;
    }

    // Behaviors
    @Override
    public String toString() {
        return "The name is: " + name + ", the day of birth is: " + birth.get(Calendar.DATE) +", month of birth: "+  birth.get(Calendar.MONTH) +", year of birth: "+birth.get(Calendar.YEAR) +" ,the gender is: " + gender;
    }
}