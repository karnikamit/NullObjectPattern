package codeyard;

public class NoClient extends Employee {

	public boolean isNull() {
		return true;
	}

	public String getName() {
		return "Not Available";
	}

	@Override
	public Integer getAge() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getSkills() {
		// TODO Auto-generated method stub
		return null;
	}

}
