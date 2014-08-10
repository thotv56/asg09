/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asg09;

/**
 *
 * @author GRU-PC
 */
public class StringItem implements Item {
    String value;
    public StringItem(){};
    public StringItem(String value){
        this.value = value;
    }
    @Override
    public Item clone() {
        return new StringItem(value);
    }

    @Override
    public boolean equals(Item item) {
        return this.toString().equals(item.toString());
    }
    @Override
    public String toString(){
        return this.value;
    }
    
}
