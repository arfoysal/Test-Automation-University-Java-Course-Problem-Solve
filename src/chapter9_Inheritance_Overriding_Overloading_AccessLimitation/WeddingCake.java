package chapter9_Inheritance_Overriding_Overloading_AccessLimitation;

public class WeddingCake extends Cake {

	private int tiers;

	public WeddingCake() {
		super("almond");
	}

	public int getTiers() {
		return tiers;
	}

	public void setTiers(int tiers) {
		this.tiers = tiers;
	}

}
