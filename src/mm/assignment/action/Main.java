package mm.assignment.action;

import java.text.ParseException;
import java.util.Map;

import mm.assignment.busineslogic.BusinessLogic;
import mm.assignment.model.User;
import mm.assignment.utils.DateUtils;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		BusinessLogic.billGeneration(getDummyData());
		
		
	}
	
	private static User getDummyData() throws ParseException{
		User user = new User();
		user.setEmiratesId(1234567);
		user.setUserName("Alam");
		user.setRegistrationDate(DateUtils.convertStringToDate("06-08-2017"));
		//user.setAffiliatedToStore(true);
		user.setAffiliatedToStore(false);
		//user.setEmployeeToStore(true);
		user.setEmployeeToStore(false);
		user.setGrossAmount(990.00);
		return user;
		
	}

}
