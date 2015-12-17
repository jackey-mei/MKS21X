import java.util.*;

public class Demo3{

    //When you define a new class, consider if it makes sense for 
    //instances of your class to be compared to do things such as 
    //sorting. If so, your class should implement the Comparable<T> 
    //interface. To do this you need to:

    //a. Include the clause implements Comparable<T> in the class header 
    //right after the class name replacing T with the class's name.

    //b. Implement a compareTo method having the signature:
    //int compareTo(T other)    where T is the type parameter.
    
    //1. I have given you an actor with the comparable interface added.
    //Modify the Actor as per the directiosn in the actor class. 
    //Then run this demo to see if your changes worked.

    public static void main(String[]args){
	Barbarian[]people;

	people = new Barbarian[4];

	//make 4 random barbarians to use sort on:
	for(int i = 0; i < people.length; i++){
	    String letter = ""+(char)('A'+(int)(Math.random()*26));
	    people[i] = new Barbarian(letter + "onan",
				      (int)(Math.random()*10)+10,
				      (int)(Math.random()*10)+5,
				      (int)(Math.random()*5)+5,
				      (int)(Math.random()*20)+20);
	}
	//print them
	System.out.println(Arrays.toString(people));
	//sort using the compareTo you wrote
	Arrays.sort(people);
	//print them again
	System.out.println(Arrays.toString(people));


    }

}
