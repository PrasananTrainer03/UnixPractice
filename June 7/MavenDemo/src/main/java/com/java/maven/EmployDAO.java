package com.java.maven;

import java.util.ArrayList;
import java.util.List;

public class EmployDAO {

	static List<Employ> employList;

	static {
		employList = new ArrayList<Employ>();
	}
	
	public String updateEmployDao(Employ employNew) {
		Employ employFound = searchEmployDao(employNew.getEmpno());
		if (employFound!=null) {
			for (Employ employ : employList) {
				if (employ.getEmpno()==employNew.getEmpno()) {
					employ.setName(employNew.getName());
					employ.setGender(employNew.getGender());
					employ.setDept(employNew.getDept());
					employ.setDesig(employNew.getDesig());
					employ.setBasic(employNew.getBasic());
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

	
	public String addEmployDao(Employ employ) {
		employList.add(employ);
		return "Employ Record Inserted...";
	}
	
	public List<Employ> showEmployDao() {
		return employList;
	}
	
	public Employ searchEmployDao(int empno) {
		Employ employFound = null;
		for (Employ employ : employList) {
			if (employ.getEmpno() == empno) {
				employFound = employ;
			}
		}
		return employFound;
	}
}
