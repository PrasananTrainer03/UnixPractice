package com.java.abs;

abstract class Training {
	public abstract void name();
	public abstract void email();
}


class Kamal extends Training {

	@Override
	public void name() {
		System.out.println("Name is Kamal...");
	}

	@Override
	public void email() {
		System.out.println("Email is kamal@gmail.com");
	}
	
}

class Thanusha extends Training {

	@Override
	public void name() {
		System.out.println("Name is Thanusha...");
	}

	@Override
	public void email() {
		System.out.println("Email is Thanusha@gmail.com");
	}
	
}
class Ayushi extends Training {

	@Override
	public void name() {
		System.out.println("Hi I am Ayushi...");
	}

	@Override
	public void email() {
		System.out.println("Email is ayushi@gmail.com");
	}
	
}

public class AbsDemo {
	public static void main(String[] args) {
		Training[] arr = new Training[] {
			new Ayushi(),
			new Thanusha(),
			new Kamal()
		};
		for (Training t : arr) {
			t.name();
			t.email();
		}
	}
}
