package quizapp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener {
	
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
	
	public Quiz(String uname)
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
		

questions[0][0] = "Quel est le sport le plus populaire du monde ?";
		questions[0][1] = "Basketball";
		questions[0][2] = "Football";
		questions[0][3] = "Tennis";
		questions[0][4] = "Volleyball";
		





		questions[1][0] = "Quel pays a le plus participé aux Jeux Olympiques d'été sans remporter \n\n la moindre médaille ?";
		questions[1][1] = "USA";
		questions[1][2] = "France";
		questions[1][3] = "Russie";
		questions[1][4] = "Philippines";
		


		questions[2][0] = " Qui a remporté le plus de titre de grand chelem ?";
		questions[2][1] = "Serena Williams";
		questions[2][2] = "Venus Williams ";
		questions[2][3] = "Prince Williams";
		questions[2][4] = "Aime williams";




		questions[3][0] = " Quel est le premier pays africain à se qualifier à la coupe du monde ?";
		questions[3][1] = "RDC";
		questions[3][2] = "Rwanda";
		questions[3][3] = "Egypte";
		questions[3][4] = "Maroc";


		questions[4][0] = " Quel âge avait le joueur de foot professionel le plus jeune ?";
		questions[4][1] = "9 ans";
		questions[4][2] = "15 ans";
		questions[4][3] = "12 ans";
		questions[4][4] = "11 ans";


		questions[5][0] = "Quelle nation a remporté la première édition de la coupe du Monde ?";
		questions[5][1] = "Uruguay";
		questions[5][2] = "France";
		questions[5][3] = "Japon";
		questions[5][4] = "Brésil";



		questions[6][0] = " Qui est le premier joueur britannique a avoir remporté un championnat dans 4 pays ?";
		questions[6][1] = "David Beckham";
		questions[6][2] = "Frank Lampard";
		questions[6][3] = "Wayne Rooney";
		questions[6][4] = "Raheen Sterling";


		questions[7][0] = " Quel pays a remporté la première coupe du monde féminine ?";
		questions[7][1] = "USA";
		questions[7][2] = "Maroc";
		questions[7][3] = "Rwanda";
		questions[7][4] = "Brésil";



		questions[8][0] = " Dans quel sport s’est illustré Rod Laver ?";
		questions[8][1] = "Natation";
		questions[8][2] = "Tennis";
		questions[8][3] = "Rugby";
		questions[8][4] = "Formule 1";



		questions[9][0] = " Les Jeux Olympiques ont lieu tous les ?";
		questions[9][1] = "2 ans";
		questions[9][2] = "1 an";
		questions[9][3] = "4 ans";
		questions[9][4] = "3 ans";
		


		
		answers[0][1] = "Football";  
		answers[1][1] = "Philippines";    
		answers[2][1] = "Serena Williams";  
		answers[3][1] = "Egypte";  
		answers[4][1] = "12 ans";       
		answers[5][1] = "Uruguay";        
		answers[6][1] = "David Beckham";   
		answers[7][1] = "USA";         
		answers[8][1] = "Tennis";    
		answers[9][1] = "4 ans";       
		
		
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


