package dh.demo.medic.dao;

import dh.demo.medic.model.DHMedicalHistory;
import org.springframework.data.repository.CrudRepository;

public interface IMedicalHistoryDao extends CrudRepository<DHMedicalHistory, Long> {
  
}
