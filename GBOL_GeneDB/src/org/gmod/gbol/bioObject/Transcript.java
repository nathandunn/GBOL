package org.gmod.gbol.bioObject;


import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import org.gmod.gbol.bioObject.AbstractSingleLocationBioFeature;
import org.gmod.gbol.bioObject.conf.BioObjectConfiguration;
import org.gmod.gbol.bioObject.util.BioObjectUtil;
import org.gmod.gbol.simpleObject.CVTerm;
import org.gmod.gbol.simpleObject.Feature;
import org.gmod.gbol.simpleObject.FeatureRelationship;
import org.gmod.gbol.simpleObject.Organism;

/** Wrapper class representing a transcript.
 * 
 * @author elee
 *
 */

public class Transcript extends AbstractSingleLocationBioFeature {

	/** Constructor.
	 * 
	 * @param feature - Feature object that this class wraps
	 * @param conf - Configuration containing mapping information
	 */
	public Transcript(Feature feature, BioObjectConfiguration conf)
	{
		super(feature, conf);
	}
	
    public Transcript(Organism organism, String uniqueName, boolean analysis,
            boolean obsolete, Timestamp dateAccessioned, BioObjectConfiguration conf) {
    	super(new Feature(
    			conf.getDefaultCVTermForClass("Transcript"),
    			null,
    			organism,
    			null,
    			uniqueName,
    			null,
    			null,
    			null,
    			analysis,
    			obsolete,
    			dateAccessioned,
    			null),
    			conf);
    }
	
	/** Retrieve all the exons associated with this gene.  Uses the configuration to determine
	 *  which children are exons.  Exon objects are generated on the fly.  The collection
	 *  will be empty if there are no exons associated with the transcript.
	 *  
	 * @return Collection of exons associated with this transcript
	 */

	public Collection<Exon> getExons()
	{
		Collection<Exon> exons = new ArrayList<Exon>();
		Collection<CVTerm> partOfCvterms = conf.getCVTermsForClass("PartOf");
		Collection<CVTerm> exonCvterms = conf.getDescendantCVTermsForClass("Exon");
		
		for (FeatureRelationship fr : feature.getChildFeatureRelationships()) {
			if (!partOfCvterms.contains(fr.getType())) {
				continue;
			}
			if (!exonCvterms.contains(fr.getSubjectFeature().getType())) {
				continue;
			}
			exons.add((Exon)BioObjectUtil.createBioObject(fr.getSubjectFeature(), conf));
		}
		return exons;
	}
	
	public Gene getGene() {
		Collection<CVTerm> partOfCvterms = conf.getCVTermsForClass("PartOf");
		Collection<CVTerm> geneCvterms = conf.getDescendantCVTermsForClass("Gene");
		for (FeatureRelationship fr : feature.getParentFeatureRelationships()) {
			if (!partOfCvterms.contains(fr.getType())) {
				continue;
			}
			if (!geneCvterms.contains(fr.getObjectFeature().getType())) {
				continue;
			}
			return ((Gene)BioObjectUtil.createBioObject(fr.getObjectFeature(), conf));
		}
		return null;
	}
	
	public void setGene(Gene gene) {
		Collection<CVTerm> partOfCvterms = conf.getCVTermsForClass("PartOf");
		Collection<CVTerm> geneCvterms = conf.getDescendantCVTermsForClass("Gene");
		for (FeatureRelationship fr : feature.getParentFeatureRelationships()) {
			if (!partOfCvterms.contains(fr.getType())) {
				continue;
			}
			if (!geneCvterms.contains(fr.getObjectFeature().getType())) {
				continue;
			}
			fr.setObjectFeature(gene.getFeature());
			return;
		}

		FeatureRelationship fr = new FeatureRelationship(
				conf.getDefaultCVTermForClass("PartOf"),
				gene.getFeature(),
				this.feature,
				0 // TODO: Do we need to rank the order of any other transcripts?
		);
		feature.getParentFeatureRelationships().add(fr);
		gene.getFeature().getChildFeatureRelationships().add(fr);
	}
	
	public void lowerFminTo(int fmin) {
		// TODO: Implement lowerFminTo
	}
	public void raiseFmaxTo(int fmax) {
		// TODO: Implement lowerFminTo
	}
}
