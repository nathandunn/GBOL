package org.gmod.gbol.simpleObject;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Autogenerated extension of org.gmod.gbol.simpleObject.generated.FeaturePublicationProperty.
 * Add custom code to this file. 
 *
 * Author: Robert Bruggner, rbruggner@berkeleybop.org
 *
*/

public class FeaturePublicationProperty extends org.gmod.gbol.simpleObject.generated.AbstractFeaturePublicationProperty {

	private static final long serialVersionUID = 1L;

	public FeaturePublicationProperty(){
		super();
	}

//	@Override
//	public Collection<AbstractSimpleObject> getWriteObjects() {
//		ArrayList<AbstractSimpleObject> writeObjects = new ArrayList<AbstractSimpleObject>();
//		// Have to write yourself
//		writeObjects.add(this);
//		
//		// Singletons
//		writeObjects.addAll(this.getType().getWriteObjects());
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
			public final static int type = 1;
		}
	
		public SimpleObjectIterator(FeaturePublicationProperty featurePubProp)
		{
			super(featurePubProp);
		}
		
		public AbstractSimpleObject next()
		{
			FeaturePublicationProperty featurePubProp = (FeaturePublicationProperty)object;
			AbstractSimpleObject retVal = null;
			if (status == Status.self) {
				retVal = peek();
				processSingletonIterator(Status.type, featurePubProp.getType());
			}
			else {
				if (status == Status.type) {
					retVal = soIter.next();
				}
			}
			current = retVal;
			return retVal;
		}
	}
	
}
