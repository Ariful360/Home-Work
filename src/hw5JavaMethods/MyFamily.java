package hw5JavaMethods;
//HW_Java_Methods:
//
//Step 1: Create a package name "hw5JavaMethods" in your Home Work project.
//
//Step 2: Inside the package, Create a class "MyFamily" and initialize some int type variables -- child1Age, child2Age, child3Age, child4Age which can be public or protected or default in nature. 
//
//Step 3: Implement a return type method which is int type which name could be same as class name. Please follow naming convention for methods. The outcome should be: "The sum of my childrens age is: " + <sum>
//
//Step 4: Create a main method after the method, Instantiate the class and call the method by the object.
//
//Step 5: Inside the same package, Create another class "FullName". 
//
//Step 6: Implement a return type parameterized method which is String type, which name could be same as class name. Please follow naming convention for methods. Use fName and lName as a parameter which are String in nature. In the method body create a syso to print: "Family Member: " + <fName> + " "+ <lName>
//
//Step 7: Create a main method after the method, Instantiate the class and call the method by the object. Can you call a parameterized method more than one with different arguments? If yes, then print all Family memebers name.
//
//Step 8: Organize your code. Push in the GitHub. Paste the link of package 'hw5JavaMethods' below.

public class MyFamily {
	public int child1Age=7;
	protected int child2Age=13;
	int child3Age=17;
	public int child4Age=21;
	
	public int myFamily() {
		System.out.println("The sum of my childrens age is: ");
		return 0;
	}
	public static void main(String[] args) {
		
	}

}
