package io.github.aliehmohtashami.behavioral.strategy;

import io.github.aliehmohtashami.behavioral.strategy.exporters.Exporter;
import io.github.aliehmohtashami.behavioral.strategy.persisters.Persister;

/**
 * @Author alieh on 1/12/22
 */
//This class plays role of context class
public class OnlineDiagramCreator {

	public void exportAndSave(Exporter exporter, Persister persister) {
		exporter.export();
		persister.save();
	}


}
