/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package backend;

/**
 *
 * @author oteniyan anuoluwa
 */
public class TextileItem  extends Item{
    private  TextileType textileType;
    private String colorDescription;
    private String brand;
    private TextileSize textileSize;
    

    public TextileItem(TextileType textileType, String colorDescription, String brand, TextileSize textileSize, String description, double estimatedValue, Condition condition) {
        super(description, estimatedValue, condition, recordType);
        this.textileType = textileType;
        this.colorDescription = colorDescription;
        this.brand = brand;
        this.textileSize = textileSize;
        recordType = RecordType.TEXTILE;
    }
    
    public String itemMainDetails(){
    
    
}
    public String recordKind(){
}

    @Override
    public String toString() {
        return "TextileItem{" + "textileType=" + textileType + ","
                + " colorDescriptString=" + colorDescription +
                ", brand=" + brand + 
                ", textileSize=" + textileSize +
                ", textileSize=" + description +
                ", estimatedValue=" + estimatedValue +
                ", condition=" + condition +
                ", recordType=" + recordType +
                '}';
    }



    
    



