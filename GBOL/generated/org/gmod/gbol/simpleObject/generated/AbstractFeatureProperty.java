package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 

import java.util.HashSet;
import java.util.Set;

/**
 * FeatureProperty generated by hbm2java
 */
public abstract class AbstractFeatureProperty extends AbstractSimpleObject implements java.io.Serializable {


     private Integer featurePropertyId;
     private Feature feature;
     private CVTerm type;
     private String value;
     private int rank;
     private Set<FeaturePropertyPublication> featurePropertyPublications = new HashSet<FeaturePropertyPublication>(0);

    public AbstractFeatureProperty() {
    }

	
    public AbstractFeatureProperty(Feature feature, CVTerm type, int rank) {
        this.feature = feature;
        this.type = type;
        this.rank = rank;
    }
    public AbstractFeatureProperty(Feature feature, CVTerm type, String value, int rank, Set<FeaturePropertyPublication> featurePropertyPublications) {
       this.feature = feature;
       this.type = type;
       this.value = value;
       this.rank = rank;
       this.featurePropertyPublications = featurePropertyPublications;
    }
   
    public Integer getFeaturePropertyId() {
        return this.featurePropertyId;
    }
    
    public void setFeaturePropertyId(Integer featurePropertyId) {
        this.featurePropertyId = featurePropertyId;
    }
    public Feature getFeature() {
        return this.feature;
    }
    
    public void setFeature(Feature feature) {
        this.feature = feature;
    }
    public CVTerm getType() {
        return this.type;
    }
    
    public void setType(CVTerm type) {
        this.type = type;
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
    public Set<FeaturePropertyPublication> getFeaturePropertyPublications() {
        return this.featurePropertyPublications;
    }
    
    public void setFeaturePropertyPublications(Set<FeaturePropertyPublication> featurePropertyPublications) {
        this.featurePropertyPublications = featurePropertyPublications;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AbstractFeatureProperty) ) return false;
		 AbstractFeatureProperty castOther = ( AbstractFeatureProperty ) other; 
         
		 return ( (this.getFeature()==castOther.getFeature()) || ( this.getFeature()!=null && castOther.getFeature()!=null && this.getFeature().equals(castOther.getFeature()) ) )
 && ( (this.getType()==castOther.getType()) || ( this.getType()!=null && castOther.getType()!=null && this.getType().equals(castOther.getType()) ) )
 && (this.getRank()==castOther.getRank());
   }
   
   public int hashCode() {
         int result = 17;
         
         
         result = 37 * result + ( getFeature() == null ? 0 : this.getFeature().hashCode() );
         result = 37 * result + ( getType() == null ? 0 : this.getType().hashCode() );
         
         result = 37 * result + this.getRank();
         
         return result;
   }   

public AbstractFeatureProperty generateClone() {
	AbstractFeatureProperty cloned = new AbstractFeatureProperty; 
    	   cloned.feature = this.feature;
    	   cloned.type = this.type;
    	   cloned.value = this.value;
    	   cloned.rank = this.rank;
    	   cloned.featurePropertyPublications = this.featurePropertyPublications;
	return cloned;
}


}


