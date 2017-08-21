package com.zdl;

public class User {

	private String name;
	
	private String sex;
	
	private int age;

	
	//有参数构造函数
	public User(String name, String sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
//无参构造函数
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}*/

	@Override
	public String toString() {
		return "User [name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}
	
	public static void main(String[] args) {
		User user  = new User("22","女",22);
		/*user.setName("11");
		user.setSex("男");
		user.setAge(39);*/
		
//		System.out.println(user.getAge());
		
		
		System.out.println(user.toString());
	}
}

