package test;

public class ConstructorChaining2 extends ConstructorChaining1 {
	int year;
	String sname;
	float percentage;
	String surname;

	ConstructorChaining2(int year, float percentage) {
		super(22, "tulasi");
		this.year = year;
		this.percentage = percentage;

		
	}

	ConstructorChaining2(String sname, String surname) {
		this(2019, 59.99f);

		this.sname = sname;
		this.surname = surname;
		System.out.println("percentage=" + percentage + " " + "year=" + year);
	}

	public void display() {

		System.out.println("sname=" + sname + " " + "surname=" + surname);

	}

}
