package services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractSevice {

	private OnlinePaymentService onlinePaymentService;

	public ContractSevice(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, int month) {
		
		double basicQuota = contract.getTotalValue() / month;
		
		for(int i = 1; i <= month; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);
			
			double interest =  onlinePaymentService.interest(basicQuota, i);
			double fee = onlinePaymentService.paymentFee(basicQuota + interest);
			double quota = basicQuota + interest + fee;
			
			contract.getInstallments().add(new Installment(dueDate, quota));
		}
		
	}
}
