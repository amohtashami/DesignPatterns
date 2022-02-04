package io.github.aliehmohtashami.behavioral.state.changeeable;


/**
 * @Author alieh on 1/11/22
 */
public class MuteState implements TVState {
	@Override
	public void pressOnButton(TVContext TVContext) {
		System.out.println("pressing on button when tv is mute");
		TVContext.setCurrentTVState(new OffState());
	}

	@Override
	public void pressMuteButton(TVContext TVContext) {
		System.out.println("pressing mute button when tv is mute");
		TVContext.setCurrentTVState(new NormalOnState());
	}

	@Override
	public String toString(){
		return "TV is Mute";
	}
}
