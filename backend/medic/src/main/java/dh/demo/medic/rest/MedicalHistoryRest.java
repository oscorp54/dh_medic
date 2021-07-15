package dh.demo.medic.rest;

import dh.demo.medic.model.DHMedicalHistory;
import dh.demo.medic.service.IMedicalHistoryServ;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicalhistory")
public class MedicalHistoryRest {
  
  @Autowired
  private IMedicalHistoryServ medicalHistoryServ;
  
  @PostMapping("list")
  public List<DHMedicalHistory> getListMedicalHistory() {
    return medicalHistoryServ.getList();
  }
  
  @PostMapping("create")
  public void saveMedicalHistory(DHMedicalHistory value) {
    medicalHistoryServ.save(value);
  }
          
}
