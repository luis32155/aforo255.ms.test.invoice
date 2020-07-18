package aforo255.ms.tes.invoice.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import aforo255.ms.tes.invoice.model.entity.Invoce;
import aforo255.ms.tes.invoice.service.InvoceService;



@RestController
public class ControllerInvoce {
	@Autowired
	private InvoceService service ;
	
	@GetMapping("listar")
	public List<Invoce> listar(){
		
		return (List<Invoce>)service.findAll();
	}
	
	@GetMapping("/ver/{id}")
	public Invoce detalle (@PathVariable Integer id ) {
		
		Invoce account = service.findById(id);
		return account ;
	}
}
