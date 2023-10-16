
import javax.swing.*;

public class Runner {
    public Runner(){
        
        
        VirtualPet p = new VirtualPet();
        //p.exercise();
        //takeABeat(5000);
        //p.feed();
        String a = getAnswer("Would you like to help me buy groceries", "");
        if(a.equals("yes")){
            p.face.setMessage("ok cool");
            p.face.setImage("happy_1");
            System.out.println();
        }
            else{
                p.face.setMessage("too bad");
                p.face.setImage("happy_1");
                System.out.println();
            }
        takeABeat(2000);
        q1("whole", "chocolate");
        takeABeat(2000);
        q2("cheerios", "lucky charms");
        takeABeat(2000);
    }
    public void takeABeat(int milliseconds){
            try {
            Thread.sleep(milliseconds); //milliseconds
        } catch(Exception e){

        }
    }
    public int q1(String a, String b){
        Object[] options = {a,
            b};

        int n = JOptionPane.showOptionDialog(
            new JFrame(),
            "Should I buy whole milk or chocolate milk",
            "grocery shopping",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[1]);
            return n;
    }
    public int q2(String a, String b){
        Object[] options = {a,
            b};

        int n = JOptionPane.showOptionDialog(
            new JFrame(),
            "Should I buy cheerios or lucky charms",
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
    public String getAnswer2(int x){
        String s = (String)JOptionPane.showInputDialog(
            new JFrame(),
            x,
        )
    }
  
    public static void main(String[] args) {
        new Runner();
        
    }
}

