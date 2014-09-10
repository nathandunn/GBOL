package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 

import java.util.HashSet;
import java.util.Set;

/**
 * StockCollection generated by hbm2java
 */
public abstract class AbstractStockCollection extends AbstractSimpleObject implements java.io.Serializable {


     private Integer stockCollectionId;
     private Contact contact;
     private CVTerm type;
     private String name;
     private String uniqueName;
     private Set<StockCollectionStock> stockCollectionStocks = new HashSet<StockCollectionStock>(0);
     private Set<StockCollectionProperty> stockCollectionProperties = new HashSet<StockCollectionProperty>(0);

    public AbstractStockCollection() {
    }

	
    public AbstractStockCollection(CVTerm type, String uniqueName) {
        this.type = type;
        this.uniqueName = uniqueName;
    }
    public AbstractStockCollection(Contact contact, CVTerm type, String name, String uniqueName, Set<StockCollectionStock> stockCollectionStocks, Set<StockCollectionProperty> stockCollectionProperties) {
       this.contact = contact;
       this.type = type;
       this.name = name;
       this.uniqueName = uniqueName;
       this.stockCollectionStocks = stockCollectionStocks;
       this.stockCollectionProperties = stockCollectionProperties;
    }
   
    public Integer getStockCollectionId() {
        return this.stockCollectionId;
    }
    
    public void setStockCollectionId(Integer stockCollectionId) {
        this.stockCollectionId = stockCollectionId;
    }
    public Contact getContact() {
        return this.contact;
    }
    
    public void setContact(Contact contact) {
        this.contact = contact;
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
    public String getUniqueName() {
        return this.uniqueName;
    }
    
    public void setUniqueName(String uniqueName) {
        this.uniqueName = uniqueName;
    }
    public Set<StockCollectionStock> getStockCollectionStocks() {
        return this.stockCollectionStocks;
    }
    
    public void setStockCollectionStocks(Set<StockCollectionStock> stockCollectionStocks) {
        this.stockCollectionStocks = stockCollectionStocks;
    }
    public Set<StockCollectionProperty> getStockCollectionProperties() {
        return this.stockCollectionProperties;
    }
    
    public void setStockCollectionProperties(Set<StockCollectionProperty> stockCollectionProperties) {
        this.stockCollectionProperties = stockCollectionProperties;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AbstractStockCollection) ) return false;
		 AbstractStockCollection castOther = ( AbstractStockCollection ) other; 
         
		 return ( (this.getType()==castOther.getType()) || ( this.getType()!=null && castOther.getType()!=null && this.getType().equals(castOther.getType()) ) )
 && ( (this.getUniqueName()==castOther.getUniqueName()) || ( this.getUniqueName()!=null && castOther.getUniqueName()!=null && this.getUniqueName().equals(castOther.getUniqueName()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         
         
         result = 37 * result + ( getType() == null ? 0 : this.getType().hashCode() );
         
         result = 37 * result + ( getUniqueName() == null ? 0 : this.getUniqueName().hashCode() );
         
         
         return result;
   }   

public AbstractStockCollection generateClone() {
	AbstractStockCollection cloned = new AbstractStockCollection; 
    	   cloned.contact = this.contact;
    	   cloned.type = this.type;
    	   cloned.name = this.name;
    	   cloned.uniqueName = this.uniqueName;
    	   cloned.stockCollectionStocks = this.stockCollectionStocks;
    	   cloned.stockCollectionProperties = this.stockCollectionProperties;
	return cloned;
}


}


