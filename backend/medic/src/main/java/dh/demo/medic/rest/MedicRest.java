package dh.demo.medic.rest;

import java.util.List;
import dh.demo.medic.model.DHMedic;
import dh.demo.medic.service.IMedicServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medic")
public class MedicRest {
  
  @Autowired
  private IMedicServ medicServ;
  
  @PostMapping("list")
  public List<DHMedic> getListMedic() {
    return medicServ.getList();
  }
  
  @PostMapping("find")
  public DHMedic findMedic(DHMedic value) {
    return medicServ.find(value.getId());
  }
  
}
