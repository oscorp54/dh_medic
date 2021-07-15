package dh.demo.medic.service;

import dh.demo.medic.dao.IMedicalHistoryDao;
import dh.demo.medic.model.DHMedicalHistory;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MedicalHistoryImpl implements IMedicalHistoryServ { 
  
  @Autowired
  private IMedicalHistoryDao medicalHistoryDao;

  @Override
  @Transactional(readOnly = true)
  public List<DHMedicalHistory> getList() {
    return (List<DHMedicalHistory>) medicalHistoryDao.findAll();
  }

  @Override
  @Transactional
  public void save(DHMedicalHistory medicalHistoryModel) {
    medicalHistoryDao.save(medicalHistoryModel);
  }
  
}
