/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package backend;

/**
 *
 * @author oteniyan anuoluwa
 */
abstract class Item {
    
    public String description;
    public double estimatedValue;
    public Condition condition;
    public static RecordType recordType;

    public Item(String description, double estimatedValue, Condition condition, RecordType recordType){
        this.description = description;
        this.estimatedValue = estimatedValue;
        this.condition = condition;
        //this.recordType = recordType;
    }

    public String getItemDescription() {
        return description;
    }
    
    public double getItemPrice() {
        return estimatedValue;
    }

    @Override
    public String toString() {
        return "Item{" + "description=" + description + ", estimatedValue=" + estimatedValue + ", condition=" + condition + ", recordType=" + recordType + '}';
    }

    
    
    
    
    abstract  String itemMainDetails();
    
    abstract  String recordKind();

    


}
