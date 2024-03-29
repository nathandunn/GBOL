package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 


/**
 * FeatureRange generated by hbm2java
 */
public abstract class AbstractFeatureRange extends AbstractSimpleObject implements java.io.Serializable {


     private Integer featureRangeId;
     private Feature rightEndFeature;
     private Feature leftEndFeature;
     private Feature feature;
     private FeatureMap featureMap;
     private Feature leftStartFeature;
     private Feature rightStartFeature;
     private String rangeString;

    public AbstractFeatureRange() {
    }

	
    public AbstractFeatureRange(Feature rightEndFeature, Feature feature, FeatureMap featureMap, Feature leftStartFeature) {
        this.rightEndFeature = rightEndFeature;
        this.feature = feature;
        this.featureMap = featureMap;
        this.leftStartFeature = leftStartFeature;
    }
    public AbstractFeatureRange(Feature rightEndFeature, Feature leftEndFeature, Feature feature, FeatureMap featureMap, Feature leftStartFeature, Feature rightStartFeature, String rangeString) {
       this.rightEndFeature = rightEndFeature;
       this.leftEndFeature = leftEndFeature;
       this.feature = feature;
       this.featureMap = featureMap;
       this.leftStartFeature = leftStartFeature;
       this.rightStartFeature = rightStartFeature;
       this.rangeString = rangeString;
    }
   
    public Integer getFeatureRangeId() {
        return this.featureRangeId;
    }
    
    public void setFeatureRangeId(Integer featureRangeId) {
        this.featureRangeId = featureRangeId;
    }
    public Feature getRightEndFeature() {
        return this.rightEndFeature;
    }
    
    public void setRightEndFeature(Feature rightEndFeature) {
        this.rightEndFeature = rightEndFeature;
    }
    public Feature getLeftEndFeature() {
        return this.leftEndFeature;
    }
    
    public void setLeftEndFeature(Feature leftEndFeature) {
        this.leftEndFeature = leftEndFeature;
    }
    public Feature getFeature() {
        return this.feature;
    }
    
    public void setFeature(Feature feature) {
        this.feature = feature;
    }
    public FeatureMap getFeatureMap() {
        return this.featureMap;
    }
    
    public void setFeatureMap(FeatureMap featureMap) {
        this.featureMap = featureMap;
    }
    public Feature getLeftStartFeature() {
        return this.leftStartFeature;
    }
    
    public void setLeftStartFeature(Feature leftStartFeature) {
        this.leftStartFeature = leftStartFeature;
    }
    public Feature getRightStartFeature() {
        return this.rightStartFeature;
    }
    
    public void setRightStartFeature(Feature rightStartFeature) {
        this.rightStartFeature = rightStartFeature;
    }
    public String getRangeString() {
        return this.rangeString;
    }
    
    public void setRangeString(String rangeString) {
        this.rangeString = rangeString;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AbstractFeatureRange) ) return false;
		 AbstractFeatureRange castOther = ( AbstractFeatureRange ) other; 
         
		 return ( (this.getFeature()==castOther.getFeature()) || ( this.getFeature()!=null && castOther.getFeature()!=null && this.getFeature().equals(castOther.getFeature()) ) )
 && ( (this.getFeatureMap()==castOther.getFeatureMap()) || ( this.getFeatureMap()!=null && castOther.getFeatureMap()!=null && this.getFeatureMap().equals(castOther.getFeatureMap()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         
         
         
         result = 37 * result + ( getFeature() == null ? 0 : this.getFeature().hashCode() );
         result = 37 * result + ( getFeatureMap() == null ? 0 : this.getFeatureMap().hashCode() );
         
         
         
         return result;
   }   

public AbstractFeatureRange generateClone() {
	AbstractFeatureRange cloned = new FeatureRange(); 
    	   cloned.rightEndFeature = this.rightEndFeature;
    	   cloned.leftEndFeature = this.leftEndFeature;
    	   cloned.feature = this.feature;
    	   cloned.featureMap = this.featureMap;
    	   cloned.leftStartFeature = this.leftStartFeature;
    	   cloned.rightStartFeature = this.rightStartFeature;
    	   cloned.rangeString = this.rangeString;
	return cloned;
}


}


