package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 

import java.util.HashSet;
import java.util.Set;

/**
 * StudyDesign generated by hbm2java
 */
public abstract class AbstractStudyDesign extends AbstractSimpleObject implements java.io.Serializable {


     private Integer studyDesignId;
     private Study study;
     private String description;
     private Set<StudyDesignProperty> studyDesignProperties = new HashSet<StudyDesignProperty>(0);
     private Set<StudyFactor> studyFactors = new HashSet<StudyFactor>(0);

    public AbstractStudyDesign() {
    }

	
    public AbstractStudyDesign(Study study) {
        this.study = study;
    }
    public AbstractStudyDesign(Study study, String description, Set<StudyDesignProperty> studyDesignProperties, Set<StudyFactor> studyFactors) {
       this.study = study;
       this.description = description;
       this.studyDesignProperties = studyDesignProperties;
       this.studyFactors = studyFactors;
    }
   
    public Integer getStudyDesignId() {
        return this.studyDesignId;
    }
    
    public void setStudyDesignId(Integer studyDesignId) {
        this.studyDesignId = studyDesignId;
    }
    public Study getStudy() {
        return this.study;
    }
    
    public void setStudy(Study study) {
        this.study = study;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public Set<StudyDesignProperty> getStudyDesignProperties() {
        return this.studyDesignProperties;
    }
    
    public void setStudyDesignProperties(Set<StudyDesignProperty> studyDesignProperties) {
        this.studyDesignProperties = studyDesignProperties;
    }
    public Set<StudyFactor> getStudyFactors() {
        return this.studyFactors;
    }
    
    public void setStudyFactors(Set<StudyFactor> studyFactors) {
        this.studyFactors = studyFactors;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AbstractStudyDesign) ) return false;
		 AbstractStudyDesign castOther = ( AbstractStudyDesign ) other; 
         
		 return ( (this.getStudy()==castOther.getStudy()) || ( this.getStudy()!=null && castOther.getStudy()!=null && this.getStudy().equals(castOther.getStudy()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         
         result = 37 * result + ( getStudy() == null ? 0 : this.getStudy().hashCode() );
         
         
         
         return result;
   }   

public AbstractStudyDesign generateClone() {
	AbstractStudyDesign cloned = new StudyDesign(); 
    	   cloned.study = this.study;
    	   cloned.description = this.description;
    	   cloned.studyDesignProperties = this.studyDesignProperties;
    	   cloned.studyFactors = this.studyFactors;
	return cloned;
}


}


