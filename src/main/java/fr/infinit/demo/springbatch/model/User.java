package fr.infinit.demo.springbatch.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * User: Jean-Philippe Briend
 * Date: 5/12/11
 * Time: 8:41 PM
 */
@Entity
@Table(name="Utilisateurs")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long identifier;

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

    public Long getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Long identifier) {
        this.identifier = identifier;
    }
}
