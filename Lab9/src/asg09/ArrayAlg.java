/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asg09;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.CompareGenerator;

/**
 *
 * @author GRU-PC
 */
public class ArrayAlg {
    public  <T> void printArray(T[]a){
        for(int i=0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    
    public <T> void printArray(T[]a, int start, int end) throws InvalidSubscriptException{
        if(start<0||start==end)throw new InvalidSubscriptException(String.format("Not valid", start));
        for(int i=start;i<(end);i++){
            System.out.println(a[i]);
        }
    }
    public static <T extends Comparable> Pair<T> max(T[]a){
        if(a.length==0 || a==null) return null;
        T max1 = a[0];
        T max2 = a[0];
        int i=0;
        for(; i<a.length;i++){
            if(max1.compareTo(a[i])<0)
                max1 = a[i];
            if((max2.compareTo(a[i])>0) && max2!=max1){
                max2 = a[i];
            }
        }
        return new Pair<T>(max1, max2);
    }
}

class InvalidSubscriptException extends RuntimeException {
	public InvalidSubscriptException() {
		this("Subscript invalido. ");
	}
	public InvalidSubscriptException(String arg0) {
		super(arg0);
	}

}
class ArrayAlgTest{
    public static void main(String[] args){
        String[] name={"Tran","Van","Tho"};
        Integer [] number={1,2,3,4,5,6};
        ArrayAlg aa = new ArrayAlg();
        aa.<String>printArray(name);
        aa.printArray(name, 1, 3);
        aa.<Integer>printArray(number, 1,5);
    }
}