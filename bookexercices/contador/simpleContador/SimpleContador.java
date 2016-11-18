package simpleContador;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleContador extends Applet implements Runnable, ActionListener{
	private Thread h = null; //hilo
	private Font fuente; 
	private Button b1, b2;
	private boolean parar;
	long CONTADOR = 0;
	
	public void init() {
		fuente = new Font("Verdana", Font.BOLD, 26);
		add(b1 = new Button("Iniciar contador"));
		add(b2 = new Button("Parar contador"));
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		b1.setLabel("Continuar");
		if (e.getSource()==b1) {
			if (h!=null && h.isAlive()) {}
			else {
				h=new Thread(this);
				h.start();
			}
		} else if (e.getSource()==b2) {
			parar=true;
		}
	}
	
	public void stop() {
		h=null;
	}
	
	@Override
	public void run() {
		parar = false;
		Thread hiloActual = Thread.currentThread();
		while (h == hiloActual && !parar) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {}
			CONTADOR++;
			repaint();
		}
	}
	
	public void paint(Graphics g) {
		g.clearRect(0, 0, 400, 400);
		setBackground(Color.yellow);
		g.setFont(fuente);
		g.drawString(Long.toString((long)CONTADOR), 80, 100);
	}
	

}
