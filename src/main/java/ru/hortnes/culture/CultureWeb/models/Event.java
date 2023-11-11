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
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "events")
public class Event {

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

  @Column(name = "price")
  private int price;

  @Column(name = "count_visitor")
  private int countVisitor;

  @Column(name = "description")
  private String description;

  @Column(name = "type_visitor")
  private String typeVisitor;

  @Column(name = "day")
  @Temporal(TemporalType.DATE)
  @DateTimeFormat(pattern = "dd/MM/yyyy") // дд/мм/гггг
  private Date day;

  @Column(name = "begin")
  @Temporal(TemporalType.TIMESTAMP)
  private Date begin;

  public Event() {
  }

  public Event(String title, Date end, String address, int price, int countVisitor,
      String description, String typeVisitor, Date day, Date begin) {
    this.title = title;
    this.end = end;
    this.address = address;
    this.price = price;
    this.countVisitor = countVisitor;
    this.description = description;
    this.typeVisitor = typeVisitor;
    this.day = day;
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

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getCountVisitor() {
    return countVisitor;
  }

  public void setCountVisitor(int countVisitor) {
    this.countVisitor = countVisitor;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getTypeVisitor() {
    return typeVisitor;
  }

  public void setTypeVisitor(String typeVisitor) {
    this.typeVisitor = typeVisitor;
  }

  public Date getDay() {
    return day;
  }

  public void setDay(Date day) {
    this.day = day;
  }

  public Date getBegin() {
    return begin;
  }

  public void setBegin(Date begin) {
    this.begin = begin;
  }

  @Override
  public String toString() {
    return "Event{" +
        "id=" + id +
        ", title='" + title + '\'' +
        ", end=" + end +
        ", address='" + address + '\'' +
        ", price=" + price +
        ", countVisitor=" + countVisitor +
        ", description='" + description + '\'' +
        ", typeVisitor='" + typeVisitor + '\'' +
        ", day=" + day +
        ", begin=" + begin +
        '}';
  }
}
