
import javax.swing.*;

public class Runner {
    private double g;
    public Runner(){
        VirtualPet p = new VirtualPet();
        
        //p.exercise();
        //takeABeat(5000);
        //p.feed();
        g = 0;
        String a = getAnswer("Wanna help me buy groceries? If I spend under $18 I'll give you a prize", "");
        if(a.equals("yes")){
            p.face.setMessage("ok cool");
            p.face.setImage("happy_1");
            System.out.println();
        }
            else{
                p.face.setMessage("too bad, I still need your help");
                p.face.setImage("happy_1");
                System.out.println();
            }
        takeABeat(2000);
        int x = q1("whole", "chocolate");
        if (x == 0){
            p.face.setMessage("ok, I'll buy whole milk");
            p.face.setImage("leche_1");
            System.out.println();
            takeABeat(1500);
            p.face.setImage("happy_1");
            g = g+2.95;
        }
        else{
            p.face.setMessage("ok, I'll buy chocolate milk");
            p.face.setImage("chocky_1");
            System.out.println();
            takeABeat(1500);
            p.face.setImage("happy_1");
            g = g+3.15;
        }
        p.face.setMessage("money remaining: " + (18-g));
        takeABeat(2500);
        int y = q2("cocoa puffs", "lucky charms");
        if (y == 0){
            p.face.setMessage("ok, I'll buy cocoa puffs");
            p.face.setImage("puffs_1");
            System.out.println();
            takeABeat(1500);
            p.face.setImage("happy_1");
            g=g+2.85;
        }
        else{
            p.face.setMessage("ok, I'll buy lucky charms");
            p.face.setImage("charms_1");
            System.out.println();
            takeABeat(1500);
            p.face.setImage("happy_1");
            g=g+2.45;
        }
        p.face.setMessage("money remaining: " + (18-g));
        takeABeat(2500);
        int z = q3("eggs", "cheese");
        if (z == 0){
            p.face.setMessage("ok, I'll buy eggs");
            p.face.setImage("huevo_1");
            System.out.println();
            takeABeat(1500);
            p.face.setImage("happy_1");
            g=g+3.15;
        }
        else{
            p.face.setMessage("ok, I'll buy cheese");
            p.face.setImage("queso_1");
            System.out.println();
            takeABeat(1500);
            p.face.setImage("happy_1");
            g=g+2.75;
        }
        p.face.setMessage("money remaining: " + (18-g));
        takeABeat(2500);
        int w = q4("fruit", "veggies");
        if (w == 0){
            p.face.setMessage("ok, I'll buy fruit");
            p.face.setImage("fruit_1");
            System.out.println();
            takeABeat(1500);
            p.face.setImage("happy_1");
            g=g+4.15;
        }
        else{
            p.face.setMessage("ok, I'll buy veggies");
            p.face.setImage("veggies_1");
            System.out.println();
            takeABeat(1500);
            p.face.setImage("happy_1");
            g=g+4.65;
        }
        p.face.setMessage("money remaining: " + (18-g));
        takeABeat(2500);
        int v = q5("coffee", "chips");
        if (v == 0){
            p.face.setMessage("ok, I'll buy coffee");
            p.face.setImage("coffee_1");
        int v = q5("coffee", "chips");
        if (v == 0){
            p.face.setMessage("ok, I'll buy coffee");
            p.face.setImage("___");
            System.out.println();
            takeABeat(1500);
            p.face.setImage("happy_1");
            g=g+4.20;
        }
        else{
            p.face.setMessage("ok, I'll buy chips");
            p.face.setImage("chips_1");
            System.out.println();
            takeABeat(1500);
            p.face.setImage("happy_1");
            g=g+4.50;
        }
        if(g>18){
            p.face.setMessage("Money remaining: 0");
            System.out.println();
        }
        if(g<=18){
            p.face.setMessage("money remaining: " + (18-g));
        }
        takeABeat(2500);
        
        //endgame
        if (g>=18){
            p.face.setMessage("Aw man, we spent too much, maybe next time");
            p.face.setImage("sad");
            System.out.println();
        }
        else{
            p.face.setMessage("Yay! You spent less than $18, good job");
            p.face.setImage("ecstatic_3");
            System.out.println();
            takeABeat(1500);
            p.face.setMessage("*you have been awarded a lollipop*");
            p.face.setImage("endgamelollipop");
            System.out.println();
        }
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
            "Should I buy eggs for $3.15 or cheese for $2.75",
            "grocery shopping",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[1]);
            return n;
    }
    public int q4(String a, String b){
        Object[] options = {a,
            b};

        int n = JOptionPane.showOptionDialog(
            new JFrame(),
            "Should I buy fruit for $4.15 or veggies for $4.65",
            "grocery shopping",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[1]);
            return n;
    }
    public int q5(String a, String b){
        Object[] options = {a,
            b};

        int n = JOptionPane.showOptionDialog(
            new JFrame(),
            "Should I buy coffee for $4.20 or chips for 4.50",
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

