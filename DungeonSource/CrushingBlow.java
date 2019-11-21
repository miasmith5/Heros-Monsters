public class CrushingBlow implements SpecialAttack{
    public void crushingBlow(DungeonCharacter opponent){
		
		if (Math.random() <= .4){
			int blowPoints = (int)(Math.random() * 76) + 100;
			System.out.println(name + " lands a CRUSHING BLOW for " + blowPoints+ " damage!");
			opponent.subtractHitPoints(blowPoints);
		}else{
			System.out.println(name + " failed to land a crushing blow");
			System.out.println();
		}
	}
}