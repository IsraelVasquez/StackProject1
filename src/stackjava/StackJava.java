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
public class StackJava{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MyStack MyStack = new MyStack();
        ArrayList<String> MyList = new ArrayList<>();
                
                MyList.add("fly");
                MyList.add("spider");
                MyList.add("bird");
                MyList.add("cat");
                MyList.add("dog");
                
                
                    for(int i=4; i>=0; i--)
                    {
                        MyStack.Push(MyList.get(i));
                        System.out.println(MyStack.Pop());
                    }
                    
                    

                    
                      
                    
                }
                
                
    }
    

