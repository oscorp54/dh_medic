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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "medical_history")
public class DHMedicalHistory implements Serializable {
  
  private static final long serialVersionUID = 1L;
  
  @Id
  @Column(name = "id_")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Basic
  @Column(name = "description_")
  private String description;
  @Basic
  @Column(name = "prescription_drugs_")
  private String prescriptionDrugs;
  @Basic
  @Column(name = "consultation_date_")
  @Temporal(TemporalType.DATE)
  private Date consultationDate;
  @ManyToOne(fetch = FetchType.EAGER, targetEntity = DHPatient.class)
  @JoinColumn(name = "fk_patient_")
  private DHPatient patient;
  @ManyToOne(fetch = FetchType.EAGER, targetEntity = DHMedic.class)
  @JoinColumn(name = "fk_medic_")
  private DHMedic medic;

  public DHMedicalHistory() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getPrescriptionDrugs() {
    return prescriptionDrugs;
  }

  public void setPrescriptionDrugs(String prescriptionDrugs) {
    this.prescriptionDrugs = prescriptionDrugs;
  }

  public Date getConsultationDate() {
    return consultationDate;
  }

  public void setConsultationDate(Date consultationDate) {
    this.consultationDate = consultationDate;
  }

  public DHPatient getPatient() {
    return patient;
  }

  public void setPatient(DHPatient patient) {
    this.patient = patient;
  }

  public DHMedic getMedic() {
    return medic;
  }

  public void setMedic(DHMedic medic) {
    this.medic = medic;
  }

  @Override
  public String toString() {
    return "DHMedicalHistory{" + "id=" + id + ", description=" + description + ", prescriptionDrugs=" + prescriptionDrugs + ", consultationDate=" + consultationDate + '}';
  }
  
}
