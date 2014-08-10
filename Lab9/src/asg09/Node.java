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
public class Node {
    public Item data;
    public Node next;
    
    public Node(Item data, Node next){
        this.data = data.clone();
        this.next = next;
    }
}
