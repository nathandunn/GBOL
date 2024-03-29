package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 

import java.util.HashSet;
import java.util.Set;

/**
 * Protocol generated by hbm2java
 */
public abstract class AbstractProtocol extends AbstractSimpleObject implements java.io.Serializable {


     private Integer protocolId;
     private Publication publication;
     private DBXref dbxref;
     private CVTerm type;
     private String name;
     private String uri;
     private String protocolDescription;
     private String hardwareDescription;
     private String softwareDescription;
     private Set<ProtocolParameter> protocolParameters = new HashSet<ProtocolParameter>(0);

    public AbstractProtocol() {
    }

	
    public AbstractProtocol(CVTerm type, String name) {
        this.type = type;
        this.name = name;
    }
    public AbstractProtocol(Publication publication, DBXref dbxref, CVTerm type, String name, String uri, String protocolDescription, String hardwareDescription, String softwareDescription, Set<ProtocolParameter> protocolParameters) {
       this.publication = publication;
       this.dbxref = dbxref;
       this.type = type;
       this.name = name;
       this.uri = uri;
       this.protocolDescription = protocolDescription;
       this.hardwareDescription = hardwareDescription;
       this.softwareDescription = softwareDescription;
       this.protocolParameters = protocolParameters;
    }
   
    public Integer getProtocolId() {
        return this.protocolId;
    }
    
    public void setProtocolId(Integer protocolId) {
        this.protocolId = protocolId;
    }
    public Publication getPublication() {
        return this.publication;
    }
    
    public void setPublication(Publication publication) {
        this.publication = publication;
    }
    public DBXref getDbxref() {
        return this.dbxref;
    }
    
    public void setDbxref(DBXref dbxref) {
        this.dbxref = dbxref;
    }
    public CVTerm getType() {
        return this.type;
    }
    
    public void setType(CVTerm type) {
        this.type = type;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getUri() {
        return this.uri;
    }
    
    public void setUri(String uri) {
        this.uri = uri;
    }
    public String getProtocolDescription() {
        return this.protocolDescription;
    }
    
    public void setProtocolDescription(String protocolDescription) {
        this.protocolDescription = protocolDescription;
    }
    public String getHardwareDescription() {
        return this.hardwareDescription;
    }
    
    public void setHardwareDescription(String hardwareDescription) {
        this.hardwareDescription = hardwareDescription;
    }
    public String getSoftwareDescription() {
        return this.softwareDescription;
    }
    
    public void setSoftwareDescription(String softwareDescription) {
        this.softwareDescription = softwareDescription;
    }
    public Set<ProtocolParameter> getProtocolParameters() {
        return this.protocolParameters;
    }
    
    public void setProtocolParameters(Set<ProtocolParameter> protocolParameters) {
        this.protocolParameters = protocolParameters;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AbstractProtocol) ) return false;
		 AbstractProtocol castOther = ( AbstractProtocol ) other; 
         
		 return ( (this.getName()==castOther.getName()) || ( this.getName()!=null && castOther.getName()!=null && this.getName().equals(castOther.getName()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         
         
         
         
         result = 37 * result + ( getName() == null ? 0 : this.getName().hashCode() );
         
         
         
         
         
         return result;
   }   

public AbstractProtocol generateClone() {
	AbstractProtocol cloned = new AbstractProtocol; 
    	   cloned.publication = this.publication;
    	   cloned.dbxref = this.dbxref;
    	   cloned.type = this.type;
    	   cloned.name = this.name;
    	   cloned.uri = this.uri;
    	   cloned.protocolDescription = this.protocolDescription;
    	   cloned.hardwareDescription = this.hardwareDescription;
    	   cloned.softwareDescription = this.softwareDescription;
    	   cloned.protocolParameters = this.protocolParameters;
	return cloned;
}


}


