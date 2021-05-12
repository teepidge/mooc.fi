/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Taylor Pigeon
 */
public class Item {
    private String identifier;
    private String name;

    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }
    
    
    
    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }
    
    public Boolean equals(Item item) {
        
        if (this == item) {
            return true;
        }
        
        
        if(!(this instanceof Item)) {
            return false;
        }
        
        // create new object and cast Item class 
        Item objectCompared = (Item) item;
        
        //if identifier is same, then they are considered equal
        return (item.identifier.equals(this.identifier));
    }
}
