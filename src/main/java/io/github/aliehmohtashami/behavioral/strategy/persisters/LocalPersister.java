package io.github.aliehmohtashami.behavioral.strategy.persisters;

/**
 * @Author alieh on 2/5/22
 */
public class LocalPersister implements Persister {

	@Override
	public void save() {
		System.out.println("Saving in local");
	}
}
