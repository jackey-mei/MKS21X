//This class definition tells java that you can compare actors to
//other actors.   

public abstract class Actor implements Comparable<Actor>{

    //implements Comparable<Actor> requires you make a method
    //   int compareTo (Actor o)
    //in order to be compliant with the Comparable interface

    //this method will compare actors by name
    public int compareTo(Actor other){
	//return name.compareTo(other.name);

	//return health - other.health;

	//return strength - other.strength;

	//create an abstract method called getPrimaryStat to return the value that represents their primary stat.

	//Try 0-3 and compile and run Demo3 after each one. 
	//If it works comment out the return statement
	//then do the next.
	//0. Modify compareTo so that sorting your Actors will 
	//   sort by name, just use the String compareTo in the names.
	//
	//1. Modify compareTo so that sorting your Actors will 
	//   sort lowest HP to Highest HP. Then test the driver
	//
	//2. Modify compareTo so that sorting your Actors will 
	//   sort lowest strength to highest strength
	//
	//This is not a coding question:
	//3. How can we modify the compareTo / the class
	//   so that we are able to sort by the 
	//   "primary stat" (str for barbs int for wiz etc)
	//   come up with a plan, write a list of modifications
	//   you need to make, and where you want the methods to go.

    }



    private String name;
    private int strength,agility,intelligence;
    private int health;

    //1. Must override the three consructors
    public Actor(String name, int str, int agi, int intel, int health){
	this.name = name;
	agility = agi;
	strength = str;
	intelligence = intel;
	this.health = health;
    }

    public Actor(String name){
	this(name,10,10,10,20);
    }

    public Actor(){
	this("Peon",10,10,10,20);
    }

    public String toString(){
	return name + " "+health+ "H/" + getResourceName() + ": " + getResource() +" " + strength+"S/"+agility+"A/"+intelligence+"I";
    }

    
    public int takeDamage(int damage){
	health -= damage;
	return damage;
    }
    public String getName(){return name;}
    public int getInt(){return intelligence;}
    public int getStr(){return strength;}
    public int getAgi(){return agility;}
    public int getHealth(){return health;}

    public abstract String attack();
    public abstract String specialAttack();
    public abstract int getResource();
    public abstract String getResourceName();

 
    
}
