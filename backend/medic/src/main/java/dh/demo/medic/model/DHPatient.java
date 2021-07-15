package dh.demo.medic.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.List;

@Entity
@Table(name = "patient")
public class DHPatient implements Serializable {
  
  private static final long serialVersionUID = 1L;
  
  @Id
  @Column(name = "id_")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Basic
  @Column(name = "name_")
  private String name;
  @Basic
  @Column(name = "lastname_")
  private String lastname;
  @Basic
  @Column(name = "birthdate_")
  @Temporal(TemporalType.DATE)
  private Date birthdate;
  @Basic
  @Column(name = "address_")
  private String address;
  @Basic
  @Column(name = "photo_")
  private String photo;

  public DHPatient() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public Date getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(Date birthdate) {
    this.birthdate = birthdate;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }

  @Override
  public String toString() {
    return "DHPatient{" + "id=" + id + ", name=" + name + ", lastname=" + lastname + ", birthdate=" + birthdate + ", address=" + address + ", photo=" + photo + '}';
  }
  
}
