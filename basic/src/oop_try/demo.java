package oop_try;

class person{
		String Name;
		String Email;
		String Phone;
		
		void walk(){
			System.out.println(Name + " is walking");
		}
	
		void eat(){
			System.out.println(Name + " is eating");
		}

		void sleep(){
			System.out.println(Name + " is sleeping");
		}

	
}



public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Define properties
		person person1 = new person();
		person1.Name = "Joe";
		person1.Email = "joe_test@test.com";
		person1.Phone = "091788877781";
		
		//Abstraction - extraction
		person1.walk();
		person1.sleep();
		person1.eat();
		
	
		
		

	}

}
