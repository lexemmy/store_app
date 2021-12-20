/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package backend;

import java.util.*;

/**
 *
 * @author oteniyan anuoluwa
 */
public class RecordsStorage implements  IRecordsStorage{
    private Map<String, Item> recordsStorage;
    private List sortedRecords;
    private Item aRecord;
    private double totalValue;

    public RecordsStorage() {
        recordsStorage = new HashMap<String, Item>();
    }
    
    public Item find(String description){
        Item item =  recordsStorage.get(description);
        return item;
    }
    
    public boolean add(Item record){
        if (record != null) {
            if (recordsStorage.containsKey(record.getItemDescription())) {
                return false;
            }
            else {
                recordsStorage.put(record.getItemDescription(), record);
                return true;
            }
        } return false;
    }
    
    public boolean delete(String description){
        Item item =  recordsStorage.get(description);
        if (item == null) {
            return false;
        } else {
            recordsStorage.remove(description);
            return true;
        }
    }
    
    public String retrieveRecordsToDisplay(RecordType recordType){
        List<Item> recordList = getSortedItems(recordType);
        ListIterator<Item> itr = recordList.listIterator();
        String outputString = "";
        while (itr.hasNext()) {
            outputString += itr.next();     
        }
        
        outputString += totalValue;
        return  outputString;
    }
    
    public List getSortedItems(RecordType recordType){
        totalValue = 0;
        List<Item> sortedItems = new ArrayList();
        Iterator<Map.Entry<String, Item>> itr = recordsStorage.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, Item> entry = itr.next();
            Item aRecord = entry.getValue();
            if (aRecord.recordType == recordType) {
                totalValue = totalValue + aRecord.getItemPrice();
                sortedItems.add(aRecord);
            } else {
                totalValue = totalValue + aRecord.getItemPrice();
                sortedItems.add(aRecord);
            }
    }
        return sortedItems;
}
