package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 


/**
 * LibrarySynonym generated by hbm2java
 */
public abstract class AbstractLibrarySynonym extends AbstractSimpleObject implements java.io.Serializable {


     private Integer librarySynonymId;
     private Publication publication;
     private Synonym synonym;
     private Library library;
     private boolean isCurrent;
     private boolean isInternal;

    public AbstractLibrarySynonym() {
    }

    public AbstractLibrarySynonym(Publication publication, Synonym synonym, Library library, boolean isCurrent, boolean isInternal) {
       this.publication = publication;
       this.synonym = synonym;
       this.library = library;
       this.isCurrent = isCurrent;
       this.isInternal = isInternal;
    }
   
    public Integer getLibrarySynonymId() {
        return this.librarySynonymId;
    }
    
    public void setLibrarySynonymId(Integer librarySynonymId) {
        this.librarySynonymId = librarySynonymId;
    }
    public Publication getPublication() {
        return this.publication;
    }
    
    public void setPublication(Publication publication) {
        this.publication = publication;
    }
    public Synonym getSynonym() {
        return this.synonym;
    }
    
    public void setSynonym(Synonym synonym) {
        this.synonym = synonym;
    }
    public Library getLibrary() {
        return this.library;
    }
    
    public void setLibrary(Library library) {
        this.library = library;
    }
    public boolean isIsCurrent() {
        return this.isCurrent;
    }
    
    public void setIsCurrent(boolean isCurrent) {
        this.isCurrent = isCurrent;
    }
    public boolean isIsInternal() {
        return this.isInternal;
    }
    
    public void setIsInternal(boolean isInternal) {
        this.isInternal = isInternal;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AbstractLibrarySynonym) ) return false;
		 AbstractLibrarySynonym castOther = ( AbstractLibrarySynonym ) other; 
         
		 return ( (this.getSynonym()==castOther.getSynonym()) || ( this.getSynonym()!=null && castOther.getSynonym()!=null && this.getSynonym().equals(castOther.getSynonym()) ) )
 && ( (this.getLibrary()==castOther.getLibrary()) || ( this.getLibrary()!=null && castOther.getLibrary()!=null && this.getLibrary().equals(castOther.getLibrary()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         
         
         result = 37 * result + ( getSynonym() == null ? 0 : this.getSynonym().hashCode() );
         result = 37 * result + ( getLibrary() == null ? 0 : this.getLibrary().hashCode() );
         
         
         return result;
   }   

public AbstractLibrarySynonym generateClone() {
	AbstractLibrarySynonym cloned = new AbstractLibrarySynonym; 
    	   cloned.publication = this.publication;
    	   cloned.synonym = this.synonym;
    	   cloned.library = this.library;
    	   cloned.isCurrent = this.isCurrent;
    	   cloned.isInternal = this.isInternal;
	return cloned;
}


}


