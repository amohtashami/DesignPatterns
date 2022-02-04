package io.github.aliehmohtashami.behavioral.state.changeable;


/**
 * @Author alieh on 1/11/22
 */
//this interface plays state role in pattern
public interface TVState {
	void pressOnButton(TVContext TVContext);

	void pressMuteButton(TVContext TVContext);
}
