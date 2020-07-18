package aforo255.ms.tes.invoice.service;
import java.util.List;

import aforo255.ms.tes.invoice.model.entity.Invoce;

public interface InvoceService {

	public List<Invoce> findAll();
	public Invoce findById(Integer id);
	public Invoce save(Invoce invoce);
	
}
