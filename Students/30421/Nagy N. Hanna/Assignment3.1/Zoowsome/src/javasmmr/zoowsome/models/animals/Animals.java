package javasmmr.zoowsome.models.animals;

public abstract class Animals {
	Integer nrOfLegs;
	String name;

	public Integer getNrOfLegs() {
		return nrOfLegs;
	}

	public String getName() {
		return name;
	}

	public void setNrOfLegs(Integer nrOfLegs) {
		this.nrOfLegs = nrOfLegs;
	}

	public void setName(String name) {
		this.name = name;
	}

}
