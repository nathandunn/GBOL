package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 


/**
 * ArrayDesignProperty generated by hbm2java
 */
public abstract class AbstractArrayDesignProperty extends AbstractSimpleObject implements java.io.Serializable {


     private Integer arrayDesignPropertyId;
     private ArrayDesign arrayDesign;
     private CVTerm type;
     private String value;
     private int rank;

    public AbstractArrayDesignProperty() {
    }

	
    public AbstractArrayDesignProperty(ArrayDesign arrayDesign, CVTerm type, int rank) {
        this.arrayDesign = arrayDesign;
        this.type = type;
        this.rank = rank;
    }
    public AbstractArrayDesignProperty(ArrayDesign arrayDesign, CVTerm type, String value, int rank) {
       this.arrayDesign = arrayDesign;
       this.type = type;
       this.value = value;
       this.rank = rank;
    }
   
    public Integer getArrayDesignPropertyId() {
        return this.arrayDesignPropertyId;
    }
    
    public void setArrayDesignPropertyId(Integer arrayDesignPropertyId) {
        this.arrayDesignPropertyId = arrayDesignPropertyId;
    }
    public ArrayDesign getArrayDesign() {
        return this.arrayDesign;
    }
    
    public void setArrayDesign(ArrayDesign arrayDesign) {
        this.arrayDesign = arrayDesign;
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


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AbstractArrayDesignProperty) ) return false;
		 AbstractArrayDesignProperty castOther = ( AbstractArrayDesignProperty ) other; 
         
		 return ( (this.getArrayDesign()==castOther.getArrayDesign()) || ( this.getArrayDesign()!=null && castOther.getArrayDesign()!=null && this.getArrayDesign().equals(castOther.getArrayDesign()) ) )
 && ( (this.getType()==castOther.getType()) || ( this.getType()!=null && castOther.getType()!=null && this.getType().equals(castOther.getType()) ) )
 && (this.getRank()==castOther.getRank());
   }
   
   public int hashCode() {
         int result = 17;
         
         
         result = 37 * result + ( getArrayDesign() == null ? 0 : this.getArrayDesign().hashCode() );
         result = 37 * result + ( getType() == null ? 0 : this.getType().hashCode() );
         
         result = 37 * result + this.getRank();
         return result;
   }   

public AbstractArrayDesignProperty generateClone() {
	AbstractArrayDesignProperty cloned = new AbstractArrayDesignProperty; 
    	   cloned.arrayDesign = this.arrayDesign;
    	   cloned.type = this.type;
    	   cloned.value = this.value;
    	   cloned.rank = this.rank;
	return cloned;
}


}


