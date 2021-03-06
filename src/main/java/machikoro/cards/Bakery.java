package machikoro.cards;

import java.util.HashSet;
import java.util.Set;

import machikoro.Card;
import machikoro.Game;

public class Bakery extends Card {

	@Override
	public int getCost() {
		return 1;
	}

	@Override
	public Set<Integer> getRolls() {
		Set<Integer> rollSet = new HashSet<>();
		rollSet.add(2);
		rollSet.add(3);
		return rollSet;
	}

	@Override
	public void playerTurn(Game game) {
		getOwner().addCoins(1);
	}

	@Override
	public int getPriority() {
		return 2;
	}
}
