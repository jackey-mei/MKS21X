public class Barbarian extends Actor{
    private int rage;

    public Barbarian(String name, int str, int agi, int intel, int health){
	super(name,str,agi,intel,health);
	rage = 20;
    }
    public Barbarian(String name){
	this(name,8,10,15,15);
    }
    public Barbarian(){
	this("Conan");
    }

    public String attack(){
	return getName()+" swings his giant axe at the target";
    }

    public String specialAttack(){
	return getName()+" spins his giant axe in a berserker fury at the target";
    }

    public int getResource(){return rage;}

    public String getResourceName(){return "Rage";}


}
