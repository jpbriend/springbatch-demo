package fr.infinit.demo.springbatch.model;

import java.util.Date;

/**
 * User: Jean-Philippe Briend
 * Date: 5/12/11
 * Time: 8:41 PM
 */
public class User {

    private int id;
    private String firstName;
    private String lastName;
    private Date birthday;

    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
