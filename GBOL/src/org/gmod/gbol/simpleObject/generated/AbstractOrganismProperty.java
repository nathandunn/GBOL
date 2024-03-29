package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 


/**
 * OrganismProperty generated by hbm2java
 */
public abstract class AbstractOrganismProperty extends AbstractSimpleObject implements java.io.Serializable {


     private Integer organismPropertyId;
     private CVTerm type;
     private Organism organism;
     private String value;
     private int rank;

    public AbstractOrganismProperty() {
    }

	
    public AbstractOrganismProperty(CVTerm type, Organism organism, int rank) {
        this.type = type;
        this.organism = organism;
        this.rank = rank;
    }
    public AbstractOrganismProperty(CVTerm type, Organism organism, String value, int rank) {
       this.type = type;
       this.organism = organism;
       this.value = value;
       this.rank = rank;
    }
   
    public Integer getOrganismPropertyId() {
        return this.organismPropertyId;
    }
    
    public void setOrganismPropertyId(Integer organismPropertyId) {
        this.organismPropertyId = organismPropertyId;
    }
    public CVTerm getType() {
        return this.type;
    }
    
    public void setType(CVTerm type) {
        this.type = type;
    }
    public Organism getOrganism() {
        return this.organism;
    }
    
    public void setOrganism(Organism organism) {
        this.organism = organism;
    }
    public String getValue() {
        return this.value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }
    public int getRank() {
        return this.rank;
    }
    
    public void setRank(int rank) {
        this.rank = rank;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AbstractOrganismProperty) ) return false;
		 AbstractOrganismProperty castOther = ( AbstractOrganismProperty ) other; 
         
		 return ( (this.getType()==castOther.getType()) || ( this.getType()!=null && castOther.getType()!=null && this.getType().equals(castOther.getType()) ) )
 && ( (this.getOrganism()==castOther.getOrganism()) || ( this.getOrganism()!=null && castOther.getOrganism()!=null && this.getOrganism().equals(castOther.getOrganism()) ) )
 && (this.getRank()==castOther.getRank());
   }
   
   public int hashCode() {
         int result = 17;
         
         
         result = 37 * result + ( getType() == null ? 0 : this.getType().hashCode() );
         result = 37 * result + ( getOrganism() == null ? 0 : this.getOrganism().hashCode() );
         
         result = 37 * result + this.getRank();
         return result;
   }   

public AbstractOrganismProperty generateClone() {
	AbstractOrganismProperty cloned = new OrganismProperty(); 
    	   cloned.type = this.type;
    	   cloned.organism = this.organism;
    	   cloned.value = this.value;
    	   cloned.rank = this.rank;
	return cloned;
}


}


