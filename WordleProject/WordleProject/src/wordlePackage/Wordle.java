/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordlePackage;

/**
 *
 * @author malil6384
 */
public class Wordle {
    private static String goalWord = null;
    private final String[] wordArray = {
        "moody", "moldy", "flame", "giant", "oasis", "paste", "pasta", "scent", "pizza", "gauge", "unity", "raise", "niece", 
        "storm", "burst", "serum", "entry", "shelf", "feral", "erase", "racer", "first", "frisk", "grail", "essay", 
        "corny", "logic", "could", "grave", "digit", "bread", "stole", "tango", "reign", "witty", "shown", "water", "viper", "manic",
        "throw", "broom", "focus", "drive", "prong", "stone", "stunt", "prime", "madly", "vigor", "enter", "below", "skunk", "never",
        "buddy", "round", "truck", "trust", "gauge", "plane", "panel", "gross"};
    
    
    //Constructor to choose a word for the user to guess
    public Wordle(){
        int index = (int) Math.floor(Math.random() * wordArray.length);
        goalWord = wordArray[index];
    }
    /**
     * This method will filter through the goal word and decide
     * what letters are right and wrong, returns an array of RGB values for buttons
     * @param str 
     * @return rgbValues
     */
    public int[][] guesser(String str){
        //2d array of ints for rgb values of buttons to represent 
        //if your character is correct or not
        int[][] rgbValues = new int[5][3];
        //For loop to iterate through the string
        for(int i = 0; i<str.length(); i++){
            
            //Substring to test goalword
            String subStr = goalWord.substring(i, i+1);
            //Main algorithm to check through string
            if(str.substring(i,i+1).equals(subStr)){
                   rgbValues[i][0] = 0;
                   rgbValues[i][1] = 255;
                   rgbValues[i][2] = 0;
              } else {
                //Gives certain characters yellow color
                char x = str.charAt(i);
                if(goalWord.indexOf(x) >= 0){
                      rgbValues[i][0] = 255;
                      rgbValues[i][1] = 255;
                      rgbValues[i][2] = 0;
                 } else {
                    //Gives wrong characters grey
                    rgbValues[i][0] = 50;
                    rgbValues[i][1] = 50;
                    rgbValues[i][2] = 50;
                 }
            }
        }
        return rgbValues;
    }
    
    
    
    

}
