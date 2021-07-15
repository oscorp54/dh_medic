package dh.demo.medic.service;

import dh.demo.medic.dao.IMedicDao;
import dh.demo.medic.model.DHMedic;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MedicImpl implements IMedicServ {
  
  @Autowired
  private IMedicDao medicDao;

  @Override
  @Transactional(readOnly = true)
  public List<DHMedic> getList() {
    return (List<DHMedic>) medicDao.findAll();
  }
  
  @Override
  @Transactional(readOnly = true)
  public DHMedic find(Long id) {
    return medicDao.findById(id).orElse(new DHMedic());
  }
  
}
