package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 

import java.util.HashSet;
import java.util.Set;

/**
 * FeatureExpression generated by hbm2java
 */
public abstract class AbstractFeatureExpression extends AbstractSimpleObject implements java.io.Serializable {


     private Integer featureExpressionId;
     private Publication publication;
     private Feature feature;
     private Expression expression;
     private Set<FeatureExpressionProperty> featureExpressionProperties = new HashSet<FeatureExpressionProperty>(0);

    public AbstractFeatureExpression() {
    }

	
    public AbstractFeatureExpression(Publication publication, Feature feature, Expression expression) {
        this.publication = publication;
        this.feature = feature;
        this.expression = expression;
    }
    public AbstractFeatureExpression(Publication publication, Feature feature, Expression expression, Set<FeatureExpressionProperty> featureExpressionProperties) {
       this.publication = publication;
       this.feature = feature;
       this.expression = expression;
       this.featureExpressionProperties = featureExpressionProperties;
    }
   
    public Integer getFeatureExpressionId() {
        return this.featureExpressionId;
    }
    
    public void setFeatureExpressionId(Integer featureExpressionId) {
        this.featureExpressionId = featureExpressionId;
    }
    public Publication getPublication() {
        return this.publication;
    }
    
    public void setPublication(Publication publication) {
        this.publication = publication;
    }
    public Feature getFeature() {
        return this.feature;
    }
    
    public void setFeature(Feature feature) {
        this.feature = feature;
    }
    public Expression getExpression() {
        return this.expression;
    }
    
    public void setExpression(Expression expression) {
        this.expression = expression;
    }
    public Set<FeatureExpressionProperty> getFeatureExpressionProperties() {
        return this.featureExpressionProperties;
    }
    
    public void setFeatureExpressionProperties(Set<FeatureExpressionProperty> featureExpressionProperties) {
        this.featureExpressionProperties = featureExpressionProperties;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AbstractFeatureExpression) ) return false;
		 AbstractFeatureExpression castOther = ( AbstractFeatureExpression ) other; 
         
		 return ( (this.getPublication()==castOther.getPublication()) || ( this.getPublication()!=null && castOther.getPublication()!=null && this.getPublication().equals(castOther.getPublication()) ) )
 && ( (this.getFeature()==castOther.getFeature()) || ( this.getFeature()!=null && castOther.getFeature()!=null && this.getFeature().equals(castOther.getFeature()) ) )
 && ( (this.getExpression()==castOther.getExpression()) || ( this.getExpression()!=null && castOther.getExpression()!=null && this.getExpression().equals(castOther.getExpression()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         
         result = 37 * result + ( getPublication() == null ? 0 : this.getPublication().hashCode() );
         result = 37 * result + ( getFeature() == null ? 0 : this.getFeature().hashCode() );
         result = 37 * result + ( getExpression() == null ? 0 : this.getExpression().hashCode() );
         
         return result;
   }   

public AbstractFeatureExpression generateClone() {
	AbstractFeatureExpression cloned = new AbstractFeatureExpression; 
    	   cloned.publication = this.publication;
    	   cloned.feature = this.feature;
    	   cloned.expression = this.expression;
    	   cloned.featureExpressionProperties = this.featureExpressionProperties;
	return cloned;
}


}


