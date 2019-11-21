public class SelfHeal implements SpecialAttack{
	
	@Override
	public void attack(DungeonCharacter player, DungeonCharacter opponent) {
		
	    int hPoints;
		hPoints = (int)(Math.random() * (((Sorceress)player).MAX_ADD - ((Sorceress)player).MIN_ADD + 1)) + ((Sorceress)player).MIN_ADD;
		player.addHitPoints(hPoints);
		System.out.println(player.name + " added [" + hPoints + "] points.\n"+ "Total hit points remaining are: "+ player.hitPoints);
		System.out.println();
    }
}