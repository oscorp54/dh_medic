package dh.demo.medic.service;

import dh.demo.medic.model.DHMedic;
import java.util.List;

public interface IMedicServ {
  
  public List<DHMedic> getList();
  
  public DHMedic find(Long id);
  
}
