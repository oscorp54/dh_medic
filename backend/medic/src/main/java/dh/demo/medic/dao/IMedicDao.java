package dh.demo.medic.dao;

import dh.demo.medic.model.DHMedic;
import org.springframework.data.repository.CrudRepository;

public interface IMedicDao extends CrudRepository<DHMedic, Long> {
  
}
