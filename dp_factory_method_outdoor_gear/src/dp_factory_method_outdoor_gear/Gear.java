package dp_factory_method_outdoor_gear;

public abstract class Gear {
	int cost;
	String name;
	double weight;
	
	public String setup(){
		return name + " whichs costs " + cost + " and weighs " + weight + " added to your kit.";
	}
	
	public String getCost(){
		return name + " costs " + cost + " dollars.";
	}
	
	public String getWeight(){
		return name + " weighs " + weight + " kilos.";
	}
}
