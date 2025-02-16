/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsimulator;

public abstract class Question {
    
    /**
     * Fields of class
     */
    private String questionID; //unique TODO
    private int chapterNumber; 
    private String questionText;
    
    /**
     * Methods of class
     */
    
    /**
     * Constructor 
     */
    public Question(String questionID, int chapterNumber, String questionText){
        
        this.questionID = questionID;
        this.chapterNumber = chapterNumber;
        this.questionText = questionText;
    }
    
    abstract boolean isAnswerCorrect();
    
    public String getQuestionID(){
        
        return this.questionID;
    }
    
    public int getChapterNumber(){
        
        return this.chapterNumber;
    }
    
    public String getQuestionText(){
        
        return this.questionText;
    }
}
