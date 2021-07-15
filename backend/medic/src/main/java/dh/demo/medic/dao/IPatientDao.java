package dh.demo.medic.dao;

import dh.demo.medic.model.DHPatient;
import org.springframework.data.repository.CrudRepository;

public interface IPatientDao extends CrudRepository<DHPatient, Long> {
  
}
