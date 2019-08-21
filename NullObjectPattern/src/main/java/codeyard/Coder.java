package codeyard;

public class Coder extends Employee {

	public Coder(String name, Integer age, String[] skills) {
		this.name = name;
		this.age = age;
		this.skills = skills;
	}

	@Override
	public boolean isNull() {
		return false;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Integer getAge() {
		// TODO Auto-generated method stub
		return age;
	}

	@Override
	public String[] getSkills() {
		// TODO Auto-generated method stub
		return skills;
	}

}
