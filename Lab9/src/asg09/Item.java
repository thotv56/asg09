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
public interface Item {
    public abstract Item clone();

    public String toString();
    
    public boolean equals(Item item);
}
