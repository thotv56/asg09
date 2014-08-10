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
public class MyList<T> implements Item{
    Node start;
    Node end;
    public MyList(){};
    
    public void append(Item data){
        Node node = new Node(data.clone(), null);
        if(start==null){
            start = node;
            end = node;
            
        }
        else{
            end.next = node;
            end = node;
            end.next = null;
            
        }
    }
    
    public void appendList(MyList al){
        Node node = al.start;
        while(node!=null){
            this.append(node.data.clone());
            node = node.next;
        }
    }
    @Override
    public Item clone() {
        MyList list = new MyList();
		Node node = this.start;
		while (node != null) {
			list.append(node.data.clone());
			node = node.next;
		}
		return list;
    }
    
    @Override
    public String toString(){
        String str = "";
		Node node = this.start;
		while (node != end) {
			str = str + node.data.toString() + " ";	
			node = node.next;
		}
		str = str + node.data.toString() + "";
		return str;
    }
    @Override
    public boolean equals(Item item) {
        return this.toString().equals(item.toString());
    }
    
    public int lenght(){
        int i=0;
        Node node = this.start;
        while(node!=null){
            i++;
            node = node.next;
        }
        return i;
    }
    
    public Item find(Item item){
        Node node = this.start;
        while((node!=null)&&(item.toString().equals(node.data.toString()))){
            node = node.next;
        }
        return node.data;
    }
    public void invert() {
	    Node head = start;
            start = end = null;
            if(head!=null){
                append(head.data);
                head = head.next;
            }
		
		
	}
    
}
