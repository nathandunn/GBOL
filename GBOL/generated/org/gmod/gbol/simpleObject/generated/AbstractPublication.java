package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 

import java.util.HashSet;
import java.util.Set;

/**
 * Publication generated by hbm2java
 */
public abstract class AbstractPublication extends AbstractSimpleObject implements java.io.Serializable {


     private Integer publicationId;
     private CVTerm type;
     private String title;
     private String volumeTitle;
     private String volume;
     private String seriesName;
     private String issue;
     private String publicationYear;
     private String pages;
     private String miniReference;
     private String uniqueName;
     private Boolean isObsolete;
     private String publisher;
     private String publicationPlace;
     private Set<PublicationDBXref> publicationDBXrefs = new HashSet<PublicationDBXref>(0);
     private Set<PublicationRelationship> parentPublicationRelationships = new HashSet<PublicationRelationship>(0);
     private Set<PublicationRelationship> childPublicationRelationships = new HashSet<PublicationRelationship>(0);
     private Set<PublicationAuthor> publicationAuthors = new HashSet<PublicationAuthor>(0);

    public AbstractPublication() {
    }

	
    public AbstractPublication(CVTerm type, String uniqueName) {
        this.type = type;
        this.uniqueName = uniqueName;
    }
    public AbstractPublication(CVTerm type, String title, String volumeTitle, String volume, String seriesName, String issue, String publicationYear, String pages, String miniReference, String uniqueName, Boolean isObsolete, String publisher, String publicationPlace, Set<PublicationDBXref> publicationDBXrefs, Set<PublicationRelationship> parentPublicationRelationships, Set<PublicationRelationship> childPublicationRelationships, Set<PublicationAuthor> publicationAuthors) {
       this.type = type;
       this.title = title;
       this.volumeTitle = volumeTitle;
       this.volume = volume;
       this.seriesName = seriesName;
       this.issue = issue;
       this.publicationYear = publicationYear;
       this.pages = pages;
       this.miniReference = miniReference;
       this.uniqueName = uniqueName;
       this.isObsolete = isObsolete;
       this.publisher = publisher;
       this.publicationPlace = publicationPlace;
       this.publicationDBXrefs = publicationDBXrefs;
       this.parentPublicationRelationships = parentPublicationRelationships;
       this.childPublicationRelationships = childPublicationRelationships;
       this.publicationAuthors = publicationAuthors;
    }
   
    public Integer getPublicationId() {
        return this.publicationId;
    }
    
    public void setPublicationId(Integer publicationId) {
        this.publicationId = publicationId;
    }
    public CVTerm getType() {
        return this.type;
    }
    
    public void setType(CVTerm type) {
        this.type = type;
    }
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public String getVolumeTitle() {
        return this.volumeTitle;
    }
    
    public void setVolumeTitle(String volumeTitle) {
        this.volumeTitle = volumeTitle;
    }
    public String getVolume() {
        return this.volume;
    }
    
    public void setVolume(String volume) {
        this.volume = volume;
    }
    public String getSeriesName() {
        return this.seriesName;
    }
    
    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }
    public String getIssue() {
        return this.issue;
    }
    
    public void setIssue(String issue) {
        this.issue = issue;
    }
    public String getPublicationYear() {
        return this.publicationYear;
    }
    
    public void setPublicationYear(String publicationYear) {
        this.publicationYear = publicationYear;
    }
    public String getPages() {
        return this.pages;
    }
    
    public void setPages(String pages) {
        this.pages = pages;
    }
    public String getMiniReference() {
        return this.miniReference;
    }
    
    public void setMiniReference(String miniReference) {
        this.miniReference = miniReference;
    }
    public String getUniqueName() {
        return this.uniqueName;
    }
    
    public void setUniqueName(String uniqueName) {
        this.uniqueName = uniqueName;
    }
    public Boolean getIsObsolete() {
        return this.isObsolete;
    }
    
    public void setIsObsolete(Boolean isObsolete) {
        this.isObsolete = isObsolete;
    }
    public String getPublisher() {
        return this.publisher;
    }
    
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getPublicationPlace() {
        return this.publicationPlace;
    }
    
    public void setPublicationPlace(String publicationPlace) {
        this.publicationPlace = publicationPlace;
    }
    public Set<PublicationDBXref> getPublicationDBXrefs() {
        return this.publicationDBXrefs;
    }
    
    public void setPublicationDBXrefs(Set<PublicationDBXref> publicationDBXrefs) {
        this.publicationDBXrefs = publicationDBXrefs;
    }
    public Set<PublicationRelationship> getParentPublicationRelationships() {
        return this.parentPublicationRelationships;
    }
    
    public void setParentPublicationRelationships(Set<PublicationRelationship> parentPublicationRelationships) {
        this.parentPublicationRelationships = parentPublicationRelationships;
    }
    public Set<PublicationRelationship> getChildPublicationRelationships() {
        return this.childPublicationRelationships;
    }
    
    public void setChildPublicationRelationships(Set<PublicationRelationship> childPublicationRelationships) {
        this.childPublicationRelationships = childPublicationRelationships;
    }
    public Set<PublicationAuthor> getPublicationAuthors() {
        return this.publicationAuthors;
    }
    
    public void setPublicationAuthors(Set<PublicationAuthor> publicationAuthors) {
        this.publicationAuthors = publicationAuthors;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AbstractPublication) ) return false;
		 AbstractPublication castOther = ( AbstractPublication ) other; 
         
		 return ( (this.getUniqueName()==castOther.getUniqueName()) || ( this.getUniqueName()!=null && castOther.getUniqueName()!=null && this.getUniqueName().equals(castOther.getUniqueName()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         
         
         
         
         
         
         
         
         
         
         result = 37 * result + ( getUniqueName() == null ? 0 : this.getUniqueName().hashCode() );
         
         
         
         
         
         
         
         return result;
   }   

public AbstractPublication generateClone() {
	AbstractPublication cloned = new AbstractPublication; 
    	   cloned.type = this.type;
    	   cloned.title = this.title;
    	   cloned.volumeTitle = this.volumeTitle;
    	   cloned.volume = this.volume;
    	   cloned.seriesName = this.seriesName;
    	   cloned.issue = this.issue;
    	   cloned.publicationYear = this.publicationYear;
    	   cloned.pages = this.pages;
    	   cloned.miniReference = this.miniReference;
    	   cloned.uniqueName = this.uniqueName;
    	   cloned.isObsolete = this.isObsolete;
    	   cloned.publisher = this.publisher;
    	   cloned.publicationPlace = this.publicationPlace;
    	   cloned.publicationDBXrefs = this.publicationDBXrefs;
    	   cloned.parentPublicationRelationships = this.parentPublicationRelationships;
    	   cloned.childPublicationRelationships = this.childPublicationRelationships;
    	   cloned.publicationAuthors = this.publicationAuthors;
	return cloned;
}


}


