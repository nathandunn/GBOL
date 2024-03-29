package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 


/**
 * ExpressionImage generated by hbm2java
 */
public abstract class AbstractExpressionImage extends AbstractSimpleObject implements java.io.Serializable {


     private Integer expressionImageId;
     private Expression expression;
     private EImage eImage;

    public AbstractExpressionImage() {
    }

    public AbstractExpressionImage(Expression expression, EImage eImage) {
       this.expression = expression;
       this.eImage = eImage;
    }
   
    public Integer getExpressionImageId() {
        return this.expressionImageId;
    }
    
    public void setExpressionImageId(Integer expressionImageId) {
        this.expressionImageId = expressionImageId;
    }
    public Expression getExpression() {
        return this.expression;
    }
    
    public void setExpression(Expression expression) {
        this.expression = expression;
    }
    public EImage geteImage() {
        return this.eImage;
    }
    
    public void seteImage(EImage eImage) {
        this.eImage = eImage;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AbstractExpressionImage) ) return false;
		 AbstractExpressionImage castOther = ( AbstractExpressionImage ) other; 
         
		 return ( (this.getExpression()==castOther.getExpression()) || ( this.getExpression()!=null && castOther.getExpression()!=null && this.getExpression().equals(castOther.getExpression()) ) )
 && ( (this.geteImage()==castOther.geteImage()) || ( this.geteImage()!=null && castOther.geteImage()!=null && this.geteImage().equals(castOther.geteImage()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         
         result = 37 * result + ( getExpression() == null ? 0 : this.getExpression().hashCode() );
         result = 37 * result + ( geteImage() == null ? 0 : this.geteImage().hashCode() );
         return result;
   }   

public AbstractExpressionImage generateClone() {
	AbstractExpressionImage cloned = new AbstractExpressionImage; 
    	   cloned.expression = this.expression;
    	   cloned.eImage = this.eImage;
	return cloned;
}


}


