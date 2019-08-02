package mm.assignment.model;

import java.util.Date;

public class User {
	private int emiratesId;
	private String userName;
	private Double grossAmount;
	
	private boolean isEmployeeToStore;
	private boolean isAffiliatedToStore;
	private Date registrationDate;
	public int getEmiratesId() {
		return emiratesId;
	}
	public void setEmiratesId(int emiratesId) {
		this.emiratesId = emiratesId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	public Double getGrossAmount() {
		return grossAmount;
	}
	public void setGrossAmount(Double grossAmount) {
		this.grossAmount = grossAmount;
	}
	public boolean isEmployeeToStore() {
		return isEmployeeToStore;
	}
	public void setEmployeeToStore(boolean isEmployeeToStore) {
		this.isEmployeeToStore = isEmployeeToStore;
	}
	public boolean isAffiliatedToStore() {
		return isAffiliatedToStore;
	}
	public void setAffiliatedToStore(boolean isAffiliatedToStore) {
		this.isAffiliatedToStore = isAffiliatedToStore;
	}
	public Date getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	
	

}
