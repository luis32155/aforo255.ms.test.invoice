package aforo255.ms.tes.invoice.service;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import aforo255.ms.tes.invoice.model.entity.*;

@Service
public class OperationEvents {
	@Autowired
	private InvoceService repository;

	@Autowired
	ObjectMapper objectMapper;
	
	private Logger log =LoggerFactory.getLogger(OperationEvents.class);

	public void processTransactionEvent(ConsumerRecord<Integer, String> consumerRecord) throws JsonMappingException, JsonProcessingException {

		
		Invoce invoce = new Invoce();
		Operation transactionEvent=  objectMapper.readValue(consumerRecord.value(), Operation.class);
		log.info("transactionEvent:{}",transactionEvent.getIdinvoce());
		invoce=repository.findById(transactionEvent.getIdinvoce());
		

		
	}
}
