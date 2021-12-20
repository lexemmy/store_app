/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;



/**
 *
 * @author oteniyan anuoluwa
 */


public class TestStorage {
    
    
    
    
   public static void main(String[] args) {
        // TODO code application logic here
        
        TextileItem coat = new TextileItem(TextileType.COAT, "red", "burberry", TextileSize.BIG, "A new design", 500.0, Condition.NEW);
        TextileItem blouse = new TextileItem(TextileType.BLOUSE, "black", "LV", TextileSize.SMALL, "A vintage blouse", 200.0, Condition.USED);

        ObjectItem spoon = new ObjectItem("A household item", 50.0, Condition.USED, ObjectType.HOUSEHOLD);
        ObjectItem tool = new ObjectItem("A tool", 200.0, Condition.FORSCRAP, ObjectType.TOOLS);

        RecordsStorage recordsStorage = new RecordsStorage();
        RecordsStorage recordsStorage2 = new RecordsStorage();
        
       recordsStorage.add(coat);
       recordsStorage.add(blouse);
       recordsStorage.add(spoon);
       recordsStorage.add(tool);
       
//       System.out.println(recordsStorage.retrieveRecordsToDisplay(RecordType.TEXTILE));
//       System.out.println(recordsStorage.retrieveRecordsToDisplay(RecordType.OTHER));
       System.out.println(recordsStorage.retrieveRecordsToDisplay(RecordType.ALL));

    
    }
    
    
   
    
    
}
