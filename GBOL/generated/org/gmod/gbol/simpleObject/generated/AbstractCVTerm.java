package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 

import java.util.HashSet;
import java.util.Set;

/**
 * CVTerm generated by hbm2java
 */
public abstract class AbstractCVTerm extends AbstractSimpleObject implements java.io.Serializable {


     private Integer cvtermId;
     private DBXref dbxref;
     private CV cv;
     private String name;
     private String definition;
     private int isObsolete;
     private int isRelationshipType;
     private Set<CVTermPath> parentCVTermPaths = new HashSet<CVTermPath>(0);
     private Set<CVTermRelationship> parentCVTermRelationships = new HashSet<CVTermRelationship>(0);
     private Set<CVTermPath> childCVTermPaths = new HashSet<CVTermPath>(0);
     private Set<CVTermRelationship> childCVTermRelationships = new HashSet<CVTermRelationship>(0);

    public AbstractCVTerm() {
    }

	
    public AbstractCVTerm(DBXref dbxref, CV cv, String name, int isObsolete, int isRelationshipType) {
        this.dbxref = dbxref;
        this.cv = cv;
        this.name = name;
        this.isObsolete = isObsolete;
        this.isRelationshipType = isRelationshipType;
    }
    public AbstractCVTerm(DBXref dbxref, CV cv, String name, String definition, int isObsolete, int isRelationshipType, Set<CVTermPath> parentCVTermPaths, Set<CVTermRelationship> parentCVTermRelationships, Set<CVTermPath> childCVTermPaths, Set<CVTermRelationship> childCVTermRelationships) {
       this.dbxref = dbxref;
       this.cv = cv;
       this.name = name;
       this.definition = definition;
       this.isObsolete = isObsolete;
       this.isRelationshipType = isRelationshipType;
       this.parentCVTermPaths = parentCVTermPaths;
       this.parentCVTermRelationships = parentCVTermRelationships;
       this.childCVTermPaths = childCVTermPaths;
       this.childCVTermRelationships = childCVTermRelationships;
    }
   
    public Integer getCvtermId() {
        return this.cvtermId;
    }
    
    public void setCvtermId(Integer cvtermId) {
        this.cvtermId = cvtermId;
    }
    public DBXref getDbxref() {
        return this.dbxref;
    }
    
    public void setDbxref(DBXref dbxref) {
        this.dbxref = dbxref;
    }
    public CV getCv() {
        return this.cv;
    }
    
    public void setCv(CV cv) {
        this.cv = cv;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getDefinition() {
        return this.definition;
    }
    
    public void setDefinition(String definition) {
        this.definition = definition;
    }
    public int getIsObsolete() {
        return this.isObsolete;
    }
    
    public void setIsObsolete(int isObsolete) {
        this.isObsolete = isObsolete;
    }
    public int getIsRelationshipType() {
        return this.isRelationshipType;
    }
    
    public void setIsRelationshipType(int isRelationshipType) {
        this.isRelationshipType = isRelationshipType;
    }
    public Set<CVTermPath> getParentCVTermPaths() {
        return this.parentCVTermPaths;
    }
    
    public void setParentCVTermPaths(Set<CVTermPath> parentCVTermPaths) {
        this.parentCVTermPaths = parentCVTermPaths;
    }
    public Set<CVTermRelationship> getParentCVTermRelationships() {
        return this.parentCVTermRelationships;
    }
    
    public void setParentCVTermRelationships(Set<CVTermRelationship> parentCVTermRelationships) {
        this.parentCVTermRelationships = parentCVTermRelationships;
    }
    public Set<CVTermPath> getChildCVTermPaths() {
        return this.childCVTermPaths;
    }
    
    public void setChildCVTermPaths(Set<CVTermPath> childCVTermPaths) {
        this.childCVTermPaths = childCVTermPaths;
    }
    public Set<CVTermRelationship> getChildCVTermRelationships() {
        return this.childCVTermRelationships;
    }
    
    public void setChildCVTermRelationships(Set<CVTermRelationship> childCVTermRelationships) {
        this.childCVTermRelationships = childCVTermRelationships;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AbstractCVTerm) ) return false;
		 AbstractCVTerm castOther = ( AbstractCVTerm ) other; 
         
		 return ( (this.getCv()==castOther.getCv()) || ( this.getCv()!=null && castOther.getCv()!=null && this.getCv().equals(castOther.getCv()) ) )
 && ( (this.getName()==castOther.getName()) || ( this.getName()!=null && castOther.getName()!=null && this.getName().equals(castOther.getName()) ) )
 && (this.getIsObsolete()==castOther.getIsObsolete());
   }
   
   public int hashCode() {
         int result = 17;
         
         
         
         result = 37 * result + ( getCv() == null ? 0 : this.getCv().hashCode() );
         result = 37 * result + ( getName() == null ? 0 : this.getName().hashCode() );
         
         result = 37 * result + this.getIsObsolete();
         
         
         
         
         
         return result;
   }   

public AbstractCVTerm generateClone() {
	AbstractCVTerm cloned = new AbstractCVTerm; 
    	   cloned.dbxref = this.dbxref;
    	   cloned.cv = this.cv;
    	   cloned.name = this.name;
    	   cloned.definition = this.definition;
    	   cloned.isObsolete = this.isObsolete;
    	   cloned.isRelationshipType = this.isRelationshipType;
    	   cloned.parentCVTermPaths = this.parentCVTermPaths;
    	   cloned.parentCVTermRelationships = this.parentCVTermRelationships;
    	   cloned.childCVTermPaths = this.childCVTermPaths;
    	   cloned.childCVTermRelationships = this.childCVTermRelationships;
	return cloned;
}


}


