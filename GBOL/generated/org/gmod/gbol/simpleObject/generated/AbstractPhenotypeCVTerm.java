package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 


/**
 * PhenotypeCVTerm generated by hbm2java
 */
public abstract class AbstractPhenotypeCVTerm extends AbstractSimpleObject implements java.io.Serializable {


     private Integer phenotypeCVTermId;
     private CVTerm cvterm;
     private Phenotype phenotype;
     private int rank;

    public AbstractPhenotypeCVTerm() {
    }

    public AbstractPhenotypeCVTerm(CVTerm cvterm, Phenotype phenotype, int rank) {
       this.cvterm = cvterm;
       this.phenotype = phenotype;
       this.rank = rank;
    }
   
    public Integer getPhenotypeCVTermId() {
        return this.phenotypeCVTermId;
    }
    
    public void setPhenotypeCVTermId(Integer phenotypeCVTermId) {
        this.phenotypeCVTermId = phenotypeCVTermId;
    }
    public CVTerm getCvterm() {
        return this.cvterm;
    }
    
    public void setCvterm(CVTerm cvterm) {
        this.cvterm = cvterm;
    }
    public Phenotype getPhenotype() {
        return this.phenotype;
    }
    
    public void setPhenotype(Phenotype phenotype) {
        this.phenotype = phenotype;
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
		 if ( !(other instanceof AbstractPhenotypeCVTerm) ) return false;
		 AbstractPhenotypeCVTerm castOther = ( AbstractPhenotypeCVTerm ) other; 
         
		 return ( (this.getCvterm()==castOther.getCvterm()) || ( this.getCvterm()!=null && castOther.getCvterm()!=null && this.getCvterm().equals(castOther.getCvterm()) ) )
 && ( (this.getPhenotype()==castOther.getPhenotype()) || ( this.getPhenotype()!=null && castOther.getPhenotype()!=null && this.getPhenotype().equals(castOther.getPhenotype()) ) )
 && (this.getRank()==castOther.getRank());
   }
   
   public int hashCode() {
         int result = 17;
         
         
         result = 37 * result + ( getCvterm() == null ? 0 : this.getCvterm().hashCode() );
         result = 37 * result + ( getPhenotype() == null ? 0 : this.getPhenotype().hashCode() );
         result = 37 * result + this.getRank();
         return result;
   }   

public AbstractPhenotypeCVTerm generateClone() {
	AbstractPhenotypeCVTerm cloned = new AbstractPhenotypeCVTerm; 
    	   cloned.cvterm = this.cvterm;
    	   cloned.phenotype = this.phenotype;
    	   cloned.rank = this.rank;
	return cloned;
}


}


