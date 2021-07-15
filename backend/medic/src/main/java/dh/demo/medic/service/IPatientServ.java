package dh.demo.medic.service;

import dh.demo.medic.model.DHPatient;
import java.util.List;

public interface IPatientServ {
  
  public List<DHPatient> getList();
  
  public DHPatient find(Long id);
  
}
