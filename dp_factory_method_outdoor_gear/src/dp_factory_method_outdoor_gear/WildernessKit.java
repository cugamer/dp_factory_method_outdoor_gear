package dp_factory_method_outdoor_gear;

import java.util.ArrayList;

public abstract class WildernessKit {
	ArrayList<Gear> gearList = new ArrayList<Gear>();
	
	public Gear equipGear(String type){
		Gear gear;
		
		gear = createGear(type);
		gearList.add(gear);
		System.out.println(gear.name + " added to the kit.");
		return gear;
	}
	
	protected abstract Gear createGear(String type);
}
