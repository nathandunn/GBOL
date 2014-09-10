package org.gmod.gbol.simpleObject;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Autogenerated extension of org.gmod.gbol.simpleObject.generated.FeaturePropertyPublication.
 * Add custom code to this file. 
 *
 * Author: Robert Bruggner, rbruggner@berkeleybop.org
 *
*/

public class FeaturePropertyPublication extends org.gmod.gbol.simpleObject.generated.AbstractFeaturePropertyPublication {

	private static final long serialVersionUID = 1L;

	public FeaturePropertyPublication(){
		super();
	}

//	@Override
//	public Collection<AbstractSimpleObject> getWriteObjects() {
//		ArrayList<AbstractSimpleObject> writeObjects = new ArrayList<AbstractSimpleObject>();
//		// Have to write yourself
//		writeObjects.add(this);
//		
//		// Singletons
//		writeObjects.addAll(this.getPublication().getWriteObjects());
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
			public final static int pub = 1;
		}
	
		public SimpleObjectIterator(FeaturePropertyPublication featurePropPub)
		{
			super(featurePropPub);
		}
		
		public AbstractSimpleObject next()
		{
			FeaturePropertyPublication featurePropPub = (FeaturePropertyPublication)object;
			AbstractSimpleObject retVal = null;
			if (status == Status.self) {
				retVal = peek();
				processSingletonIterator(Status.pub, featurePropPub.getPublication());
			}
			else {
				if (status == Status.pub) {
					retVal = soIter.next();
				}
			}
			current = retVal;
			return retVal;
		}
	}

}
