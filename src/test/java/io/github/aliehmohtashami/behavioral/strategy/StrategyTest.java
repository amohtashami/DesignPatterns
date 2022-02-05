package io.github.aliehmohtashami.behavioral.strategy;

import io.github.aliehmohtashami.behavioral.strategy.exporters.JpegExporter;
import io.github.aliehmohtashami.behavioral.strategy.exporters.PDFExporter;
import io.github.aliehmohtashami.behavioral.strategy.persisters.DropBoxPersister;
import io.github.aliehmohtashami.behavioral.strategy.persisters.GoogleDrivePersister;
import org.junit.Test;

/**
 * @Author alieh on 1/12/22
 */
public class StrategyTest {
	@Test
	public void testSort() {
		OnlineDiagramCreator context = new OnlineDiagramCreator();
		context.exportAndSave(new JpegExporter(), new DropBoxPersister());

		context.exportAndSave(new PDFExporter(), new GoogleDrivePersister());
	}

}
