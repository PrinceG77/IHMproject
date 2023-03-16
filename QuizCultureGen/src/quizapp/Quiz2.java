package quizapp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz2 extends JFrame implements ActionListener {
	
	String questions[][] = new String[10][5];
	String answers[][] = new String[10][2];
	String Uanswers[][] = new String[10][1];
	ButtonGroup group;
	JRadioButton ch1, ch2, ch3, ch4;
	JLabel q_name, question;
	JButton Bnext,result;
	public static int count = 0;
	public static int timer = 20;
	public static int rep = 0;
	public static int point = 0;
	String username;
	
	public Quiz2(String uname)
	{
		this.username = uname;
		this.setBounds(50,0,1440,850);
		this.setLayout(null);
		this.getContentPane().setBackground(Color.white);
		
		ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("images/quizbg1_0.jpg"));
		Image img2 = img.getImage().getScaledInstance(1440,392,Image.SCALE_DEFAULT);
		ImageIcon img3 = new ImageIcon(img2);
		JLabel image = new JLabel(img3);
		image.setBounds(0, 0, 1440, 392);
		this.add(image);
		
		q_name = new JLabel("1.");
		q_name.setBounds(80, 450, 50, 30);
		q_name.setFont(new Font("Baskerville Old Face", Font.PLAIN, 24));
		this.add(q_name);
		
		question = new JLabel();
		question.setBounds(110, 450, 900, 30);
		question.setFont(new Font("Baskerville Old Face", Font.PLAIN, 22));
		this.add(question);

questions[0][0] = "Combien y a-t-il d'os dans le corps humain ?";
		questions[0][1] = "205";
		questions[0][2] = "206";
		questions[0][3] = "212";
		questions[0][4] = "208";
		





		questions[1][0] = "Quelle est la seule lettre qui n'apparaît pas dans le tableau périodique ?";
		questions[1][1] = "Q";
		questions[1][2] = "D";
		questions[1][3] = "X";
		questions[1][4] = "J";
		


		questions[2][0] = "Quel est l'animal terrestre le plus rapide du monde ?";
		questions[2][1] = "Le Lion";
		questions[2][2] = "L'antilope";
		questions[2][3] = "Le cheval";
		questions[2][4] = "Le guépard";




		questions[3][0] = "Combien de cerveaux et combien de cœurs possède une pieuvre ?";
		questions[3][1] = "1 cerveau, 1 coeur";
		questions[3][2] = "9 cerveaux, 2 coeurs";
		questions[3][3] = "9 cerveaux, 3 coeurs";
		questions[3][4] = "3 cerveaux, 3 coeurs";


		questions[4][0] = "Combien d'os ont les requins ?";
		questions[4][1] = "28";
		questions[4][2] = "33";
		questions[4][3] = "53";
		questions[4][4] = "45";


		questions[5][0] = "Combien de temps faut-il environ pour que la lumière du soleil atteigne la Terre ?";
		questions[5][1] = "8 secondes";
		questions[5][2] = "8 minutes";
		questions[5][3] = "8 heures";
		questions[5][4] = "8 jours";



		questions[6][0] = "Quel est le nom de l’unité de résistance électrique ?";
		questions[6][1] = "Ohm";
		questions[6][2] = "Ampère";
		questions[6][3] = "Watt";
		questions[6][4] = "Volt";


		questions[7][0] = "Parmi ces figures, laquelle n’est pas un polygone ?";
		questions[7][1] = "Un triangle";
		questions[7][2] = "Un carré";
		questions[7][3] = "Un pentagone";
		questions[7][4] = "Un cercle";



		questions[8][0] = "Qui a découvert le téléphone ?";
		questions[8][1] = "Alexandre Bell";
		questions[8][2] = "Thomas Jefferson";
		questions[8][3] = "Benjamin Franklin";
		questions[8][4] = "Louis Pasteur";



		questions[9][0] = "Quelle est la substance naturelle la plus dure sur Terre ?";
		questions[9][1] = "Carbure de silicium";
		questions[9][2] = "Or";
		questions[9][3] = "Graphène";
		questions[9][4] = "Diamant";
		


		
		answers[0][1] = "206";  
		answers[1][1] = "J";     
		answers[2][1] = "Le guépard";  
		answers[3][1] = "9 cerveaux, 3 coeurs";  
		answers[4][1] = "33";       
		answers[5][1] = "8 minutes";        
		answers[6][1] = "Ohm"; 
		answers[7][1] = "Un cercle";         
		answers[8][1] = "Alexandre Bell";   
		answers[9][1] = "Diamant";       
		
		
		 ch1 = new JRadioButton();
			ch1.setBounds(150, 520, 700, 30);
			ch1.setBackground(Color.white);
			ch1.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
			this.add(ch1);
			
			 ch2 = new JRadioButton();
			ch2.setBounds(150, 560, 700, 30);
			ch2.setBackground(Color.white);
			ch2.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
			this.add(ch2);
			
			 ch3 = new JRadioButton();
			ch3.setBounds(150, 600, 700, 30);
			ch3.setBackground(Color.white);
			ch3.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
			this.add(ch3);
			
			 ch4 = new JRadioButton();
			ch4.setBounds(150, 640, 700, 30);
			ch4.setBackground(Color.white);
			ch4.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
			this.add(ch4);
			
		
	    group = new ButtonGroup();
		group.add(ch1);
		group.add(ch2);
		group.add(ch3);
		group.add(ch4);
		
		Bnext = new JButton("Suivant");
		Bnext.setBounds(1100, 550, 200, 40);
		Bnext.setBackground(Color.DARK_GRAY);
		Bnext.setForeground(Color.white);
		Bnext.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		Bnext.addActionListener(this);
		this.add(Bnext);
		
		result = new JButton("Résultats");
		result.setBounds(1100, 630, 200, 40);
		result.setBackground(Color.LIGHT_GRAY);
		result.setForeground(Color.white);
		result.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		result.setEnabled(false);
		result.addActionListener(this);
		this.add(result);
		
		start(count);
				
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public void paint(Graphics g) {
        super.paint(g);
        
        String time = "Temps restant : " + timer + " seconde(s)"; // 15
        g.setColor(Color.RED);
        g.setFont(new Font("Baskerville Old Face", Font.BOLD, 25));
        
        if (timer > 0) { 
            g.drawString(time, 1100, 500);
        } else {
            g.drawString("Times up!!", 1100, 500);
        }
        
        timer--; // 14
        
        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        if (rep == 1) {
            rep = 0;
            timer = 20;
        } else if (timer < 0) {
            timer = 20;
            ch1.setEnabled(true);
            ch2.setEnabled(true);
            ch3.setEnabled(true);
            ch4.setEnabled(true);
            
            if (count == 8) {
            	result.setEnabled(true);
				result.setBackground(Color.DARK_GRAY);
				Bnext.setEnabled(false);
				Bnext.setBackground(Color.LIGHT_GRAY);
            }
            if (count == 9) { // submit button
                if (group.getSelection() == null) {
                	Uanswers[count][0] = "";
                } else {
                	Uanswers[count][0] = group.getSelection().getActionCommand();
                }
                
                for (int i = 0; i < Uanswers.length; i++) {
                    if (Uanswers[i][0].equals(answers[i][1])) {
                        this.point += 10;
                    } else {
                        this.point += 0;
                    }
                }
                int score = this.point;
                this.point = 0;
                setVisible(false);
                this.count= 0;
                new Result(this.username, score);
            } else { // next button
                if (group.getSelection() == null) {
                   Uanswers[count][0] = "";
                } else {
                    Uanswers[count][0] = group.getSelection().getActionCommand();
                }
                count++; // 0 // 1
                start(count);
            }
        }
        
    }
	
	 public void start(int count) {
	        q_name.setText("" + (count + 1) + ". ");
	        question.setText(questions[count][0]);
	        ch1.setText(questions[count][1]);
	        ch1.setActionCommand(questions[count][1]);
	        
	        ch2.setText(questions[count][2]);
	        ch2.setActionCommand(questions[count][2]);
	        
	        ch3.setText(questions[count][3]);
	        ch3.setActionCommand(questions[count][3]);
	        
	        ch4.setText(questions[count][4]);
	        ch4.setActionCommand(questions[count][4]);
	        
	        group.clearSelection();
	    }

	/*
	public static void main(String[] args)
	{
		Quiz q1 = new Quiz("user");
	}*/
	@Override
	public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == Bnext) {
            repaint();
            ch1.setEnabled(true);
            ch2.setEnabled(true);
            ch3.setEnabled(true);
            ch4.setEnabled(true);
            
            rep = 1;
            if (group.getSelection() == null) {
               Uanswers[count][0] = "";
            } else {
                Uanswers[count][0] = group.getSelection().getActionCommand();
            }
            
            if (count == 8) {
                Bnext.setEnabled(false);
                result.setEnabled(true);
            }
            
            count++;
            start(count);
        } 
           else if (ae.getSource() == result) {
            rep = 1;
            if (group.getSelection() == null) {
            	Uanswers[count][0] = "";
            } else {
            	Uanswers[count][0] = group.getSelection().getActionCommand();
            }

            for (int i = 0; i < Uanswers.length; i++) {
                if (Uanswers[i][0].equals(answers[i][1])) {
                    point += 10;
                } else {
                    point += 0;
                }
            }
            
            int score = this.point;
            this.point = 0;
            setVisible(false);
            this.count= 0;
            new Result(this.username, score);
        }
    }
		
		
	}


