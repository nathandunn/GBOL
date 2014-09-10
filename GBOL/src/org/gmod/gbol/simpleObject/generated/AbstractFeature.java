package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Feature generated by hbm2java
 */
public abstract class AbstractFeature extends AbstractSimpleObject implements java.io.Serializable {


     private Integer featureId;
     private CVTerm type;
     private DBXref dbxref;
     private Organism organism;
     private String name;
     private String uniqueName;
     private String residues;
     private Integer sequenceLength;
     private String md5checksum;
     private boolean isAnalysis;
     private boolean isObsolete;
     private Date timeAccessioned;
     private Date timeLastModified;
     private Set<FeatureLocation> featureLocations = new HashSet<FeatureLocation>(0);
     private Set<FeatureGenotype> featureGenotypes = new HashSet<FeatureGenotype>(0);
     private Set<FeatureRelationship> parentFeatureRelationships = new HashSet<FeatureRelationship>(0);
     private Set<FeatureRelationship> childFeatureRelationships = new HashSet<FeatureRelationship>(0);
     private Set<FeatureCVTerm> featureCVTerms = new HashSet<FeatureCVTerm>(0);
     private Set<FeatureSynonym> featureSynonyms = new HashSet<FeatureSynonym>(0);
     private Set<FeatureDBXref> featureDBXrefs = new HashSet<FeatureDBXref>(0);
     private Set<FeaturePublication> featurePublications = new HashSet<FeaturePublication>(0);
     private Set<FeaturePhenotype> featurePhenotypes = new HashSet<FeaturePhenotype>(0);
     private Set<FeatureProperty> featureProperties = new HashSet<FeatureProperty>(0);

    public AbstractFeature() {
    }

	
    public AbstractFeature(CVTerm type, Organism organism, String uniqueName, boolean isAnalysis, boolean isObsolete, Date timeAccessioned, Date timeLastModified) {
        this.type = type;
        this.organism = organism;
        this.uniqueName = uniqueName;
        this.isAnalysis = isAnalysis;
        this.isObsolete = isObsolete;
        this.timeAccessioned = timeAccessioned;
        this.timeLastModified = timeLastModified;
    }
    public AbstractFeature(CVTerm type, DBXref dbxref, Organism organism, String name, String uniqueName, String residues, Integer sequenceLength, String md5checksum, boolean isAnalysis, boolean isObsolete, Date timeAccessioned, Date timeLastModified, Set<FeatureLocation> featureLocations, Set<FeatureGenotype> featureGenotypes, Set<FeatureRelationship> parentFeatureRelationships, Set<FeatureRelationship> childFeatureRelationships, Set<FeatureCVTerm> featureCVTerms, Set<FeatureSynonym> featureSynonyms, Set<FeatureDBXref> featureDBXrefs, Set<FeaturePublication> featurePublications, Set<FeaturePhenotype> featurePhenotypes, Set<FeatureProperty> featureProperties) {
       this.type = type;
       this.dbxref = dbxref;
       this.organism = organism;
       this.name = name;
       this.uniqueName = uniqueName;
       this.residues = residues;
       this.sequenceLength = sequenceLength;
       this.md5checksum = md5checksum;
       this.isAnalysis = isAnalysis;
       this.isObsolete = isObsolete;
       this.timeAccessioned = timeAccessioned;
       this.timeLastModified = timeLastModified;
       this.featureLocations = featureLocations;
       this.featureGenotypes = featureGenotypes;
       this.parentFeatureRelationships = parentFeatureRelationships;
       this.childFeatureRelationships = childFeatureRelationships;
       this.featureCVTerms = featureCVTerms;
       this.featureSynonyms = featureSynonyms;
       this.featureDBXrefs = featureDBXrefs;
       this.featurePublications = featurePublications;
       this.featurePhenotypes = featurePhenotypes;
       this.featureProperties = featureProperties;
    }
   
    public Integer getFeatureId() {
        return this.featureId;
    }
    
    public void setFeatureId(Integer featureId) {
        this.featureId = featureId;
    }
    public CVTerm getType() {
        return this.type;
    }
    
    public void setType(CVTerm type) {
        this.type = type;
    }
    public DBXref getDbxref() {
        return this.dbxref;
    }
    
    public void setDbxref(DBXref dbxref) {
        this.dbxref = dbxref;
    }
    public Organism getOrganism() {
        return this.organism;
    }
    
    public void setOrganism(Organism organism) {
        this.organism = organism;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getUniqueName() {
        return this.uniqueName;
    }
    
    public void setUniqueName(String uniqueName) {
        this.uniqueName = uniqueName;
    }
    public String getResidues() {
        return this.residues;
    }
    
    public void setResidues(String residues) {
        this.residues = residues;
    }
    public Integer getSequenceLength() {
        return this.sequenceLength;
    }
    
    public void setSequenceLength(Integer sequenceLength) {
        this.sequenceLength = sequenceLength;
    }
    public String getMd5checksum() {
        return this.md5checksum;
    }
    
    public void setMd5checksum(String md5checksum) {
        this.md5checksum = md5checksum;
    }
    public boolean isIsAnalysis() {
        return this.isAnalysis;
    }
    
    public void setIsAnalysis(boolean isAnalysis) {
        this.isAnalysis = isAnalysis;
    }
    public boolean isIsObsolete() {
        return this.isObsolete;
    }
    
    public void setIsObsolete(boolean isObsolete) {
        this.isObsolete = isObsolete;
    }
    public Date getTimeAccessioned() {
        return this.timeAccessioned;
    }
    
    public void setTimeAccessioned(Date timeAccessioned) {
        this.timeAccessioned = timeAccessioned;
    }
    public Date getTimeLastModified() {
        return this.timeLastModified;
    }
    
    public void setTimeLastModified(Date timeLastModified) {
        this.timeLastModified = timeLastModified;
    }
    public Set<FeatureLocation> getFeatureLocations() {
        return this.featureLocations;
    }
    
    public void setFeatureLocations(Set<FeatureLocation> featureLocations) {
        this.featureLocations = featureLocations;
    }
    public Set<FeatureGenotype> getFeatureGenotypes() {
        return this.featureGenotypes;
    }
    
    public void setFeatureGenotypes(Set<FeatureGenotype> featureGenotypes) {
        this.featureGenotypes = featureGenotypes;
    }
    public Set<FeatureRelationship> getParentFeatureRelationships() {
        return this.parentFeatureRelationships;
    }
    
    public void setParentFeatureRelationships(Set<FeatureRelationship> parentFeatureRelationships) {
        this.parentFeatureRelationships = parentFeatureRelationships;
    }
    public Set<FeatureRelationship> getChildFeatureRelationships() {
        return this.childFeatureRelationships;
    }
    
    public void setChildFeatureRelationships(Set<FeatureRelationship> childFeatureRelationships) {
        this.childFeatureRelationships = childFeatureRelationships;
    }
    public Set<FeatureCVTerm> getFeatureCVTerms() {
        return this.featureCVTerms;
    }
    
    public void setFeatureCVTerms(Set<FeatureCVTerm> featureCVTerms) {
        this.featureCVTerms = featureCVTerms;
    }
    public Set<FeatureSynonym> getFeatureSynonyms() {
        return this.featureSynonyms;
    }
    
    public void setFeatureSynonyms(Set<FeatureSynonym> featureSynonyms) {
        this.featureSynonyms = featureSynonyms;
    }
    public Set<FeatureDBXref> getFeatureDBXrefs() {
        return this.featureDBXrefs;
    }
    
    public void setFeatureDBXrefs(Set<FeatureDBXref> featureDBXrefs) {
        this.featureDBXrefs = featureDBXrefs;
    }
    public Set<FeaturePublication> getFeaturePublications() {
        return this.featurePublications;
    }
    
    public void setFeaturePublications(Set<FeaturePublication> featurePublications) {
        this.featurePublications = featurePublications;
    }
    public Set<FeaturePhenotype> getFeaturePhenotypes() {
        return this.featurePhenotypes;
    }
    
    public void setFeaturePhenotypes(Set<FeaturePhenotype> featurePhenotypes) {
        this.featurePhenotypes = featurePhenotypes;
    }
    public Set<FeatureProperty> getFeatureProperties() {
        return this.featureProperties;
    }
    
    public void setFeatureProperties(Set<FeatureProperty> featureProperties) {
        this.featureProperties = featureProperties;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AbstractFeature) ) return false;
		 AbstractFeature castOther = ( AbstractFeature ) other; 
         
		 return ( (this.getType()==castOther.getType()) || ( this.getType()!=null && castOther.getType()!=null && this.getType().equals(castOther.getType()) ) )
 && ( (this.getOrganism()==castOther.getOrganism()) || ( this.getOrganism()!=null && castOther.getOrganism()!=null && this.getOrganism().equals(castOther.getOrganism()) ) )
 && ( (this.getUniqueName()==castOther.getUniqueName()) || ( this.getUniqueName()!=null && castOther.getUniqueName()!=null && this.getUniqueName().equals(castOther.getUniqueName()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         
         result = 37 * result + ( getType() == null ? 0 : this.getType().hashCode() );
         
         result = 37 * result + ( getOrganism() == null ? 0 : this.getOrganism().hashCode() );
         
         result = 37 * result + ( getUniqueName() == null ? 0 : this.getUniqueName().hashCode() );
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         return result;
   }   

public AbstractFeature generateClone() {
	AbstractFeature cloned = new Feature(); 
    	   cloned.type = this.type;
    	   cloned.dbxref = this.dbxref;
    	   cloned.organism = this.organism;
    	   cloned.name = this.name;
    	   cloned.uniqueName = this.uniqueName;
    	   cloned.residues = this.residues;
    	   cloned.sequenceLength = this.sequenceLength;
    	   cloned.md5checksum = this.md5checksum;
    	   cloned.isAnalysis = this.isAnalysis;
    	   cloned.isObsolete = this.isObsolete;
    	   cloned.timeAccessioned = this.timeAccessioned;
    	   cloned.timeLastModified = this.timeLastModified;
    	   cloned.featureLocations = this.featureLocations;
    	   cloned.featureGenotypes = this.featureGenotypes;
    	   cloned.parentFeatureRelationships = this.parentFeatureRelationships;
    	   cloned.childFeatureRelationships = this.childFeatureRelationships;
    	   cloned.featureCVTerms = this.featureCVTerms;
    	   cloned.featureSynonyms = this.featureSynonyms;
    	   cloned.featureDBXrefs = this.featureDBXrefs;
    	   cloned.featurePublications = this.featurePublications;
    	   cloned.featurePhenotypes = this.featurePhenotypes;
    	   cloned.featureProperties = this.featureProperties;
	return cloned;
}


}


