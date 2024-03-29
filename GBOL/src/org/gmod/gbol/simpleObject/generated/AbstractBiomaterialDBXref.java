package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 


/**
 * BiomaterialDBXref generated by hbm2java
 */
public abstract class AbstractBiomaterialDBXref extends AbstractSimpleObject implements java.io.Serializable {


     private Integer biomaterialDBXrefId;
     private DBXref dbxref;
     private Biomaterial biomaterial;

    public AbstractBiomaterialDBXref() {
    }

    public AbstractBiomaterialDBXref(DBXref dbxref, Biomaterial biomaterial) {
       this.dbxref = dbxref;
       this.biomaterial = biomaterial;
    }
   
    public Integer getBiomaterialDBXrefId() {
        return this.biomaterialDBXrefId;
    }
    
    public void setBiomaterialDBXrefId(Integer biomaterialDBXrefId) {
        this.biomaterialDBXrefId = biomaterialDBXrefId;
    }
    public DBXref getDbxref() {
        return this.dbxref;
    }
    
    public void setDbxref(DBXref dbxref) {
        this.dbxref = dbxref;
    }
    public Biomaterial getBiomaterial() {
        return this.biomaterial;
    }
    
    public void setBiomaterial(Biomaterial biomaterial) {
        this.biomaterial = biomaterial;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AbstractBiomaterialDBXref) ) return false;
		 AbstractBiomaterialDBXref castOther = ( AbstractBiomaterialDBXref ) other; 
         
		 return ( (this.getDbxref()==castOther.getDbxref()) || ( this.getDbxref()!=null && castOther.getDbxref()!=null && this.getDbxref().equals(castOther.getDbxref()) ) )
 && ( (this.getBiomaterial()==castOther.getBiomaterial()) || ( this.getBiomaterial()!=null && castOther.getBiomaterial()!=null && this.getBiomaterial().equals(castOther.getBiomaterial()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         
         result = 37 * result + ( getDbxref() == null ? 0 : this.getDbxref().hashCode() );
         result = 37 * result + ( getBiomaterial() == null ? 0 : this.getBiomaterial().hashCode() );
         return result;
   }   

public AbstractBiomaterialDBXref generateClone() {
	AbstractBiomaterialDBXref cloned = new BiomaterialDBXref(); 
    	   cloned.dbxref = this.dbxref;
    	   cloned.biomaterial = this.biomaterial;
	return cloned;
}


}


