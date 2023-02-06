package services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, int months) {
	
		double BasicQuota =contract.getTotalValue() / months;
		
		for (int i = 1; i<= months; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);
			
			double interest = onlinePaymentService.interest(BasicQuota, i);
			double fee = onlinePaymentService.paymentFee(BasicQuota+interest); 
			double quota = BasicQuota + interest +fee;
			
			
			contract.getInstalments().add(new Installment(dueDate, quota));
		}
		
	}
	
	
	
	
}
