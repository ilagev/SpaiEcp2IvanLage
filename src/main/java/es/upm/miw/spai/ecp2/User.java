package es.upm.miw.spai.ecp2;

public class User {
    private int number;

    private String name;

    private String familyName;
    
    private int age;

    private String format(String string) {
        string = string.trim();
        return string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
    }

    public User(int number, String name, String familyName, int age) {
        this.number = number;
        this.name = this.format(name);
        this.familyName = this.format(familyName);
        this.age = age;
    }

    public int getNumber() {
        return this.number;
    }

    public String getName() {
        return this.name;
    }

    public String getFamilyName() {
        return this.familyName;
    }

    public String fullName() {
        return this.name + " " + this.familyName;
    }

    public String initials() {
        return this.name.substring(0, 1) + ".";
    }
    
    public boolean isTocayo(String name){
        return this.name.equals(name);
    }

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
    
    
}
