package codeyard;

public abstract class Employee {
	protected String name;
	protected Integer age;
	protected String[] skills;
	public abstract boolean isNull();
	public abstract String getName();
	public abstract Integer getAge();
	public abstract String[] getSkills();

}
