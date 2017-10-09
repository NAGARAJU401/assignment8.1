package Overload;
//package : Package is name that organizes a set of related classes and interfaces similar to 
//different folders on my computer

public class Constructor {
	//public : members which can access as public,public members are visible to all other classes.
	//class : is a context of java that are used to create objects and to define object data types and methods.
	 Constructor() {
		 
	 }
	 int id;  // taking the variables of int and string data types 
	    String name;  
	    int marks;  
	    
	    Constructor(int i,String n){
	    	//here we are implementing another constructor by taking 
		    id = i;        //two parameters ,it is known as parameterized constructor 
		    name = n;  
		    }  
	    //the constructor should have the same name of the class name 
	    
	    Constructor(int i,String n ,int x){ //taking three parameters which shows that it is constructor overloaded
		    id = i;  
		    name = n;  
		    marks =x;  
		    }  
	    
	    void display(){     //to display we are using this
	    	
	    	
	    	System.out.println("Student id  :"    +id);
	    	 //system : system is a class in java language.lang package
		  	//out : out is the static member of system class.It's type PrintStream
		  	//println: which is used to print the output.
	    	System.out.println("Student name: "   +name);
	    	 //system : system is a class in java language.lang package
		  	//out : out is the static member of system class.It's type PrintStream
		  	//println: which is used to print the output.
	    	System.out.println("Student marks: "   +marks);
	    	 //system : system is a class in java language.lang package
		  	//out : out is the static member of system class.It's type PrintStream
		  	//println: which is used to print the output.
	    	
	    	}  
	   
	public static void main(String[] args) {
		//Public is a keyword that is used as an access modifier for methods and variables.
		//static used to prepare a field,method or inner classes as a class field.
	//void: it is void if the method does not return a value.
		//main:it is a function name When a program starts running, it has to start execution from somewhere.
		//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.
		// TODO Auto-generated method stub
		 Constructor s1 = new Constructor(124567,"nagaraju",85);  
		 Constructor s2 = new Constructor(321578,"sudha",90);  
		 
		    s1.display();  
		    s2.display();
	}

}
