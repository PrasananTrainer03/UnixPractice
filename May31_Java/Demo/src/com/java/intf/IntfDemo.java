package com.java.intf;

interface IDemo {
	void name();
	void email();
}


class Tejesh implements IDemo {

	@Override
	public void name() {
		System.out.println("Name is Tejesh...");
	}

	@Override
	public void email() {
		System.out.println("Email is Tejesh@gmail.com");
	}
	
}

class Rupaswi implements IDemo {

	@Override
	public void name() {
		System.out.println("Name is Rupaswi...");
	}

	@Override
	public void email() {
		System.out.println("Email is rupaswi@gmail.com");
	}
	
}

class Likthitha implements IDemo {

	@Override
	public void name() {
		System.out.println("Name is Likhitha...");
	}

	@Override
	public void email() {
		System.out.println("Email is likhitha@gmail.com");
	}
	
}

public class IntfDemo {

	public static void main(String[] args) {
		IDemo[] arr = new IDemo[] {
			new Likthitha(),
			new Rupaswi(),
			new Tejesh()
		};
		for (IDemo i : arr) {
			i.name();
			i.email();
		}
	}
}
