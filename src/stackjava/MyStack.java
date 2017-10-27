/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackjava;

import java.util.ArrayList;

/**
 *
 * @author ivasquez
 */
public class MyStack <T> {
    private ArrayList<T> Mylist = new ArrayList<>();
    
    public void Push(T t){
       Mylist.add(t);
    }
    
    public T Pop(){
        
      T tmp = Mylist.get(Mylist.size()-1);
      Mylist.remove(Mylist.size()-1);
       return tmp;
    }
}
