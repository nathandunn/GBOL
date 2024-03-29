package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 


/**
 * LibraryCVTerm generated by hbm2java
 */
public abstract class AbstractLibraryCVTerm extends AbstractSimpleObject implements java.io.Serializable {


     private Integer libraryCVTermId;
     private Publication publication;
     private CVTerm cvterm;
     private Library library;

    public AbstractLibraryCVTerm() {
    }

    public AbstractLibraryCVTerm(Publication publication, CVTerm cvterm, Library library) {
       this.publication = publication;
       this.cvterm = cvterm;
       this.library = library;
    }
   
    public Integer getLibraryCVTermId() {
        return this.libraryCVTermId;
    }
    
    public void setLibraryCVTermId(Integer libraryCVTermId) {
        this.libraryCVTermId = libraryCVTermId;
    }
    public Publication getPublication() {
        return this.publication;
    }
    
    public void setPublication(Publication publication) {
        this.publication = publication;
    }
    public CVTerm getCvterm() {
        return this.cvterm;
    }
    
    public void setCvterm(CVTerm cvterm) {
        this.cvterm = cvterm;
    }
    public Library getLibrary() {
        return this.library;
    }
    
    public void setLibrary(Library library) {
        this.library = library;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AbstractLibraryCVTerm) ) return false;
		 AbstractLibraryCVTerm castOther = ( AbstractLibraryCVTerm ) other; 
         
		 return ( (this.getPublication()==castOther.getPublication()) || ( this.getPublication()!=null && castOther.getPublication()!=null && this.getPublication().equals(castOther.getPublication()) ) )
 && ( (this.getCvterm()==castOther.getCvterm()) || ( this.getCvterm()!=null && castOther.getCvterm()!=null && this.getCvterm().equals(castOther.getCvterm()) ) )
 && ( (this.getLibrary()==castOther.getLibrary()) || ( this.getLibrary()!=null && castOther.getLibrary()!=null && this.getLibrary().equals(castOther.getLibrary()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         
         result = 37 * result + ( getPublication() == null ? 0 : this.getPublication().hashCode() );
         result = 37 * result + ( getCvterm() == null ? 0 : this.getCvterm().hashCode() );
         result = 37 * result + ( getLibrary() == null ? 0 : this.getLibrary().hashCode() );
         return result;
   }   

public AbstractLibraryCVTerm generateClone() {
	AbstractLibraryCVTerm cloned = new LibraryCVTerm(); 
    	   cloned.publication = this.publication;
    	   cloned.cvterm = this.cvterm;
    	   cloned.library = this.library;
	return cloned;
}


}


