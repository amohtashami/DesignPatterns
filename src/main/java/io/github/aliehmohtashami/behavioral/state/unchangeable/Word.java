package io.github.aliehmohtashami.behavioral.state.unchangeable;

/**
 * @Author alieh on 1/11/22
 */
public class Word implements Application {
	@Override
	public String getName() {
		return "MS-word";

	}

	@Override
	public void pressMKey() {
		System.out.println("writing M character");

	}

	@Override
	public void pressUpKey() {
		System.out.println("Go to above line");

	}

	@Override
	public void pressCtrlPKey() {
		System.out.println("opening printer panel");

	}
}
