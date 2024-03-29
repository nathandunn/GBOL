package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 

import java.util.HashSet;
import java.util.Set;

/**
 * EImage generated by hbm2java
 */
public abstract class AbstractEImage extends AbstractSimpleObject implements java.io.Serializable {


     private Integer eImageId;
     private String data;
     private String type;
     private String imageUri;
     private Set<ExpressionImage> expressionImages = new HashSet<ExpressionImage>(0);

    public AbstractEImage() {
    }

	
    public AbstractEImage(String type) {
        this.type = type;
    }
    public AbstractEImage(String data, String type, String imageUri, Set<ExpressionImage> expressionImages) {
       this.data = data;
       this.type = type;
       this.imageUri = imageUri;
       this.expressionImages = expressionImages;
    }
   
    public Integer geteImageId() {
        return this.eImageId;
    }
    
    public void seteImageId(Integer eImageId) {
        this.eImageId = eImageId;
    }
    public String getData() {
        return this.data;
    }
    
    public void setData(String data) {
        this.data = data;
    }
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public String getImageUri() {
        return this.imageUri;
    }
    
    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }
    public Set<ExpressionImage> getExpressionImages() {
        return this.expressionImages;
    }
    
    public void setExpressionImages(Set<ExpressionImage> expressionImages) {
        this.expressionImages = expressionImages;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AbstractEImage) ) return false;
		 AbstractEImage castOther = ( AbstractEImage ) other; 
         
		 return ( (this.getData()==castOther.getData()) || ( this.getData()!=null && castOther.getData()!=null && this.getData().equals(castOther.getData()) ) )
 && ( (this.getType()==castOther.getType()) || ( this.getType()!=null && castOther.getType()!=null && this.getType().equals(castOther.getType()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         
         result = 37 * result + ( getData() == null ? 0 : this.getData().hashCode() );
         result = 37 * result + ( getType() == null ? 0 : this.getType().hashCode() );
         
         
         return result;
   }   

public AbstractEImage generateClone() {
	AbstractEImage cloned = new EImage(); 
    	   cloned.data = this.data;
    	   cloned.type = this.type;
    	   cloned.imageUri = this.imageUri;
    	   cloned.expressionImages = this.expressionImages;
	return cloned;
}


}


