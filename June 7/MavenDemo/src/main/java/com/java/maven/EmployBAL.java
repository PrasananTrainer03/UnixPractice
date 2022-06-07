package com.java.maven;

import java.util.List;

public class EmployBAL {

	static StringBuilder sb = new StringBuilder();
	static EmployDAO dao = new EmployDAO();
	
	
	public String updateEmployBal(Employ employ) throws EmployException {
		if (isValid(employ)==true)  {
			return dao.updateEmployDao(employ);
		}
		throw new EmployException(sb.toString());

	}
	
	public String deleteEmployBal(int empno) {
		return dao.deleteEmployDao(empno);
	}
	
	public Employ searchEmployBal(int empno) {
		return dao.searchEmployDao(empno);
	}
	
	public List<Employ> showEmploy() {
		return dao.showEmployDao();
	}
	
	public String addEmployBal(Employ employ) throws EmployException {
		if (isValid(employ)==true)  {
			return dao.addEmployDao(employ);
		}
		throw new EmployException(sb.toString());
	}
	
	public boolean isValid(Employ employ) {
		boolean isValid = true;
		
		if (employ.getEmpno() <= 0) {
			sb.append("Employ Number cannot be Negaive or Zero...\r\n");
			isValid = false;
		}
		
		if (employ.getName().length() < 5) {
			sb.append("Employ Name contains min 5 characters...\r\n");
			isValid = false;
		}
		
		if (employ.getDept().length() < 3) {
			sb.append("Employ Department contains min 3 characters...\r\n");
			isValid = false;
		}
		
		if (employ.getDesig().length() < 3) {
			sb.append("Employ Designation contains min 3 characters...\r\n");
			isValid = false;
		}
		
		if (employ.getBasic() < 25000 || employ.getBasic() > 90000) {
			sb.append("Employ Basic Must be from 25000 to 90000...");
			isValid = false;
		}
		
		return isValid;
	}
}
