package dh.demo.medic.service;

import dh.demo.medic.dao.IPatientDao;
import dh.demo.medic.model.DHPatient;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PatientImpl implements IPatientServ {
  
  @Autowired
  private IPatientDao patientDao;

  @Override
  @Transactional(readOnly = true)
  public List<DHPatient> getList() {
    return (List<DHPatient>) patientDao.findAll();
  }

  @Override
  @Transactional(readOnly = true)
  public DHPatient find(Long id) {
    return patientDao.findById(id).orElse(new DHPatient());
  }
  
}
