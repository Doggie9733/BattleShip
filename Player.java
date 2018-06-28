
public class Player {
	private int life_count;
	private int step_count;
	private int ship_destroy_count;
	
	Rule rule = new Rule();
	
	public Player() {
		life_count = rule.getLifeNum();
		step_count = 0;
		ship_destroy_count = 0;
	}
	
	public void addOneStep() {
		step_count++;
	}
	
	public void lossTwoLife() {
		life_count = life_count - 2;
	}
	
	public void lossOneLife() {
		life_count--;
	}
	
	public void addOneLife() {
		life_count++;
	}
	
	public void destroyOneShip() {
		ship_destroy_count++;
	}
	
	public int getLifeCount() {
		return life_count;
	}
	
	public int getStepCount() {
		return step_count;
	}
	
	public int getShipDestroyCount() {
		return ship_destroy_count;
	}
	
	
	
	

}
