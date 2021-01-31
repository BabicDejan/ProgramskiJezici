package com.sample;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
public class RunExpert extends JFrame{
	
	private JPanel canvas;
	private JPanel lijeviPanel;
	private JPanel desniPanel;
	private JLabel labeleLijevo[] = new JLabel[6];
	private JPanel gornjiPanel;
	private JPanel donjiPanel;
	private JPanel lijeviSredinaPanel;
	private JPanel desniSredinaPanel;
	private JTextField brojGodina;
	private JRadioButton yes1;
	private JRadioButton no1;
	private JRadioButton yes2;
	private JRadioButton no2;
	private ButtonGroup yes_no1;
	private ButtonGroup yes_no2;
	private String[] moguce_oblasti;
	private JComboBox oblastiIT;
	private JPanel panelDugmad1;
	private String[] pohadjanje_faksa;
	private JComboBox faks;
	private JPanel panelDugmad2;
	private JComboBox programski_jezik;
	private String[] jezici;
	private JTextArea output;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;
	private JPanel panel_donji;
	private JPanel panel_za_input;
	private JButton submit;
	private JPanel centralniPanel;
	private JButton obrisi;
	private JRadioButton nema;
	private JRadioButton malo;
	private JScrollPane scroll;
	public RunExpert() {
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Ekspertski panel za programske jezike");
		this.setSize(1400,800);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		canvas = new JPanel();
		canvas.setLayout(new GridLayout(2,1,0,10));
		this.setContentPane(canvas);
		gornjiPanel = new JPanel();
		gornjiPanel.setBorder(new EmptyBorder(10,10,10,10));
		gornjiPanel.setLayout(new GridLayout(1,4,5,10));
		canvas.add(gornjiPanel,BorderLayout.NORTH);
		donjiPanel = new JPanel();
		donjiPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		donjiPanel.setLayout(new GridLayout(1,1,0,5));
		panel_donji = new JPanel();
		panel_donji.setBorder(new EmptyBorder(10,10,10,10));
		panel_donji.setLayout(new GridLayout(1,1));
		donjiPanel.add(panel_donji);
		canvas.add(donjiPanel,BorderLayout.SOUTH);
		lijeviPanel = new JPanel();
		lijeviPanel.setLayout(new GridLayout(1,1));
		lijeviPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		lijeviSredinaPanel = new JPanel();
		lijeviSredinaPanel.setLayout(new GridLayout(1,1));
		lijeviSredinaPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		//lijeviSredinaPanel.setBackground(Color.black);
		//lijeviPanel.setBackground(Color.MAGENTA);
		panel1 = new JPanel();
		panel1.setBorder(new EmptyBorder(10,10,10,10));
		panel1.setLayout(new GridLayout(3,1));
		lijeviPanel.add(panel1);
		gornjiPanel.add(lijeviPanel);
		panel2 = new JPanel();
		panel_za_input = new JPanel();
		panel_za_input.setLayout(new GridLayout(3,1));
		panel2.add(panel_za_input);
		panel2.setBorder(new EmptyBorder(10,10,10,10));
		panel2.setLayout(new GridLayout(3,1));
		lijeviSredinaPanel.add(panel2);
		gornjiPanel.add(lijeviSredinaPanel);
		desniSredinaPanel = new JPanel();
		desniSredinaPanel.setLayout(new GridLayout(1,1,0,10));
		desniSredinaPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		//desniSredinaPanel.setBackground(Color.green);
		desniPanel = new JPanel();
		desniPanel.setLayout(new GridLayout(1,1,0,10));
		desniPanel.setBorder(BorderFactory.createLineBorder(Color.black));
	
		panel3 = new JPanel();
		panel3.setBorder(new EmptyBorder(10,10,10,10));
		panel3.setLayout(new GridLayout(4,1));
		desniSredinaPanel.add(panel3);
		//desniPanel.setBackground(Color.DARK_GRAY);
		//desniPanel.setBackground(Color.cyan);
		gornjiPanel.add(desniSredinaPanel);
		gornjiPanel.add(desniPanel);
		//
		panel4 = new JPanel();
		panel4.setBorder(new EmptyBorder(10,10,10,10));
		panel4.setLayout(new GridLayout(4,1));
		desniPanel.add(panel4);
		//labels
		labeleLijevo[0] = new JLabel();
		labeleLijevo[1] = new JLabel();
		labeleLijevo[2] = new JLabel();
		labeleLijevo[3] = new JLabel();
		labeleLijevo[4] = new JLabel();
		labeleLijevo[5] = new JLabel();
		//integer
		labeleLijevo[0].setText("Unesite Vas broj godina");
		//yes no
		labeleLijevo[1].setText("Koliko godina iskustva imate u IT-u?");
		//dropdown
		labeleLijevo[2].setText("Koja oblast IT-a Vas najvise interesuje?");
		//dropdown
		labeleLijevo[3].setText("Da li ste nekad pohadjali fakultet?");
		//dropdown
		labeleLijevo[4].setText("Odaberite jedan programski jezik koji dobro poznajete?");
		//yes no
		labeleLijevo[5].setText("Da li bi pohadjali fakultet vezan za IT? ");
		//text fields
		//lijepljenje labeli na lijevi panel
		panel1.add(labeleLijevo[0]);
		panel1.add(labeleLijevo[1]);
		panel1.add(labeleLijevo[2]);
		//lijepljenje labeli na srednji desni panel
		panel3.add(labeleLijevo[3]);
		panel3.add(labeleLijevo[4]);
		panel3.add(labeleLijevo[5]);
		obrisi = new JButton("Reset");
		panel3.add(obrisi);
		// ostali kontent
		// text field za integer
		brojGodina = new JTextField();
		//iskustvo radio dugmad
		nema = new JRadioButton("Nemam");
		malo  = new JRadioButton("1-3");
		no1 = new JRadioButton("3-5");
		yes1 = new JRadioButton("6+");
		
		yes_no1 = new ButtonGroup();
		yes_no1.add(nema);
		yes_no1.add(malo);
		yes_no1.add(no1);
		yes_no1.add(yes1);
		// oblasti koje ga interesuju
		moguce_oblasti = new String[]{"Pocetnik sam i nemam definisanu","Web Development","Bussiness Inteligence/Data mining",
		                            "App development","Software Engineering","System testing",
		                            "Game development","Deep Learning/AI/ML","Data science",
		                            "Penetration testing","Ethical hacking"};
		oblastiIT = new JComboBox<String>(moguce_oblasti);
		//dodavanje na lijevi srednji panel
		panel_za_input.add(new JLabel());
		panel_za_input.add(brojGodina);
		panel_za_input.add(new JLabel());
		yes1.setSelected(true);
		panelDugmad1 = new JPanel();
		panelDugmad1.setLayout(new GridLayout(1,4));
		panelDugmad1.add(nema);
		panelDugmad1.add(malo);
		panelDugmad1.add(no1);
		panelDugmad1.add(yes1);
		panel2.add(panelDugmad1);
		panel2.add(oblastiIT);
		//pohadjanje faksa i i lijepljenje na desni panel
		pohadjanje_faksa = new String[] {"Nisam pohadjao/la","Pohadjao/la sam i nijesam zavrsio/la","Pohadjao/la i zavrsio sam",
										"Trenutno pohadjam",
										"Trenutno pohadjam IT fakultet","Pohadjao/la sam IT fakultet i nijesam zavrsio/la",
										"Pohadjao sam IT fakultet i zavrsio/la"};
		faks = new JComboBox<String>(pohadjanje_faksa);
		panel4.add(faks);
		//programski jezik
		jezici = new String[] {"Ne poznajem nijedan", "Python", "JAVA", "C++","JavaScript",
								"Swift","Perl","PHP","C#"};
		programski_jezik = new JComboBox<String>(jezici);
		panel4.add(programski_jezik);
		//radio dugmad i panel za njih
		yes2 = new JRadioButton("Da");
		no2 = new JRadioButton("Ne");
		yes_no2 = new ButtonGroup();
		yes_no2.add(yes2);
		yes_no2.add(no2);
		yes2.setSelected(true);
		panelDugmad2 = new JPanel();
		panelDugmad2.setLayout(new GridLayout(1,2));
		panelDugmad2.add(yes2);
		panelDugmad2.add(no2);
		panel4.add(panelDugmad2);
		submit = new JButton("Submit");
		panel4.add(submit);
		//donji panel i output
		output = new JTextArea();
		output.setFont(new Font("Arial",Font.PLAIN,20));
		output.setEditable(false);
		output.setLineWrap(true);
		output.setWrapStyleWord(true);
		output.append("Predlog od strane sistema za Vas je sledeci: \n\n");
		panel_donji.add(output);
		scroll = new JScrollPane(output,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		panel_donji.add(scroll);
		
		//ogranicenja unosa
		OgranicenjaInputa ogranicenjaInputa = new OgranicenjaInputa();
		
		brojGodina.addKeyListener(ogranicenjaInputa);
		
		
		
		
		//dugmad
		ObradaDugmadi obradaDugmadi = new ObradaDugmadi();
		obrisi.addActionListener(obradaDugmadi);
		submit.addActionListener(obradaDugmadi);
		
		//combobox
		
		faks.addItemListener(new ComboBoxChange());
		
	}
	
	public class OgranicenjaInputa extends KeyAdapter{
		@Override
		public void keyTyped(KeyEvent e) {
			if (e.getSource()==brojGodina) {
				if(!Character.isDigit(e.getKeyChar())) {
					e.consume();
				}
			}
		}
	}
	
	public class ObradaDugmadi implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==obrisi) {
				brojGodina.setText("");
				yes1.setSelected(true);
				oblastiIT.setSelectedIndex(0);
				faks.setSelectedIndex(0);
				yes2.setSelected(true);
				programski_jezik.setSelectedIndex(0);
				output.setText("");
				output.append("Predlog od strane sistema za Vas je sledeci: \n\n");
			}
			if(e.getSource()==submit) {
				try {
					KieServices ks = KieServices.Factory.get();
		    	    KieContainer kContainer = ks.getKieClasspathContainer();
		        	KieSession kSession = kContainer.newKieSession("ksession-rules");
		        	
					Unos unos = new Unos();
					unos.setBrojGodina(Integer.parseInt(brojGodina.getText()));
					if(yes1.isSelected()) {
						unos.setIskustvo("6+");
					}
					if(no1.isSelected()) {
						unos.setIskustvo("3-5");
					}
					if(nema.isSelected()) {
						unos.setIskustvo("Ne");
					}
					if(malo.isSelected()) {
						unos.setIskustvo("1-3");
					}
					unos.setOblast(oblastiIT.getSelectedItem().toString());
					unos.setPohadjanjeFaksa(faks.getSelectedItem().toString());
					unos.setProgramskiJezik(programski_jezik.getSelectedItem().toString());		
					if(yes2.isSelected()) {
						unos.setFaksIt("Da");
					}
					if(no2.isSelected()) {
						unos.setFaksIt("Ne");
					}
					
					//unosenje cinjenica 
					kSession.insert( unos );
					//pokretanje sistema
					kSession.fireAllRules();
					
					//ispisivanje predloga rjesenja
					System.out.println(unos);
					output.append(unos.toString());
					
				}
				catch (Throwable t) {
					t.printStackTrace();
				}
			}
		}
	}
	public class ComboBoxChange implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent event) {
			if(event.getStateChange() == ItemEvent.SELECTED) {
				Object item = event.getItem();
				if (item.toString().equalsIgnoreCase("Trenutno pohadjam IT fakultet")){
					yes2.setSelected(false);
					no2.setSelected(false);
					yes2.setEnabled(false);
					no2.setEnabled(false);
				}
				else {
					yes2.setEnabled(true);
					no2.setEnabled(true);
				}
			}
		}
	}
	
	public static final void main (String[]args) {
		
		 RunExpert runexpert = new RunExpert();
		 runexpert.setVisible(true);
		 
		 
		
		
		
		
	}
}
