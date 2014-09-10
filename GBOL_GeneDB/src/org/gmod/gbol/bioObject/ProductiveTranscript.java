package org.gmod.gbol.bioObject;
import java.util.ArrayList;
import java.util.Collection;

import org.gmod.gbol.bioObject.Transcript;
import org.gmod.gbol.bioObject.conf.BioObjectConfiguration;
import org.gmod.gbol.bioObject.util.BioObjectUtil;
import org.gmod.gbol.simpleObject.CVTerm;
import org.gmod.gbol.simpleObject.Feature;
import org.gmod.gbol.simpleObject.FeatureRelationship;


public abstract class ProductiveTranscript extends Transcript {

	public ProductiveTranscript(Feature feature, BioObjectConfiguration conf) {
		super(feature, conf);
	}

    public String getProteinUniqueName() {
        Polypeptide protein = getProtein();
        if (protein == null) {
            return null;
        }
        return protein.getUniqueName();
    }
    
	public void setProtein(Polypeptide protein) {
		Collection<CVTerm> partOfCvterms = conf.getCVTermsForClass("PartOf");
		Collection<CVTerm> proteinCvterms = conf.getDescendantCVTermsForClass("Polypeptide");
		for (FeatureRelationship fr : feature.getChildFeatureRelationships()) {
			if (!partOfCvterms.contains(fr.getType())) {
				continue;
			}
			if (!proteinCvterms.contains(fr.getSubjectFeature().getType())) {
				continue;
			}
			fr.setSubjectFeature(protein.getFeature());
			return;
		}

		FeatureRelationship fr = new FeatureRelationship(
				conf.getDefaultCVTermForClass("PartOf"),
				this.feature,
				protein.getFeature(),
				0
		);
		feature.getChildFeatureRelationships().add(fr);
		protein.getFeature().getParentFeatureRelationships().add(fr);
	}
    
	public Polypeptide getProtein()
	{
		Collection<CVTerm> partOfCvterms = conf.getCVTermsForClass("PartOf");
		Collection<CVTerm> proteinCvterms = conf.getDescendantCVTermsForClass("Polypeptide");
		
		for (FeatureRelationship fr : feature.getChildFeatureRelationships()) {
			if (!partOfCvterms.contains(fr.getType())) {
				continue;
			}
			if (!proteinCvterms.contains(fr.getSubjectFeature().getType())) {
				continue;
			}
			return ((Polypeptide)BioObjectUtil.createBioObject(fr.getSubjectFeature(), conf));
		}
		return null;
	}
	
	
}
