package dh.demo.medic.service;

import dh.demo.medic.model.DHMedicalHistory;
import java.util.List;

public interface IMedicalHistoryServ {
  
  public List<DHMedicalHistory> getList();
  
  public void save(DHMedicalHistory medicalHistoryModel);
  
}
