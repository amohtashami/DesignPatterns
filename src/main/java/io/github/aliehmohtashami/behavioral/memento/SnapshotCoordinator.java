package io.github.aliehmohtashami.behavioral.memento;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author alieh on 1/9/22
 */

/**
 * plays Caretaker role
 */
public class SnapshotCoordinator {
	Map<String, Snapshot> mementoList = new HashMap();

	public void add(String name, Snapshot snapshot) {
		mementoList.put(name, snapshot);
	}

	public Snapshot get(String name) {
		return mementoList.get(name);
	}
}
