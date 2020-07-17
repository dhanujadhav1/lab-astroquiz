package utility;

import model.User;

public class EligibiltyCheck extends BasicEligibility implements EligibilityInterface {

	@Override
	public boolean checkUser(User user) {
		// TODO Auto-generated method stub
		if (( user.getAge()>=18  && user.getAge()<= 35) && ( user.getHeight()>=155 && user.getHeight()<=170) &&( 55<= user.getWeight() && user.getWeight() <= 90) && ( user.getCountry().equals("ProGrad")))
		return true;
		else 
			return false;
	}

	@Override
	public boolean checkQuizAnswer(String points) {
		// TODO Auto-generated method stub
		
		int pars=Integer.parseInt(points);
		if(pars>80)
			return true;
		else
		return false;
	}

	@Override
	public
	boolean basicEligibilityCheck(User user) {
		// TODO Auto-generated method stub
		boolean status=checkUser( user);
		if(status)
			return true;
		else
		return false;
	}

	

	}
	
	
	








