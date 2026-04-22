package joptionpaneversion;
import javax.swing.*;
public class StringIndexV2{
    public static void main(String args[]){

    String phrase = JOptionPane.showInputDialog(null,"WHAT IS THE PHRASES?  ",STRINGINDEXv2,JOptionPane.QUESTION_MESSAGE);
    String Keywords = JOptionPane.showInputDialog(null,"WHAT IS THE KEYWORDS?  ",STRINGINDEXv2,JOptionPane.QUESTION_MESSAGE);

        int index=phrase.indexOf(Keywords);

        if(index != -1 ){
            JOptionPane.showMessageDialog(null,"\n"+keywords+" is found!"+"\n"+"Location: is at index " + index + ".");
        }
        else{
            JOptionPane.showMessageDialog(null,"KEYWORDS NOT FOUND!","NOT FOUND",JOptionPane.ERROR_MESSAGE);
        }
    }
}
