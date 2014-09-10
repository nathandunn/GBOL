package org.gmod.gbol.bioObject;


import org.gmod.gbol.bioObject.conf.BioObjectConfiguration;
import org.gmod.gbol.simpleObject.Feature;
import org.gmod.gbol.bioObject.AbstractSingleLocationBioFeature;

/** Wrapper class representing an exon.
 * 
 * @author elee
 *
 */

public class Exon extends AbstractSingleLocationBioFeature {

	/** Constructor.
	 * 
	 * @param feature - Feature object that this class wraps
	 * @param conf - Configuration containing mapping information
	 */
	public Exon(Feature feature, BioObjectConfiguration conf)
	{
		super(feature, conf);
	}
	
}
