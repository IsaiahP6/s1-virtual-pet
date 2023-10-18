
import javax.swing.*;

public class Runner {
    private double g;
    public Runner(){
        VirtualPet p = new VirtualPet();
        
        //p.exercise();
        //takeABeat(5000);
        //p.feed();
        g = 0;
        String a = getAnswer("Would you like to help me buy groceries, I'm trying to spend under $18", "");
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
        int x = q1("whole", "chocolate");
        if (x == 0){
            p.face.setMessage("ok, I'll buy whole milk");
            p.face.setImage("whole_1");
            System.out.println();
            takeABeat(1500);
            p.face.setImage("happy_1");
            g = g+2.95;
        }
        else{
            p.face.setMessage("ok, I'll buy chocolate milk");
            p.face.setImage("choc_1");
            System.out.println();
            takeABeat(1500);
            p.face.setImage("happy_1");
            g = g+3.15;
        }
        System.out.println(g);
        //p.face.setMessage(""+g);
        takeABeat(2000);
        int y = q2("cocoa puffs", "lucky charms");
        if (y == 0){
            p.face.setMessage("ok, I'll buy cocoa puffs");
            p.face.setImage("cereal_2");
            System.out.println();
            takeABeat(1500);
            p.face.setImage("happy_1");
            g=g+2.85;
        }
        else{
            p.face.setMessage("ok, I'll buy lucky charms");
            p.face.setImage("cereal_3");
            System.out.println();
            takeABeat(1500);
            p.face.setImage("happy_1");
            g=g+2.45;
        }
        takeABeat(2000);
        q3("eggs", "cheese");
        
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
            "Should I buy whole milk for $2.95 or chocolate milk for $3.15",
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
            "Should I buy cocoa puffs for $2.85 or lucky charms for $2.45",
            "grocery shopping",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[1]);
            return n;
    }
        public int q3(String a, String b){
        Object[] options = {a,
            b};

        int n = JOptionPane.showOptionDialog(
            new JFrame(),
            "Should I buy eggs or cheese",
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

