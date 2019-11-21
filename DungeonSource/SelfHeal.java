public class SelfHeal implements SpecialAttack{
    public void selfHeal(DungeonCharacter opponent){
		
	    int hPoints;
		hPoints = (int)(Math.random() * (MAX_ADD - MIN_ADD + 1)) + MIN_ADD;
		addHitPoints(hPoints);
		System.out.println(name + " added [" + hPoints + "] points.\n"+ "Total hit points remaining are: "+ hitPoints);
		System.out.println();
    }
}