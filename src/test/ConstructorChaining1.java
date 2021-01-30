package test;

public class ConstructorChaining1 {
	String name;
	int age;
	float salary;
	char gender;

	ConstructorChaining1(int age, String name) {
		this(1000.0f, 'm');
		this.age = age;
		this.name = name;
		System.out.println("age=" + age + " " + "name=" + name);

	}

	ConstructorChaining1(float salary, char gender) {
		this.salary = salary;
		this.gender = gender;

		System.out.println("salary=" + salary + " " + "gender=" + gender);

	}

}
