package io.github.aliehmohtashami.behavioral.memento;

import lombok.Data;

/**
 * @Author alieh on 1/9/22
 */
@Data
/**
 * This class plays Originator role.
 */
public class CurrentState {
	private long healthPercentage;
	private int gemNumbers;
	private int level;

	public Snapshot saveState() {
		return new Snapshot(healthPercentage, gemNumbers, level);
	}

	public void loadState(Snapshot state) {
		healthPercentage = state.getHealthPercentage();
		gemNumbers = state.getGemNumbers();
		level = state.getLevel();
	}

}
