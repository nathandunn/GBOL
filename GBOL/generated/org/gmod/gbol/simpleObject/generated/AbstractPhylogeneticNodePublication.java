package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 


/**
 * PhylogeneticNodePublication generated by hbm2java
 */
public abstract class AbstractPhylogeneticNodePublication extends AbstractSimpleObject implements java.io.Serializable {


     private Integer phylogeneticNodePublicationId;
     private Publication publication;
     private PhylogeneticNode phylogeneticNode;

    public AbstractPhylogeneticNodePublication() {
    }

    public AbstractPhylogeneticNodePublication(Publication publication, PhylogeneticNode phylogeneticNode) {
       this.publication = publication;
       this.phylogeneticNode = phylogeneticNode;
    }
   
    public Integer getPhylogeneticNodePublicationId() {
        return this.phylogeneticNodePublicationId;
    }
    
    public void setPhylogeneticNodePublicationId(Integer phylogeneticNodePublicationId) {
        this.phylogeneticNodePublicationId = phylogeneticNodePublicationId;
    }
    public Publication getPublication() {
        return this.publication;
    }
    
    public void setPublication(Publication publication) {
        this.publication = publication;
    }
    public PhylogeneticNode getPhylogeneticNode() {
        return this.phylogeneticNode;
    }
    
    public void setPhylogeneticNode(PhylogeneticNode phylogeneticNode) {
        this.phylogeneticNode = phylogeneticNode;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AbstractPhylogeneticNodePublication) ) return false;
		 AbstractPhylogeneticNodePublication castOther = ( AbstractPhylogeneticNodePublication ) other; 
         
		 return ( (this.getPublication()==castOther.getPublication()) || ( this.getPublication()!=null && castOther.getPublication()!=null && this.getPublication().equals(castOther.getPublication()) ) )
 && ( (this.getPhylogeneticNode()==castOther.getPhylogeneticNode()) || ( this.getPhylogeneticNode()!=null && castOther.getPhylogeneticNode()!=null && this.getPhylogeneticNode().equals(castOther.getPhylogeneticNode()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         
         result = 37 * result + ( getPublication() == null ? 0 : this.getPublication().hashCode() );
         result = 37 * result + ( getPhylogeneticNode() == null ? 0 : this.getPhylogeneticNode().hashCode() );
         return result;
   }   

public AbstractPhylogeneticNodePublication generateClone() {
	AbstractPhylogeneticNodePublication cloned = new AbstractPhylogeneticNodePublication; 
    	   cloned.publication = this.publication;
    	   cloned.phylogeneticNode = this.phylogeneticNode;
	return cloned;
}


}


