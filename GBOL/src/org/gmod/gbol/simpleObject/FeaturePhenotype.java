package org.gmod.gbol.simpleObject;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Autogenerated extension of org.gmod.gbol.simpleObject.generated.FeaturePhenotype.
 * Add custom code to this file. 
 *
 * Author: Robert Bruggner, rbruggner@berkeleybop.org
 *
*/

public class FeaturePhenotype extends org.gmod.gbol.simpleObject.generated.AbstractFeaturePhenotype {

	private static final long serialVersionUID = 1L;

	public FeaturePhenotype(){
		super();
	}

//	@Override
//	public Collection<AbstractSimpleObject> getWriteObjects() {
//		ArrayList<AbstractSimpleObject> writeObjects = new ArrayList<AbstractSimpleObject>();
//		// Have to write yourself
//		writeObjects.add(this);
//		
//		// Singletons
//		writeObjects.addAll(this.getPhenotype().getWriteObjects());
//		
//		return writeObjects;
//	}

	public AbstractSimpleObjectIterator getWriteableObjects()
	{
		return new SimpleObjectIterator(this);
	}
	
	private static class SimpleObjectIterator extends AbstractSimpleObjectIterator
	{

		private static class Status extends AbstractSimpleObjectIterator.Status
		{
			public final static int phenotype = 1;
		}
	
		public SimpleObjectIterator(FeaturePhenotype featurePhenotype)
		{
			super(featurePhenotype);
		}
		
		public AbstractSimpleObject next()
		{
			FeaturePhenotype featurePhenotype = (FeaturePhenotype)object;
			AbstractSimpleObject retVal = null;
			if (status == Status.self) {
				retVal = peek();
				processSingletonIterator(Status.phenotype, featurePhenotype.getPhenotype());
			}
			else {
				if (status == Status.phenotype) {
					retVal = soIter.next();
				}
			}
			current = retVal;
			return retVal;
		}
	}


}
