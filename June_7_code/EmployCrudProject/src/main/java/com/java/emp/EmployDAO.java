package com.java.emp;

import java.util.ArrayList;
import java.util.List;

public class EmployDAO {

	static List<Employ> employList;
	
	static {
		employList = new ArrayList<Employ>();
	}
	
	public String updateEmployDao(Employ employ) {
		Employ employFound = searchEmployDao(employ.getEmpno());
		if (employFound!=null) {
			for (Employ emp : employList) {
				if (emp.getEmpno()==employ.getEmpno()) {
					emp.setName(employ.getName());
					emp.setGender(employ.getGender());
					emp.setDept(employ.getDept());
					emp.setDesig(employ.getDesig());
					emp.setBasic(employ.getBasic());
				}
			}
			return "Employ Record Updated...";
		}
		return "Employ Record Not Found...";
	}
	
	public String deleteEmployDao(int empno) {
		Employ employFound = searchEmployDao(empno);
		if (employFound!=null) {
			employList.remove(employFound);
			return "Employ Record Deleted...";
		}
		return "Employ Record Not Found...";
	}
	public Employ searchEmployDao(int empno) {
		Employ employFound = null;
		for (Employ employ : employList) {
			if (employ.getEmpno()==empno) {
				employFound=employ;
				break;
			}
		}
		return employFound;
	}
	
	public String addEmployDao(Employ employ) {
		employList.add(employ);
		return "Employ Record Inserted...";
	}
	
	public List<Employ> showEmployDao() {
		return employList;
	}
}
