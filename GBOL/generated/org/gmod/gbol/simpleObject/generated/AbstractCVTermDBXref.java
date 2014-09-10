package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 


/**
 * CVTermDBXref generated by hbm2java
 */
public abstract class AbstractCVTermDBXref extends AbstractSimpleObject implements java.io.Serializable {


     private Integer cvtermDBXrefId;
     private DBXref dbxref;
     private CVTerm cvterm;
     private int isForDefinition;

    public AbstractCVTermDBXref() {
    }

    public AbstractCVTermDBXref(DBXref dbxref, CVTerm cvterm, int isForDefinition) {
       this.dbxref = dbxref;
       this.cvterm = cvterm;
       this.isForDefinition = isForDefinition;
    }
   
    public Integer getCvtermDBXrefId() {
        return this.cvtermDBXrefId;
    }
    
    public void setCvtermDBXrefId(Integer cvtermDBXrefId) {
        this.cvtermDBXrefId = cvtermDBXrefId;
    }
    public DBXref getDbxref() {
        return this.dbxref;
    }
    
    public void setDbxref(DBXref dbxref) {
        this.dbxref = dbxref;
    }
    public CVTerm getCvterm() {
        return this.cvterm;
    }
    
    public void setCvterm(CVTerm cvterm) {
        this.cvterm = cvterm;
    }
    public int getIsForDefinition() {
        return this.isForDefinition;
    }
    
    public void setIsForDefinition(int isForDefinition) {
        this.isForDefinition = isForDefinition;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AbstractCVTermDBXref) ) return false;
		 AbstractCVTermDBXref castOther = ( AbstractCVTermDBXref ) other; 
         
		 return ( (this.getDbxref()==castOther.getDbxref()) || ( this.getDbxref()!=null && castOther.getDbxref()!=null && this.getDbxref().equals(castOther.getDbxref()) ) )
 && ( (this.getCvterm()==castOther.getCvterm()) || ( this.getCvterm()!=null && castOther.getCvterm()!=null && this.getCvterm().equals(castOther.getCvterm()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         
         result = 37 * result + ( getDbxref() == null ? 0 : this.getDbxref().hashCode() );
         result = 37 * result + ( getCvterm() == null ? 0 : this.getCvterm().hashCode() );
         
         return result;
   }   

public AbstractCVTermDBXref generateClone() {
	AbstractCVTermDBXref cloned = new AbstractCVTermDBXref; 
    	   cloned.dbxref = this.dbxref;
    	   cloned.cvterm = this.cvterm;
    	   cloned.isForDefinition = this.isForDefinition;
	return cloned;
}


}


