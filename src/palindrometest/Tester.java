/*
 * 
 */
package palindrometest;

import java.util.Stack;

/**
 *
 * @author Travis
 */
public class Tester {
   
    /**
     * 
     *  
     */
    protected int test(){
        
        String initialString = window.jTextField2.getText();
        String resultString = "";
        int result = 0;
        
        Stack palindromeStack = new Stack();
        
        for (int i = 0; i < initialString.length(); i++){
            
            palindromeStack.push(initialString.charAt(i));
        }
        
        for (int i = 0; i < initialString.length(); i++){
            
            resultString += palindromeStack.pop();
        }
        
        for (int i = 0; i < initialString.length(); i++){
            
            if (initialString.charAt(i) == resultString.charAt(i)){
                result = 1;
            }
            else{
                result = 2;
            }
        }
        return result;
    }
    
    /**
     * 
     * @param result 
     */
    protected void updateGui(int result){
        
        if (result == 0){
            
            window.jLabel3.setText("UNKNOWN");
        }
        
        else if (result == 1){
            
            window.jLabel3.setText("YES");
        }
        
        else if (result == 2){
            
            window.jLabel3.setText("NO");
        }
        
        else {
            
            window.jLabel3.setText("ERROR");
        }
            
    }
    
}
