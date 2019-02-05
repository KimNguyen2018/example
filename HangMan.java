
package chapter7;

import java.util.Scanner;
    
public class HangMan {
    
    public static Scanner input = new Scanner(System.in);
    public static String[] words = {"write", "that", "happy"};        
    public static String w1, w2, w3, charSt;       
    
    public static char[] saveW1 = new char[w1.length()];
    public static char[] saveW2 = new char[w2.length()];
    public static char[] saveW3 = new char[w3.length()];
    
    public static int correctCount, order; 
    public static void main(String[] args) {
                               
        w1 = words[0]; w2 =words[1]; w3 = words[2];    
        boolean isDone;
        isDone = false;
        
        for (int i=0; i<w1.length(); i++)
            saveW1[i] = '*';
        
        for (int i=0; i<w2.length(); i++)
            saveW2[i] = '*';
        
        for (int i=0; i<w3.length(); i++)
            saveW3[i] = '*';        
        
        // first time;
        correctCount = 0;
        order = 1;       
        playingGame(w1, saveW1);
        isDone = Answer();
        while (isDone){             
            switch (order) {
                case 1: playingGame(w1, saveW1);
                case 2: playingGame(w2, saveW2);
                case 3: playingGame(w3,saveW3);
            }
        }                
    }
    
    public static void showWord(char[] w){
        System.out.print("(Guess) Enter a letter in word "); 
        for (int i=0; i<w.length; i++)
            if (i == w.length -1) System.out.print(w[i] + " > ");
            else System.out.print(w[i]);        
    }
    
    public static boolean checkHavingChar(char c, char[] w){
        for (int i=0; i<w.length; i++)
            if (c == w[i]) return true;
        return false;    
    }
    
    public static boolean Answer(){
        System.out.println("Do you want to guess another word? (Yes/No): ");        
        String st = input.next();
        st = st.trim().toUpperCase();    
        if (st.equalsIgnoreCase("YES")) return true;
        else
            if (st.equalsIgnoreCase("NO")){            
                System.out.println("\nBye! See you again !!!");
                System.exit(0);
            }            
        return false;        
    }
    
    public static void playingGame(String w, char[] saveW){      
        boolean guess; 
        int turn, count1, count2; 
        char c; c=' ';
        turn = count1 = 0;
        guess = false;
        
        do{                         
            if (turn < w.length()){                
                c = input.next().charAt(0);
                turn ++; count2 = 0;                
                if (checkHavingChar(c, saveW)) {
                    System.out.println(c + " is already in the word");                
                    showWord(saveW);
                }    
                else{
                    for (int i=0; i< w.length(); i++){
                        if (w.charAt(i) == c){
                            count1 ++;
                            saveW[i] = w.charAt(i);
                            if (turn < w.length())
                                showWord(saveW);
                        }
                        else count2 ++;
                    }               
                    
                    if (count2 == w.length()){
                        System.out.println(c + " is not in the word");
                        if (turn <w.length()) showWord(saveW);
                    } 

                    // guess some of letters correctly.
                    if (turn == w.length() && count1<w.length()){
                        System.out.println( "\nThe word is program. You missed 1 time.");        
                        correctCount = 0;                        
                    }                                 
                    // guess all correct !
                    if (count1 == w.length()){
                        System.out.println(" You win");
                        order ++;
                        guess = true;                        
                    }    
                }
            } 
        }while(!guess);    
    }
}