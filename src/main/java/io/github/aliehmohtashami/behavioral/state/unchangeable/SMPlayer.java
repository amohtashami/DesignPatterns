package io.github.aliehmohtashami.behavioral.state.unchangeable;

/**
 * @Author alieh on 1/11/22
 */
public class SMPlayer implements Application {
	@Override
	public String getName() {
		return "SMPlayer";

	}

	@Override
	public void pressMKey() {
		System.out.println("Muting");

	}

	@Override
	public void pressUpKey() {
		System.out.println("jump");

	}

	@Override
	public void pressCtrlPKey() {
		System.out.println("opening preferences panel");

	}
}