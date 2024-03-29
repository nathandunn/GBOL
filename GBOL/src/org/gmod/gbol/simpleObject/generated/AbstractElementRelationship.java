package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 


/**
 * ElementRelationship generated by hbm2java
 */
public abstract class AbstractElementRelationship extends AbstractSimpleObject implements java.io.Serializable {


     private Integer elementRelationshipId;
     private Element subjectElement;
     private CVTerm type;
     private Element objectElement;
     private String value;
     private int rank;

    public AbstractElementRelationship() {
    }

	
    public AbstractElementRelationship(Element subjectElement, CVTerm type, Element objectElement, int rank) {
        this.subjectElement = subjectElement;
        this.type = type;
        this.objectElement = objectElement;
        this.rank = rank;
    }
    public AbstractElementRelationship(Element subjectElement, CVTerm type, Element objectElement, String value, int rank) {
       this.subjectElement = subjectElement;
       this.type = type;
       this.objectElement = objectElement;
       this.value = value;
       this.rank = rank;
    }
   
    public Integer getElementRelationshipId() {
        return this.elementRelationshipId;
    }
    
    public void setElementRelationshipId(Integer elementRelationshipId) {
        this.elementRelationshipId = elementRelationshipId;
    }
    public Element getSubjectElement() {
        return this.subjectElement;
    }
    
    public void setSubjectElement(Element subjectElement) {
        this.subjectElement = subjectElement;
    }
    public CVTerm getType() {
        return this.type;
    }
    
    public void setType(CVTerm type) {
        this.type = type;
    }
    public Element getObjectElement() {
        return this.objectElement;
    }
    
    public void setObjectElement(Element objectElement) {
        this.objectElement = objectElement;
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
		 if ( !(other instanceof AbstractElementRelationship) ) return false;
		 AbstractElementRelationship castOther = ( AbstractElementRelationship ) other; 
         
		 return ( (this.getSubjectElement()==castOther.getSubjectElement()) || ( this.getSubjectElement()!=null && castOther.getSubjectElement()!=null && this.getSubjectElement().equals(castOther.getSubjectElement()) ) )
 && ( (this.getType()==castOther.getType()) || ( this.getType()!=null && castOther.getType()!=null && this.getType().equals(castOther.getType()) ) )
 && ( (this.getObjectElement()==castOther.getObjectElement()) || ( this.getObjectElement()!=null && castOther.getObjectElement()!=null && this.getObjectElement().equals(castOther.getObjectElement()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         
         result = 37 * result + ( getSubjectElement() == null ? 0 : this.getSubjectElement().hashCode() );
         result = 37 * result + ( getType() == null ? 0 : this.getType().hashCode() );
         result = 37 * result + ( getObjectElement() == null ? 0 : this.getObjectElement().hashCode() );
         
         
         return result;
   }   

public AbstractElementRelationship generateClone() {
	AbstractElementRelationship cloned = new ElementRelationship(); 
    	   cloned.subjectElement = this.subjectElement;
    	   cloned.type = this.type;
    	   cloned.objectElement = this.objectElement;
    	   cloned.value = this.value;
    	   cloned.rank = this.rank;
	return cloned;
}


}


