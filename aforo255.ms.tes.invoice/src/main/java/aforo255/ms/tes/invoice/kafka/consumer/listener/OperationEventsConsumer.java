package aforo255.ms.tes.invoice.kafka.consumer.listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import aforo255.ms.tes.invoice.service.OperationEvents;

@Component
public class OperationEventsConsumer {
	@Autowired
	private OperationEvents transactionEvents;
	
	 private Logger log =LoggerFactory.getLogger(OperationEventsConsumer.class);
	 @KafkaListener(topics = {"operation-events"})
	 public void onMessage(ConsumerRecord<Integer, String> consumerRecord) throws JsonMappingException, JsonProcessingException {
		 
		 log.info("ConsumerRecord account :{}",consumerRecord);
		 transactionEvents.processTransactionEvent(consumerRecord);	
		 
	 }
}
