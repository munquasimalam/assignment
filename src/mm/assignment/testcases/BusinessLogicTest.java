package mm.assignment.testcases;

import static org.mockito.Mockito.*;

import java.text.ParseException;

import org.junit.Test;

import mm.assignment.busineslogic.BusinessLogic;
import mm.assignment.busineslogic.BusinessLogicImpl;
import mm.assignment.model.User;
import mm.assignment.utils.DateUtils;
import static org.junit.Assert.*;

public class BusinessLogicTest {
	
    //  create mock
		//BusinessLogic test  = new BusinessLogic(); 
		BusinessLogic mock =mock(BusinessLogicImpl.class);
	 
	@Test
	public void billGenerationTwoYearsOld() throws ParseException  {
		User user = new User();
		user.setEmiratesId(1234567);
		user.setUserName("Alam");
		user.setRegistrationDate(DateUtils.convertStringToDate("02-08-2017"));
		user.setAffiliatedToStore(false);
		user.setEmployeeToStore(false);
		user.setGrossAmount(990.00);
		
	         when(mock.billGeneration(user)).thenReturn(940.275);
		// when(mock.billGeneration(anyObject())).thenReturn(940.275);
		// assertEquals(mock.billGeneration(user), 940.275);
	        
	       
	}
	
	@Test
	public void billGenerationEmployeeToStore() throws ParseException  {
		User user = new User();
		user.setEmiratesId(1234567);
		user.setUserName("Alam");
		user.setRegistrationDate(DateUtils.convertStringToDate("02-08-2017"));
		user.setAffiliatedToStore(false);
		user.setEmployeeToStore(true);
		
		user.setGrossAmount(990.00);
		
	        when(mock.billGeneration(user)).thenReturn(680.4);
	      
	}
	
	@Test
	public void billGenerationAffiliatedToStore() throws ParseException  {
		User user = new User();
		user.setEmiratesId(1234567);
		user.setUserName("Alam");
		user.setRegistrationDate(DateUtils.convertStringToDate("02-08-2017"));
		user.setAffiliatedToStore(true);
		
		user.setEmployeeToStore(false);
		
		user.setGrossAmount(990.00);
		
	        when(mock.billGeneration(user)).thenReturn(888.3);
	      
	}
	
	@Test
	public void billGenerationNoAnyPersentageDiscount() throws ParseException  {
		User user = new User();
		user.setEmiratesId(1234567);
		user.setUserName("Alam");
		user.setRegistrationDate(DateUtils.convertStringToDate("09-08-2017"));
		user.setAffiliatedToStore(false);
		
		user.setEmployeeToStore(false);
		
		user.setGrossAmount(990.00);
		
	        when(mock.billGeneration(user)).thenReturn(992.25);
	      
	}


}
