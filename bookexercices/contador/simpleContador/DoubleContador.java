package simpleContador;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DoubleContador extends Applet implements ActionListener{
	ContadorThread ch1, ch2;
	Font fuente; 
	Button b1, b2, b3, b4;

	
	public class ContadorThread extends Thread{
		private long cont;
		boolean working;
		
		public ContadorThread(long c) {
			cont = c;
		}
		
		public long getcontador() {
			return cont;
		}
		
		public void parar() {
			working = false;
		}
		
		public void reanudar() {
			working = true;
		}
		
		@Override
		public void run() {
			
			working = true;
			
			while (working) {
				cont++;
				repaint();
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {e.printStackTrace();}
			}
		}
	}
	
	
	
	public void init() {
		fuente = new Font("Verdana", Font.BOLD, 26);
		add(b3 = new Button("start hilo 1"));
		add(b4 = new Button("start hilo 2"));
		add(b1 = new Button("Parar hilo 1"));
		add(b2 = new Button("Parar hilo 2"));
		ch1 = new ContadorThread(1);
		ch2 = new ContadorThread(0);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==b1) {
			if (ch1.working) {ch1.parar();}
			else {ch1.reanudar();}
		} else if (e.getSource()==b2) {
			if (ch2.working) {ch2.parar();}
			else {ch2.reanudar();}
		} else if (e.getSource()==b3) {
			ch1.start();
		} else if (e.getSource()==b4) {
			ch2.start();
		}
	}
	
	public void paint(Graphics g) {
		g.clearRect(0, 0, 400, 400);
		setBackground(Color.yellow);
		g.setFont(fuente);
		g.drawString(Long.toString(ch1.getcontador()) , 40, 120);
		g.drawString(Long.toString(ch2.getcontador()), 120, 120);
	}
	
}
