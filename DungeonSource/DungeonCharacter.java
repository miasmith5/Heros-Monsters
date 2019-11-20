
public abstract class DungeonCharacter implements Comparable{
	
	protected String name;
	protected int hitPoints;
	protected int attackSpeed;
	protected double chanceToHit;
	protected int damageMin, damageMax;

	public int compareTo(Object o){
		
		return 1;
	}

	public DungeonCharacter(String name, int hitPoints, int attackSpeed,
				     double chanceToHit, int damageMin, int damageMax){
		
		this.name = name;
		this.hitPoints = hitPoints;
		this.attackSpeed = attackSpeed;
		this.chanceToHit = chanceToHit;
		this.damageMin = damageMin;
		this.damageMax = damageMax;

	}

	public String getName(){
		
		return name;
	}

	public int getHitPoints(){
		
		return hitPoints;
	}
	
	public int getAttackSpeed(){
		
		return attackSpeed;
	}

	public void addHitPoints(int hitPoints){
		
		if (hitPoints <=0)
			System.out.println("Hitpoint amount must be positive.");
		else
			this.hitPoints += hitPoints;
	}

	public void subtractHitPoints(int hitPoints){
		
		if (hitPoints <0)
			System.out.println("Hitpoint amount must be positive.");
		else if (hitPoints >0){
			this.hitPoints -= hitPoints;
			if (this.hitPoints < 0)
				this.hitPoints = 0;
			System.out.println(getName() + " hit " +" for <" + hitPoints + "> points damage.");
			System.out.println(getName() + " now has " +getHitPoints() + " hit points remaining.");
			System.out.println();
		}
		if (this.hitPoints == 0)
			System.out.println(name + " has been killed :-(");
	}
	
	public boolean isAlive(){
		
	  return (hitPoints > 0);
	}

	public void attack(DungeonCharacter opponent){
		
		boolean canAttack;
		int damage;
		canAttack = Math.random() <= chanceToHit;
		if (canAttack){
			damage = (int)(Math.random() * (damageMax - damageMin + 1))+ damageMin ;
			opponent.subtractHitPoints(damage);
			System.out.println();
		}else{
			System.out.println(getName() + "'s attack on " + opponent.getName() +" failed!");
			System.out.println();
		}

	}
}
