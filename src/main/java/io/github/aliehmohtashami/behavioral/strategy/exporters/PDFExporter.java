package io.github.aliehmohtashami.behavioral.strategy.exporters;

/**
 * @Author alieh on 1/12/22
 */
public class PDFExporter implements Exporter {
	@Override
	public void export() {
		System.out.println("Exporting diagram to PDF");
	}
}
