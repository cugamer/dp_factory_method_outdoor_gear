package dp_factory_method_outdoor_gear;

public class BuildKits {

	public static void main(String[] args) {
		WildernessKit mountainKit = new MountainKit();
		Gear boots1 = mountainKit.equipGear("Boots");
		System.out.println(boots1.getCost());
		System.out.println(boots1.getWeight() + "\n");
		
		Gear coat1 = mountainKit.equipGear("Coat");
		System.out.println(coat1.getCost());
		System.out.println(coat1.getWeight() + "\n");
		
		Gear climbingKit1 = mountainKit.equipGear("Climbing Kit");
		System.out.println(climbingKit1.getCost());
		System.out.println(climbingKit1.getWeight() + "\n");
		
		WildernessKit jungleKit = new JungleKit();
		Gear boots2 = jungleKit.equipGear("Boots");
		System.out.println(boots2.getCost());
		System.out.println(boots2.getWeight() + "\n");
		
		Gear coat2 = jungleKit.equipGear("Coat");
		System.out.println(coat2.getCost());
		System.out.println(coat2.getWeight() + "\n");
		
		Gear climbingKit2 = jungleKit.equipGear("Climbing Kit");
		System.out.println(climbingKit2.getCost());
		System.out.println(climbingKit2.getWeight() + "\n");
	}

}

