package quizapp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz3 extends JFrame implements ActionListener {
	
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
	
	public Quiz3(String uname)
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
		
		questions[0][0] = "À quel écrivain doit-on les \"Illusions perdues\" ?";
		questions[0][1] = "Émile Zola";
		questions[0][2] = "Gustave Flaubert";
		questions[0][3] = "Victor Hugo";
		questions[0][4] = "Honoré de Balzac";
		





		questions[1][0] = "Dans quel roman retrouve-t-on le moine franciscain Guillaume de Baskerville ?";
		questions[1][1] = "Le Nom de la rose";
		questions[1][2] = "Ulysse";
		questions[1][3] = "Le Désert des Tartares";
		questions[1][4] = "Les Faux-monnayeurs";
		


		questions[2][0] = "À quel philosophe doit-on \" L’Être et le Néant \" ?";
		questions[2][1] = "Henri Bergson";
		questions[2][2] = "Claude Lévi-Strauss";
		questions[2][3] = "Albert Camus";
		questions[2][4] = "Jean-Paul Sartre";




		/*questions[3][0] = "De quelle fable de La Fontaine cette morale est-elle tirée \"On a souvent besoin d’un plus petit que soi\" ?";
		questions[3][1] = "Le Lion et le Rat";
		questions[3][2] = "Le Coche et la Mouche";
		questions[3][3] = "L’Amour et la Folie";
		questions[3][4] = "Le Chat et un vieux Rat";*/
		
		questions[3][0] = "Dans quel roman de Dostoïevski, Raskolnikov tue-t-il deux sœurs ?";
		questions[3][1] = "L'Idiot";
		questions[3][2] = "Les Démons";
		questions[3][3] = "Les Frères Karamazov";
		questions[3][4] = "Crime et Châtiment";


		questions[4][0] = "Dans quel livre lit-on cette fameuse citation \"S'il vous plaît… dessine-moi un mouton !\" ?";
		questions[4][1] = "Le Désert des Tartares";
		questions[4][2] = "Le Petit Prince";
		questions[4][3] = "Le Silence de la mer";
		questions[4][4] = "Le Seigneur des anneaux";


		questions[5][0] = "Qui a écrit le roman \"Gatsby le Magnifique\" ?";
		questions[5][1] = "Herman Melville";
		questions[5][2] = "Oscar Wilde";
		questions[5][3] = "Francis Scott Fitzgerald";
		questions[5][4] = "Henry James";



		questions[6][0] = "À quel auteur doit-on le roman \"Le Comte de Monte-Cristo\" ?";
		questions[6][1] = "Charles Dickens";
		questions[6][2] = "Molière";
		questions[6][3] = "Alexandre Dumas";
		questions[6][4] = "Victor Hugo";


		questions[7][0] = "Quel livre, de Joseph Conrad, a inspiré Francis Ford Coppola pour \"Apocalypse now\" ?";
		questions[7][1] = "Pour qui sonne le glas";
		questions[7][2] = "Au cœur des ténèbres";
		questions[7][3] = "Tristes Tropiques";
		questions[7][4] = "Sous le soleil de Satan";



		questions[8][0] = "À quel auteur doit-on « Charlie et la chocolaterie », adapté au cinéma par Tim Burton ?";
		questions[8][1] = "Edgar P. Jacobs";
		questions[8][2] = "Roald Dahl";
		questions[8][3] = "J. D. Salinger";
		questions[8][4] = "Dan Brown";



		questions[9][0] = "Sur quelle île, Leonardo DiCaprio enquête-t-il, d’après un livre de Dennis Lehane ?";
		questions[9][1] = "Pacific Island";
		questions[9][2] = "Shutter Island";
		questions[9][3] = "Elk Island";
		questions[9][4] = "River Island";
		
		
		answers[0][1] = "Honoré de Balzac";
		answers[1][1] = "Le Nom de la rose";
		answers[2][1] = "Jean-Paul Sartre";
		answers[3][1] = "Crime et Châtiment";
		answers[4][1] = "Le Petit Prince";
		answers[5][1] = "Francis Scott Fitzgerald";
		answers[6][1] = "Alexandre Dumas";
		answers[7][1] = "Au cœur des ténèbres";
		answers[8][1] = "Roald Dahl";
		answers[9][1] = "Shutter Island";
		
		
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


