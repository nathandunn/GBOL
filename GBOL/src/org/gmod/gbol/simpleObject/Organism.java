package org.gmod.gbol.simpleObject;

/*
 * Autogenerated extension of org.gmod.gbol.simpleObject.generated.Organism.
 * Add custom code to this file. 
 *
 * Author: Robert Bruggner, rbruggner@berkeleybop.org
 *
*/

public class Organism extends org.gmod.gbol.simpleObject.generated.AbstractOrganism {

	private static final long serialVersionUID = 1L;

	public Organism(){
		super();
	}

	public Organism(String genus, String species) {
		super(genus, species);
	}
	
	public AbstractSimpleObjectIterator getWriteableObjects() {
		return new SimpleObjectIterator(this);
	}
	
	private static class SimpleObjectIterator extends AbstractSimpleObjectIterator {

		private static class Status extends AbstractSimpleObjectIterator.Status {
			public static final int organismProps = 1;
			public static final int organismDbxrefs = 2;
		}
		
		public SimpleObjectIterator(Organism organism) {
			super(organism);
		}

		public AbstractSimpleObject next() {
			Organism organism = (Organism)object;
			AbstractSimpleObject retVal = null;
			if (status != Status.self) {
				retVal = soIter.next();
				if (status == Status.notSet) {
					processCollectionIterators(Status.organismDbxrefs, organism.getOrganismDBXrefs());
				}
				if (status == Status.organismDbxrefs) {
					processCollectionIterators(Status.organismProps, organism.getOrganismProperties());
				}
				if (status == Status.organismProps) {
					processLastCollectionIterator();
				}
			} else {
				retVal = peek();
				status = Status.done;
			}
			current = retVal;
			return retVal;
		}

	}

}
