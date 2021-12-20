/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package backend;

/**
 *
 * @author oteniyan anuoluwa
 */
interface IRecordsStorage {
    
    public  boolean add(Item record);
    public String retrieveRecordsToDisplay(RecordType recordType);
}
