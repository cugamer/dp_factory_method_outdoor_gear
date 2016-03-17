package dp_factory_method_outdoor_gear;

public class JungleKit extends WildernessKit {
	protected Gear createGear(String type) {
		if(type.equals("Boots")){
			return new JungleBoots();
		}else if(type.equals("Coat")){
			return new Poncho();
		}else if(type.equals("Climbing Kit")){
			return new RockClimbingKit();
		}else{
		return null;
		}
	}

}
