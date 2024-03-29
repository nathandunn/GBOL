package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Analysis generated by hbm2java
 */
public abstract class AbstractAnalysis extends AbstractSimpleObject implements java.io.Serializable {


     private Integer analysisId;
     private String name;
     private String description;
     private String program;
     private String programVersion;
     private String algorithm;
     private String sourceName;
     private String sourceVersion;
     private String sourceURI;
     private Date timeExecuted;
     private Set<AnalysisProperty> analysisProperties = new HashSet<AnalysisProperty>(0);
     private Set<AnalysisFeature> analysisFeatures = new HashSet<AnalysisFeature>(0);

    public AbstractAnalysis() {
    }

	
    public AbstractAnalysis(String program, String programVersion, Date timeExecuted) {
        this.program = program;
        this.programVersion = programVersion;
        this.timeExecuted = timeExecuted;
    }
    public AbstractAnalysis(String name, String description, String program, String programVersion, String algorithm, String sourceName, String sourceVersion, String sourceURI, Date timeExecuted, Set<AnalysisProperty> analysisProperties, Set<AnalysisFeature> analysisFeatures) {
       this.name = name;
       this.description = description;
       this.program = program;
       this.programVersion = programVersion;
       this.algorithm = algorithm;
       this.sourceName = sourceName;
       this.sourceVersion = sourceVersion;
       this.sourceURI = sourceURI;
       this.timeExecuted = timeExecuted;
       this.analysisProperties = analysisProperties;
       this.analysisFeatures = analysisFeatures;
    }
   
    public Integer getAnalysisId() {
        return this.analysisId;
    }
    
    public void setAnalysisId(Integer analysisId) {
        this.analysisId = analysisId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public String getProgram() {
        return this.program;
    }
    
    public void setProgram(String program) {
        this.program = program;
    }
    public String getProgramVersion() {
        return this.programVersion;
    }
    
    public void setProgramVersion(String programVersion) {
        this.programVersion = programVersion;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }
    
    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }
    public String getSourceName() {
        return this.sourceName;
    }
    
    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }
    public String getSourceVersion() {
        return this.sourceVersion;
    }
    
    public void setSourceVersion(String sourceVersion) {
        this.sourceVersion = sourceVersion;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }
    
    public void setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
    }
    public Date getTimeExecuted() {
        return this.timeExecuted;
    }
    
    public void setTimeExecuted(Date timeExecuted) {
        this.timeExecuted = timeExecuted;
    }
    public Set<AnalysisProperty> getAnalysisProperties() {
        return this.analysisProperties;
    }
    
    public void setAnalysisProperties(Set<AnalysisProperty> analysisProperties) {
        this.analysisProperties = analysisProperties;
    }
    public Set<AnalysisFeature> getAnalysisFeatures() {
        return this.analysisFeatures;
    }
    
    public void setAnalysisFeatures(Set<AnalysisFeature> analysisFeatures) {
        this.analysisFeatures = analysisFeatures;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AbstractAnalysis) ) return false;
		 AbstractAnalysis castOther = ( AbstractAnalysis ) other; 
         
		 return ( (this.getProgram()==castOther.getProgram()) || ( this.getProgram()!=null && castOther.getProgram()!=null && this.getProgram().equals(castOther.getProgram()) ) )
 && ( (this.getProgramVersion()==castOther.getProgramVersion()) || ( this.getProgramVersion()!=null && castOther.getProgramVersion()!=null && this.getProgramVersion().equals(castOther.getProgramVersion()) ) )
 && ( (this.getSourceName()==castOther.getSourceName()) || ( this.getSourceName()!=null && castOther.getSourceName()!=null && this.getSourceName().equals(castOther.getSourceName()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         
         
         
         result = 37 * result + ( getProgram() == null ? 0 : this.getProgram().hashCode() );
         result = 37 * result + ( getProgramVersion() == null ? 0 : this.getProgramVersion().hashCode() );
         
         result = 37 * result + ( getSourceName() == null ? 0 : this.getSourceName().hashCode() );
         
         
         
         
         
         return result;
   }   

public AbstractAnalysis generateClone() {
	AbstractAnalysis cloned = new AbstractAnalysis; 
    	   cloned.name = this.name;
    	   cloned.description = this.description;
    	   cloned.program = this.program;
    	   cloned.programVersion = this.programVersion;
    	   cloned.algorithm = this.algorithm;
    	   cloned.sourceName = this.sourceName;
    	   cloned.sourceVersion = this.sourceVersion;
    	   cloned.sourceURI = this.sourceURI;
    	   cloned.timeExecuted = this.timeExecuted;
    	   cloned.analysisProperties = this.analysisProperties;
    	   cloned.analysisFeatures = this.analysisFeatures;
	return cloned;
}


}


