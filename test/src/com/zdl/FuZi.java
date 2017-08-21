package com.zdl;

class Ba {
	String name;
	int age;

	public Ba() {
		System.out.println("父类中的无参构造");
	}

	public Ba(String name, int age) {
		this.name= name;
		this.age = age;
		System.out.println("这是父类中的有参构造函数");
	}

	public void Raising() {
		System.out.println("父亲养的是一只阿拉斯加");
	}
}

class Er extends Ba {
	int id;

	public Er() {
		System.out.println("子类中的无参构造");
	}

	public Er(String name, int age, int id) {
		super(name, age);
		this.name=name;
		this.age= age;
		this.id= id;
		System.out.println("这是子类中的有参构造函数");
	}

	@Override
	public void Raising() {
		System.out.println("儿子养的是一只哈士奇");
	}
}

public class FuZi {
	public static void main(String[] args) {
		Er son = new Er();
		son.Raising();
		son.name= "123";
		son.id=1;
		son.age=3;
		System.out.println(son.name+"--"+son.age+"--"+son.id);

//		System.out.println("Name = " + "Age = " + son.age + "ID = " + son.id);

	}

}