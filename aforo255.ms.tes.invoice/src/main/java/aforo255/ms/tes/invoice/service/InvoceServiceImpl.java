package aforo255.ms.tes.invoice.service;

import java.util.List;

import aforo255.ms.tes.invoice.model.entity.Invoce;
import aforo255.ms.tes.invoice.repository.InvoceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class InvoceServiceImpl implements InvoceService{

	@Autowired
	private InvoceRepository invocerepository; 
	
	
	@Override
	public List<Invoce> findAll() {
		
		return(List<Invoce>) invocerepository.findAll();
	}

	@Override
	public Invoce findById(Integer id) {
		
		return invocerepository.findById(id).orElse(null);
	}

	@Override
	public Invoce save(Invoce invoce) {
		
		return invocerepository.save(invoce);
	}

}
