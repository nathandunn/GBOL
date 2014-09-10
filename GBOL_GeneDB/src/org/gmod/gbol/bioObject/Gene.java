package org.gmod.gbol.bioObject;


import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;

import org.gmod.gbol.bioObject.conf.BioObjectConfiguration;
import org.gmod.gbol.bioObject.util.BioObjectUtil;
import org.gmod.gbol.simpleObject.CVTerm;
import org.gmod.gbol.simpleObject.Feature;
import org.gmod.gbol.simpleObject.FeatureRelationship;
//import org.gmod.schema.mapped.Organism;
import org.gmod.gbol.simpleObject.Organism;
import org.gmod.gbol.bioObject.AbstractSingleLocationBioFeature;
import org.gmod.gbol.bioObject.Transcript;

/** Wrapper class representing a gene.
 * 
 * @author elee
 *
 */

public class Gene extends AbstractSingleLocationBioFeature {

	/** Constructor.
	 * 
	 * @param feature - Feature object that this class wraps
	 * @param conf - Configuration containing mapping information
	 */
	public Gene(Feature feature, BioObjectConfiguration conf)
	{
		super(feature, conf);
	}

	public Gene(Organism organism, String uniqueName, boolean analysis,
			boolean obsolete, Timestamp dateAccessioned, BioObjectConfiguration conf) {
		super(new Feature(
				conf.getDefaultCVTermForClass("Gene"),
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

	
	/** Retrieve all the transcripts associated with this gene.  Uses the configuration to determine
	 *  which children are transcripts.  Transcript objects are generated on the fly.  The collection
	 *  will be empty if there are no transcripts associated with the gene.
	 *  
	 * @return Collection of transcripts associated with this gene
	 */
	public Collection<Transcript> getTranscripts()
	{
		Collection<Transcript> transcripts = new ArrayList<Transcript>();
		Collection<CVTerm> partOfCvterms = conf.getCVTermsForClass("PartOf");
		Collection<CVTerm> transcriptCvterms = conf.getDescendantCVTermsForClass("Transcript");
		
		for (FeatureRelationship fr : feature.getChildFeatureRelationships()) {
			if (!partOfCvterms.contains(fr.getType())) {
				continue;
			}
			if (!transcriptCvterms.contains(fr.getSubjectFeature().getType())) {
				continue;
			}
			transcripts.add((Transcript)BioObjectUtil.createBioObject(fr.getSubjectFeature(), conf));
		}
		return transcripts;
	}
	
	public Collection<MRNA> getCodingTranscripts() {
		// TODO
		Collection<MRNA> ret = new ArrayList<MRNA>();
		
		for (Transcript transcript: getTranscripts()) {
			if (transcript instanceof MRNA) {
				ret.add((MRNA) transcript);
			}
		}
		
		return ret;
	}

}
