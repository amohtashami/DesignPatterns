package io.github.aliehmohtashami.behavioral.memento;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author alieh on 1/9/22
 */
public class MementoDesignPatternTest {

	@Test
	public void testMementoPattern() {
		SnapshotCoordinator listState = new SnapshotCoordinator();
		CurrentState currentState = new CurrentState();

		currentState.setGemNumbers(10);
		currentState.setLevel(2);
		currentState.setHealthPercentage(100);
		listState.add("level2", currentState.saveState());

		currentState.setGemNumbers(20);
		currentState.setLevel(3);
		currentState.setHealthPercentage(75);
		listState.add("level3", currentState.saveState());

		currentState.setGemNumbers(30);
		currentState.setLevel(5);
		currentState.setHealthPercentage(40);
		listState.add("level5", currentState.saveState());

		currentState.setGemNumbers(5);
		currentState.setLevel(1);
		currentState.setHealthPercentage(50);
		listState.add("level1", currentState.saveState());

		currentState.loadState(listState.get("level5"));

		Assert.assertEquals(currentState.getGemNumbers(), 30);
		Assert.assertEquals(currentState.getLevel(), 5);
		Assert.assertEquals(currentState.getHealthPercentage(), 40);
	}

}
