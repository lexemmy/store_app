/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author oteniyan anuoluwa
 */
public class ObjectItem extends Item {
    private ObjectType objectType;

    public ObjectItem(String description, double estimatedValue, Condition condition, ObjectType objectType) {
        super(description, estimatedValue, condition, recordType);
        this.objectType = objectType;
        recordType = RecordType.OTHER;
    }
    
        public String itemMainDetails(){
    
    
}
    public String recordKind(){
      //return recordType;
}

    @Override
    public String toString() {
        return "ObjectItem{" + "objectType=" + objectType + ", textileSize=" + description +
                ", estimatedValue=" + estimatedValue +
                ", condition=" + condition +
                ", recordType=" + recordType +'}';
    }
    
    

     

  
    
}
