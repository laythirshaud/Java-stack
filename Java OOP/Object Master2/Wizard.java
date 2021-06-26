public class Wizard extends Human{
	public Wizard() {
		super();
		this.setIntelligence(5);
		this.setHealth(40);
	}
	public void heal(Human h) {
		h.setHealth(h.getHealth()+ this.getIntelligence());
	}
	public void fireball(Human h) {
		h.setHealth(h.getHealth()-(this.getIntelligence()*3));
	}
	@Override
	public String toString() {
		return "Wizard [getStrength()=" + getStrength() + ", getIntelligence()=" + getIntelligence() + ", getStealth()="
				+ getStealth() + ", getHealth()=" + getHealth() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}