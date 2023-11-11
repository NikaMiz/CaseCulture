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

@Entity
@Table(name = "places")
public class Place {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "title")
  private String title;

  @Column(name = "end")
  @Temporal(TemporalType.TIMESTAMP)
  private Date end;

  @Column(name = "address")
  private String address;

  @Column(name = "description")
  private String description;

  @Column(name = "begin")
  @Temporal(TemporalType.TIMESTAMP)
  private Date begin;

  public Place() {
  }

  public Place(String title, Date end, String address, String description, Date begin) {
    this.title = title;
    this.end = end;
    this.address = address;
    this.description = description;
    this.begin = begin;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Date getEnd() {
    return end;
  }

  public void setEnd(Date end) {
    this.end = end;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Date getBegin() {
    return begin;
  }

  public void setBegin(Date begin) {
    this.begin = begin;
  }

  @Override
  public String toString() {
    return "Place{" +
        "id=" + id +
        ", title='" + title + '\'' +
        ", end=" + end +
        ", address='" + address + '\'' +
        ", description='" + description + '\'' +
        ", begin=" + begin +
        '}';
  }
}
