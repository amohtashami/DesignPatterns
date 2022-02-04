package io.github.aliehmohtashami.behavioral.state.changeeable;

import lombok.Data;

/**
 * @Author alieh on 1/11/22
 */
//This class plays Context role
@Data
public class TVContext {
	private TVState currentTVState;


	public void pressOnBtn() {
		currentTVState.pressOnButton(this);
	}

	public void pressMuteBtn() {
		currentTVState.pressMuteButton(this);
	}

}
