
import javax.swing.*;

public class Runner {
    public Runner(){
        
        VirtualPet p = new VirtualPet();
        //p.exercise();
        //takeABeat(5000);
        //p.feed();
        //String a = getAnswer("how was your day?", "");
        //if(a.equals("good")){
        //    p.face.setMessage("that's nice");
        //    p.face.setImage("ecstatic_2");
        //    System.out.println();

        //}
        answerBox();
    }
    public void takeABeat(int milliseconds){
            try {
            Thread.sleep(milliseconds); //milliseconds
        } catch(Exception e){

        }
    }
    public int answerBox(){
        Object[] options = {"milk",
            "eggs"};

        int n = JOptionPane.showOptionDialog(
            new JFrame(),
    "Should I buy milk or eggs",
            "grocery shopping",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[1]);
            return n;
    }
    public String getAnswer(String q, String t){
        String s = (String)JOptionPane.showInputDialog(
            new JFrame(),
            q,
            t,
            JOptionPane.PLAIN_MESSAGE
        );
        return s;

    }
  
    public static void main(String[] args) {
        new Runner();
        
    }
}

