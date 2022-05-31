package com.java.ex;

public class CustomEx1 {

	public void check(int age) throws VotingException {
		if (age < 18) {
			throw new VotingException("You are not Elligible for Voting...");
		} else {
			System.out.println("You can vote...");
		}
	}
	public static void main(String[] args) {
		int age=21;
		CustomEx1 obj = new CustomEx1();
		try {
			obj.check(age);
		} catch (VotingException e) {
			System.out.println(e.getMessage());
		}
	}
}
