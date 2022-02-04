package io.github.aliehmohtashami.behavioral.state.unchangeable;

/**
 * @Author alieh on 1/11/22
 */
public class MortalKombat implements Application {
	@Override
	public String getName() {
		return "MortalKombat";
	}

	@Override
	public void pressMKey() {
		System.out.println("Kick");

	}

	@Override
	public void pressUpKey() {
		System.out.println("jump");

	}

	@Override
	public void pressCtrlPKey() {
		System.out.println("opening panel to change player's character");

	}
}