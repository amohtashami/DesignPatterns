package io.github.aliehmohtashami.behavioral.state;

import io.github.aliehmohtashami.behavioral.state.changeeable.TVContext;
import io.github.aliehmohtashami.behavioral.state.changeeable.NormalOnState;
import io.github.aliehmohtashami.behavioral.state.unchangeable.MortalKombat;
import io.github.aliehmohtashami.behavioral.state.unchangeable.Word;
import io.github.aliehmohtashami.behavioral.state.unchangeable.OperatingSystem;
import io.github.aliehmohtashami.behavioral.state.unchangeable.SMPlayer;
import org.junit.Test;

/**
 * @Author alieh on 1/9/22
 */
public class StateDesignPatternTest {

	@Test
	public void testDependentStatePattern() {
		TVContext TVContext = new TVContext();
		TVContext.setCurrentTVState(new NormalOnState());
		TVContext.pressMuteBtn();
		TVContext.pressOnBtn();
		TVContext.pressMuteBtn();
		System.out.println(TVContext.getCurrentTVState().toString());
	}

	@Test
	public void testIndependentStatePattern() {
		OperatingSystem windows = new OperatingSystem();
		windows.setCurrentApplication(new Word());
		windows.pressCtrlPBtn();
		windows.pressMBtn();


		windows.setCurrentApplication(new MortalKombat());
		windows.pressCtrlPBtn();
		windows.pressMBtn();

		windows.setCurrentApplication(new SMPlayer());
		windows.pressCtrlPBtn();
		windows.pressMBtn();

	}
}


