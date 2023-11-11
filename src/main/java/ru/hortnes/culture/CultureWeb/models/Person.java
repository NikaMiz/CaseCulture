package ru.hortnes.culture.CultureWeb.models;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Person")
public class Person {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Email
    @Column(name = "username")
    private String username;

    @Column(name = "birthday")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy") // дд/мм/гггг
    private Date birthday;

    @Column(name = "password")
    private String password;

    public Person() {
    }

    public Person(String username, Date birthday) {
        this.username = username;
      this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

  @Override
  public String toString() {
    return "Person{" +
        "id=" + id +
        ", username='" + username + '\'' +
        ", birthday=" + birthday +
        ", password='" + password + '\'' +
        '}';
  }
}
