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
public class Pair<T> {
    private T first;
    private T second;
    
    public Pair(){};
    public Pair(T first, T second){
        this.first = first;
        this.second = second;
    }
    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return  this.first +""+ this.second;
    }
}
class PairTest{
    public static void main(String[]args){
    Pair<String> p = new Pair<String>("Tran Van"," Tho");
        System.out.println(p.toString());
    Pair<Integer> p2 = new Pair<Integer>(110203,18);
        System.out.println(p2.toString());
    }
}
