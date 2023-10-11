import javax.swing.JOptionPane;

public class Runner {
    public Runner(){
        
        VirtualPet p = new VirtualPet();
        p.exercise();
        takeABeat(5000);
        p.feed();

    }
    public void takeABeat(int milliseconds){
            try {
            Thread.sleep(milliseconds); //milliseconds
        } catch(Exception e){

        }
    }
    public String getAnswer(String q){
        String s = (String)JOptionPane.showInputDialog(
            new JFrame(),
            message:"Your Message",
            title:"Your Title",
            JOptionPane.PLAIN_MESSAGE
        );
        return s;
    }
    public static void main(String[] args) {
        new Runner();
    
    }
}

