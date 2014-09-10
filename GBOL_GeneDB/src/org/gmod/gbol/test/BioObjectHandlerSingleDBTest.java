package org.gmod.gbol.test;

import java.util.Collection;

import org.apache.log4j.PropertyConfigurator;
import org.gmod.gbol.bioObject.AbstractBioFeature;
import org.gmod.gbol.bioObject.AbstractSingleLocationBioFeature;
import org.gmod.gbol.bioObject.Exon;
import org.gmod.gbol.bioObject.Gene;
import org.gmod.gbol.bioObject.Polypeptide;
import org.gmod.gbol.bioObject.ProductiveTranscript;
import org.gmod.gbol.bioObject.Transcript;
import org.gmod.gbol.bioObject.conf.BioObjectConfiguration;
import org.gmod.gbol.bioObject.io.BioObjectHandler;
import org.gmod.gbol.simpleObject.io.SimpleObjectIOInterface;
import org.gmod.gbol.simpleObject.io.impl.HibernateHandler;

import junit.framework.TestCase;

public class BioObjectHandlerSingleDBTest extends TestCase {

	private BioObjectHandler handler;
	
	public BioObjectHandlerSingleDBTest() throws Exception
	{
		PropertyConfigurator.configure("testSupport/log4j.properties");
		BioObjectConfiguration conf = new BioObjectConfiguration("testSupport/gbolOne.mapping.xml");
		SimpleObjectIOInterface h = new HibernateHandler("testSupport/gbolOne.cfg.xml");
		handler = new BioObjectHandler(conf, h);
	}
	
	public void testGetAllFeatures() throws Exception
	{
		Collection<AbstractBioFeature> features = handler.getAllFeatures();
		assertEquals(9, features.size());
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
		assertEquals("Expected number of genes", 3, numGenes);
		assertEquals("Expected number of transcripts", 2, numTranscripts);
		assertEquals("Expected number of exons", 1, numExons);
	}
	
	public void testGetGenes() throws Exception
	{
		Collection<Gene> genes = handler.getAllGenes();
		assertEquals(3, genes.size());
		for (Gene gene : genes) {
			printFeatureInfo(gene, 0);
			Collection<Transcript> transcripts = gene.getTranscripts();
			if (gene.getUniqueName().equals("imagene")) {
				assertEquals(2, transcripts.size());
			}
			for (Transcript transcript : transcripts) {
				printFeatureInfo(transcript, 1);
				Collection<Exon> exons = transcript.getExons();
				for (Exon exon : exons) {
					printFeatureInfo(exon, 2);
				}
			}
		}
	}
	
	public void testGetPolypeptides() throws Exception
	{
		Collection<Gene> genes = handler.getAllGenes();
		for (Gene gene : genes) {
			Collection<? extends ProductiveTranscript> transcripts = gene.getCodingTranscripts();
			for (ProductiveTranscript transcript : transcripts) {
				printFeatureInfo(transcript, 0);
				Polypeptide p = transcript.getProtein();
				assertNotNull(p);
				assertEquals("imapolypeptide", p.getUniqueName());
			}
		}
	}
	
	
	private void printFeatureInfo(AbstractSingleLocationBioFeature feature, int indent)
	{
		for (int i = 0; i < indent; ++i) {
			System.out.print("\t");
		}
		System.out.printf("%s\t(%d,%d)%n", feature.getUniqueName(), feature.getFeatureLocation() == null ? 0 : feature.getFeatureLocation().getFmin(),
				feature.getFeatureLocation() == null ? 0 : feature.getFeatureLocation().getFmax());
	}

}
