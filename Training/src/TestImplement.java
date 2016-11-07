package com.Lister.newpackage;


interface Animal{
	void eat();
	void walk();
}
class Camel implements Animal{
	public void eat(){
		System.out.println("It eats grass");
	}
	public void walk(){
		System.out.println("It walks on sand");
	}
}
class Dog implements Animal{
	public void eat(){
		System.out.println("It eats mutton");
	}
	public void walk(){
		System.out.println("It walks on land");
	}
}
class Bird implements Animal{
	public void eat(){
		System.out.println("It eats worms");
	}
	public void walk(){
		System.out.println("It fly");
	}
}