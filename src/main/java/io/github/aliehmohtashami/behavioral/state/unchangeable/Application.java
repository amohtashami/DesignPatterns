package io.github.aliehmohtashami.behavioral.state.unchangeable;

/**
 * @Author alieh on 1/11/22
 */
//this interface plays state role in pattern
public interface Application {
	String getName();

	void pressMKey();

	void pressUpKey();

	void pressCtrlPKey();
}
