package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 


/**
 * PublicationRelationship generated by hbm2java
 */
public abstract class AbstractPublicationRelationship extends AbstractSimpleObject implements java.io.Serializable {


     private Integer publicationRelationshipId;
     private Publication objectPublication;
     private Publication subjectPublication;
     private CVTerm type;

    public AbstractPublicationRelationship() {
    }

    public AbstractPublicationRelationship(Publication objectPublication, Publication subjectPublication, CVTerm type) {
       this.objectPublication = objectPublication;
       this.subjectPublication = subjectPublication;
       this.type = type;
    }
   
    public Integer getPublicationRelationshipId() {
        return this.publicationRelationshipId;
    }
    
    public void setPublicationRelationshipId(Integer publicationRelationshipId) {
        this.publicationRelationshipId = publicationRelationshipId;
    }
    public Publication getObjectPublication() {
        return this.objectPublication;
    }
    
    public void setObjectPublication(Publication objectPublication) {
        this.objectPublication = objectPublication;
    }
    public Publication getSubjectPublication() {
        return this.subjectPublication;
    }
    
    public void setSubjectPublication(Publication subjectPublication) {
        this.subjectPublication = subjectPublication;
    }
    public CVTerm getType() {
        return this.type;
    }
    
    public void setType(CVTerm type) {
        this.type = type;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AbstractPublicationRelationship) ) return false;
		 AbstractPublicationRelationship castOther = ( AbstractPublicationRelationship ) other; 
         
		 return ( (this.getObjectPublication()==castOther.getObjectPublication()) || ( this.getObjectPublication()!=null && castOther.getObjectPublication()!=null && this.getObjectPublication().equals(castOther.getObjectPublication()) ) )
 && ( (this.getSubjectPublication()==castOther.getSubjectPublication()) || ( this.getSubjectPublication()!=null && castOther.getSubjectPublication()!=null && this.getSubjectPublication().equals(castOther.getSubjectPublication()) ) )
 && ( (this.getType()==castOther.getType()) || ( this.getType()!=null && castOther.getType()!=null && this.getType().equals(castOther.getType()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         
         result = 37 * result + ( getObjectPublication() == null ? 0 : this.getObjectPublication().hashCode() );
         result = 37 * result + ( getSubjectPublication() == null ? 0 : this.getSubjectPublication().hashCode() );
         result = 37 * result + ( getType() == null ? 0 : this.getType().hashCode() );
         return result;
   }   

public AbstractPublicationRelationship generateClone() {
	AbstractPublicationRelationship cloned = new AbstractPublicationRelationship; 
    	   cloned.objectPublication = this.objectPublication;
    	   cloned.subjectPublication = this.subjectPublication;
    	   cloned.type = this.type;
	return cloned;
}


}


