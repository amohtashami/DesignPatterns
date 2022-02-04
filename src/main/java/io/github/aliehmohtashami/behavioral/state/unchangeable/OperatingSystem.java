package io.github.aliehmohtashami.behavioral.state.unchangeable;

/**
 * @Author alieh on 1/11/22
 */
//This class plays Context role
public class OperatingSystem {
	private Application currentApplication;

	public void pressMBtn() {
		currentApplication.pressMKey();
	}

	public void pressUpBtn() {
		currentApplication.pressUpKey();
	}

	public void pressCtrlPBtn() {
		currentApplication.pressCtrlPKey();
	}

	public void setCurrentApplication(Application currentApplication) {
		System.out.println();
		System.out.println("current app is set to " + currentApplication.getName());
		System.out.println("------------------------------------------------------");
		this.currentApplication = currentApplication;
	}
}
