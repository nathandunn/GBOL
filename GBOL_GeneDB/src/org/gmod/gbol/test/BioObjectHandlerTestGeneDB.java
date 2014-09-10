package org.gmod.gbol.test;

import java.util.Collection;

import org.apache.log4j.PropertyConfigurator;
import org.gmod.gbol.bioObject.AbstractBioFeature;
import org.gmod.gbol.bioObject.AbstractSingleLocationBioFeature;
import org.gmod.gbol.bioObject.Exon;
import org.gmod.gbol.bioObject.Gene;
import org.gmod.gbol.bioObject.Transcript;
import org.gmod.gbol.bioObject.conf.BioObjectConfiguration;
import org.gmod.gbol.bioObject.io.BioObjectHandler;
import org.gmod.gbol.simpleObject.io.SimpleObjectIOInterface;
import org.gmod.gbol.simpleObject.io.impl.HibernateHandler;

import junit.framework.TestCase;

public class BioObjectHandlerTestGeneDB extends TestCase {

	private BioObjectHandler handler;
	
	public BioObjectHandlerTestGeneDB() throws Exception
	{
		PropertyConfigurator.configure("testSupport/log4j.properties");
		BioObjectConfiguration conf = new BioObjectConfiguration("testSupport/genedb.mapping.xml");
		SimpleObjectIOInterface h = new HibernateHandler("testSupport/genedb.cfg.xml");
		handler = new BioObjectHandler(conf, h);
	}
	
	public void testGetFeatures() throws Exception
	{
		Collection<AbstractBioFeature> features = handler.getFeaturesByRange(
				"Leishmania", "major strain Friedlin", "sequence", "chromosome",
				"Lmjchr1", 0, 10000, -1
			);
		assertEquals(features.size(), 11);
		int numGenes = 0;
		int numTranscripts = 0;
		int numExons = 0;
		for (AbstractBioFeature f : features) {
			if (f instanceof Gene) {
				++numGenes;
			}
			if (f instanceof Transcript) {
				++numTranscripts;
			}
			if (f instanceof Exon) {
				++numExons;
			}
		}
		assertEquals("Expected number of genes", 2, numGenes);
		assertEquals("Expected number of transcripts", 2, numTranscripts);
		assertEquals("Expected number of exons", 2, numExons);
	}
	
	public void testGetGenes() throws Exception
	{
		Collection<Gene> genes = handler.getGenesByRange(
			"Leishmania", "major strain Friedlin", "sequence", "chromosome",
			"Lmjchr1", 0, 10000, -1
		);
		assertEquals(2, genes.size());
		for (Gene gene : genes) {
			printFeatureInfo(gene, 0);
			Collection<Transcript> transcripts = gene.getTranscripts();
			assertEquals(1, transcripts.size());
			for (Transcript transcript : transcripts) {
				printFeatureInfo(transcript, 1);
				Collection<Exon> exons = transcript.getExons();
				for (Exon exon : exons) {
					printFeatureInfo(exon, 2);
				}
			}
		}
	}
		
	private void printFeatureInfo(AbstractSingleLocationBioFeature feature, int indent)
	{
		for (int i = 0; i < indent; ++i) {
			System.out.print("\t");
		}
		System.out.printf("%s\t(%d,%d)%n", feature.getUniqueName(), feature.getFeatureLocation().getFmin(),
				feature.getFeatureLocation().getFmax());
	}

}
