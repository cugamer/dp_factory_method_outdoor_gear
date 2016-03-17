package dp_factory_method_outdoor_gear;

public class MountainKit extends WildernessKit {

	protected Gear createGear(String type) {
		if(type.equals("Boots")){
			return new MountainBoots();
		}else if(type.equals("Coat")){
			return new HeavyCoat();
		}else if(type.equals("Climbing Kit")){
			return new IceClimbingKit();
		}else{
			System.out.println("Invalid gear type specified");
			return null;
		}
	}

}
