package dh.demo.medic.rest;

import dh.demo.medic.model.DHPatient;
import dh.demo.medic.service.IPatientServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientRest {
  
  @Autowired
  private IPatientServ patientServ;
  
  @PostMapping("/list")
  public List<DHPatient> getListPatient() {
    return patientServ.getList();
  }
  
  @PostMapping("/find")
  public DHPatient findPatient(DHPatient value) {
    return patientServ.find(value.getId());
  }
  
}
