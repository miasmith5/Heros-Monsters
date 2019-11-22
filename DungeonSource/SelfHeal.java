public class SelfHeal implements SpecialAttack{
	
	@Override
	public void attack(DungeonCharacter player, DungeonCharacter opponent) {
		
	    int hPoints;
		hPoints = (int)(Math.random() * (((Zoot)player).MAX_ADD - ((Zoot)player).MIN_ADD + 1)) + ((Zoot)player).MIN_ADD;
		player.addHitPoints(hPoints);
		System.out.println(player.name + " added [" + hPoints + "] points.\n"+ "Total hit points remaining are: "+ player.hitPoints);
		System.out.println();
    }
}