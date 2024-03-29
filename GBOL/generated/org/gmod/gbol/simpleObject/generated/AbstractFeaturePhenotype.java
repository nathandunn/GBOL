package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 


/**
 * FeaturePhenotype generated by hbm2java
 */
public abstract class AbstractFeaturePhenotype extends AbstractSimpleObject implements java.io.Serializable {


     private Integer featurePhenotypeId;
     private Feature feature;
     private Phenotype phenotype;

    public AbstractFeaturePhenotype() {
    }

    public AbstractFeaturePhenotype(Feature feature, Phenotype phenotype) {
       this.feature = feature;
       this.phenotype = phenotype;
    }
   
    public Integer getFeaturePhenotypeId() {
        return this.featurePhenotypeId;
    }
    
    public void setFeaturePhenotypeId(Integer featurePhenotypeId) {
        this.featurePhenotypeId = featurePhenotypeId;
    }
    public Feature getFeature() {
        return this.feature;
    }
    
    public void setFeature(Feature feature) {
        this.feature = feature;
    }
    public Phenotype getPhenotype() {
        return this.phenotype;
    }
    
    public void setPhenotype(Phenotype phenotype) {
        this.phenotype = phenotype;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AbstractFeaturePhenotype) ) return false;
		 AbstractFeaturePhenotype castOther = ( AbstractFeaturePhenotype ) other; 
         
		 return ( (this.getFeature()==castOther.getFeature()) || ( this.getFeature()!=null && castOther.getFeature()!=null && this.getFeature().equals(castOther.getFeature()) ) )
 && ( (this.getPhenotype()==castOther.getPhenotype()) || ( this.getPhenotype()!=null && castOther.getPhenotype()!=null && this.getPhenotype().equals(castOther.getPhenotype()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         
         result = 37 * result + ( getFeature() == null ? 0 : this.getFeature().hashCode() );
         result = 37 * result + ( getPhenotype() == null ? 0 : this.getPhenotype().hashCode() );
         return result;
   }   

public AbstractFeaturePhenotype generateClone() {
	AbstractFeaturePhenotype cloned = new AbstractFeaturePhenotype; 
    	   cloned.feature = this.feature;
    	   cloned.phenotype = this.phenotype;
	return cloned;
}


}


