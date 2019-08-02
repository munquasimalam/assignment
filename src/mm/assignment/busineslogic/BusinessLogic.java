package mm.assignment.busineslogic;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

import mm.assignment.model.User;
import mm.assignment.utils.DateUtils;

public class BusinessLogic {
	public static double billGeneration(User user) {
		double netPayableAmount = 0.0;
		double discount = 0.0;
		
		//Map billDetails = new HashMap();
		try {
		if(user != null && user.getGrossAmount() != null) {
			if(user.isEmployeeToStore()) {
				discount = (user.getGrossAmount() * 30)/100;
			} else if(user.isAffiliatedToStore()) {
				discount = (user.getGrossAmount() * 10)/100;
			} else if(user.getRegistrationDate() != null && DateUtils.compareDate(user.getRegistrationDate())) {
				discount = (user.getGrossAmount() * 5)/100;
			}
			// take only upto decimal
			double noOfHundreds = user.getGrossAmount()/100;
			int intPart = (int) noOfHundreds;
			discount = discount + intPart * 5;
			
		  }
		
		double netAmount = user.getGrossAmount() - discount;
		// suppose 5 % Vat is applicable
		double vatAmount = (netAmount * 5)/100;
		 netPayableAmount = netAmount + vatAmount;
		 
//		 billDetails.put("discount", discount);
//		 billDetails.put("netAmount", netAmount);
//		 billDetails.put("vatAmount", vatAmount);
//		 billDetails.put("netPayableAmount", netPayableAmount);
//		     
		
				} catch (Exception e) {
					e.printStackTrace();
				}
			
		
		return netPayableAmount;
		
	}

}
