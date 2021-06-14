
public class Human {
	private int Strength;
	private int stealth=3;
	private int intelligence=3;
	private int health =100;
	private int result ;
	
	public void attack(){
		int result=100-Strength;
				System.out.println(result);
	
		
		
	}
	
	
	public int getResult() {
		return result;
	}

	
	public void setStrength(int strength) {
		Strength = strength;
	}


	
	public Human() {
		
	}
	
	
	
}
