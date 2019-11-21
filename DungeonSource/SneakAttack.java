public class SneakAttack implements SpecialAttack{

	@Override
	public void attack(DungeonCharacter player, DungeonCharacter opponent) {
		double surprise = Math.random();
		if (surprise <= .4){
			System.out.println("Surprise attack was successful!\n" +player.name + " gets an additional turn.");
			((Hero)player).numTurns++;
			player.attack(opponent);
		}else if (surprise >= .9){
			System.out.println("Uh oh! " + opponent.getName() + " saw you and" +" blocked your attack!");
		}else
			player.attack(opponent);
	}
}