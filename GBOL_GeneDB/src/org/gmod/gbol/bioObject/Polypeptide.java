package org.gmod.gbol.bioObject;

import java.sql.Timestamp;
import java.util.Collection;

import org.gmod.gbol.bioObject.conf.BioObjectConfiguration;
import org.gmod.gbol.bioObject.util.BioObjectUtil;
import org.gmod.gbol.simpleObject.CVTerm;
import org.gmod.gbol.simpleObject.Feature;
import org.gmod.gbol.simpleObject.FeatureRelationship;
import org.gmod.gbol.simpleObject.Organism;

public class Polypeptide extends AbstractSingleLocationBioFeature {
	/** Constructor.
	 * 
	 * @param feature - Feature object that this class wraps
	 * @param conf - Configuration containing mapping information
	 */
	public Polypeptide(Feature feature, BioObjectConfiguration conf)
	{
		super(feature, conf);
	}
	
    public Polypeptide(Organism organism, String uniqueName, boolean analysis,
            boolean obsolete, Timestamp dateAccessioned, BioObjectConfiguration conf) {
    	super(new Feature(
    			conf.getDefaultCVTermForClass("Polypeptide"),
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
    public Polypeptide(Organism organism, String uniqueName, BioObjectConfiguration conf) {
        this(organism, uniqueName, false, false, new Timestamp(System.currentTimeMillis()), conf);
    }
    
    
	public Transcript getTranscript() {
		Collection<CVTerm> partOfCvterms = conf.getCVTermsForClass("PartOf");
		Collection<CVTerm> transcriptCvterms = conf.getDescendantCVTermsForClass("Transcript");
		for (FeatureRelationship fr : feature.getParentFeatureRelationships()) {
			if (!partOfCvterms.contains(fr.getType())) {
				continue;
			}
			if (!transcriptCvterms.contains(fr.getSubjectFeature().getType())) {
				continue;
			}
			return ((Transcript)BioObjectUtil.createBioObject(fr.getObjectFeature(), conf));
		}
		return null;
	}
	
	public Gene getGene() {
		Transcript t = this.getTranscript();
		if (t == null) { return null; }
		return t.getGene();
	}
}
