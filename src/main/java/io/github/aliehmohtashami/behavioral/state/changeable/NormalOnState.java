package io.github.aliehmohtashami.behavioral.state.changeable;


/**
 * @Author alieh on 1/11/22
 */
public class NormalOnState implements TVState {
	@Override
	public void pressOnButton(TVContext TVContext) {
		System.out.println("pressing on button when tv is on");
		TVContext.setCurrentTVState(new OffState());
	}

	@Override
	public void pressMuteButton(TVContext TVContext) {
		System.out.println("pressing mute button when tv is on");
		TVContext.setCurrentTVState(new MuteState());
	}

	@Override
	public String toString(){
		return "TV is ON";
	}
}
