
import javax.swing.*;

public class Runner {
    public Runner(){
        
        VirtualPet p = new VirtualPet();
        //p.exercise();
        //takeABeat(5000);
        //p.feed();
        String a = getAnswer("how was your day?", "");
        if(a.equals("good")){
            p.face.setMessage("that's nice");
            p.face.setImage("ecstatic_2");
        }

    }
    public void takeABeat(int milliseconds){
            try {
            Thread.sleep(milliseconds); //milliseconds
        } catch(Exception e){

        }
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

