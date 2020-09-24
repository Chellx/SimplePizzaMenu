package pizzaMenu;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class PizzaMenu extends JFrame implements ItemListener, ActionListener{
	Container contentPane = getContentPane();
	JPanel thePanel1 = new JPanel();
	JPanel thePanel2 = new JPanel();
	JPanel thePanel = new JPanel(new GridLayout(4,2));
	
	JPanel thePanel4 = new JPanel();

	String[] toppings = {"Pepperoni", "Sausage", "Cajun Chicken", "Ham", "Mushroom", "Peppers"};
	
	JCheckBox chk1 = new JCheckBox(toppings[0]);
	JCheckBox chk2 = new JCheckBox(toppings[1]);
	JCheckBox chk3 = new JCheckBox(toppings[2]);
	JCheckBox chk4 = new JCheckBox(toppings[3]);
	JCheckBox chk5 = new JCheckBox(toppings[4]);
	JCheckBox chk6 = new JCheckBox(toppings[5]);
	
	String[] styles = {"Deep Dish", "Thin Crust", "Stuffed Crust"};
	JComboBox box1 = new JComboBox (styles);
	
	ImageIcon tick = new ImageIcon ("C:\\Users\\shell\\Desktop\\Workspace 2019\\PizzaMenu\\src\\pizzaMenu\\tick.png");
	ImageIcon cross = new ImageIcon ("C:\\Users\\shell\\Desktop\\Workspace 2019\\PizzaMenu\\src\\pizzaMenu\\cross.png");
	
	

	
	JButton tickBtn = new JButton (tick);
	JButton crossBtn = new JButton (cross);
	
	JLabel label1 = new JLabel("Al Dente's");
	JLabel label2 = new JLabel("All The Mamma Mia You Can Eat!");
	Font customFont1 = new Font("AvantGarde", Font.PLAIN, 40);
	Font customFont2 = new Font("AvantGarde", Font.PLAIN, 15);
	
	Color customColor = new Color(255,0,0);
	Color customColor2 = new Color(36, 122, 32);
	
	
	Font customFont3 = new Font("AvantGarde", Font.PLAIN, 20);
	
	JTextArea txtArea = new JTextArea(8,50);
	JScrollPane scrollpane = new JScrollPane(txtArea);
	
	JTextArea opTxtArea = new JTextArea(15,25);
	JScrollPane opScrollpane = new JScrollPane(opTxtArea);
	
	
	
	


					public PizzaMenu()
					
					{
						
						
						super("Pizza Menu");
						setSize (800,500);
						setDefaultCloseOperation(EXIT_ON_CLOSE);
						
						add(thePanel);
						
						setVisible(true);
						
						thePanel1.add(label1);
						thePanel1.add(label2);
						label1.setFont(customFont1);
						label2.setFont(customFont2);
						
						
						contentPane.add("North", thePanel1);
						
						thePanel4.add(opScrollpane);
						contentPane.add("East", thePanel4);
						
						
						
						thePanel.add(chk1);
						thePanel.add(chk2);
						thePanel.add(chk3);
						thePanel.add(chk4);
						thePanel.add(chk5);
						thePanel.add(chk6);
						
						
						chk1.addItemListener(this);
						chk2.addItemListener(this);
						chk3.addItemListener(this);
						chk4.addItemListener(this);
						chk5.addItemListener(this);
						chk6.addItemListener(this);
					
						
						thePanel.add(box1);
						
					
						box1.addItemListener(this);
						
						
						
						contentPane.add("Center", thePanel);
						
						thePanel2.add(scrollpane);
						
						
				
						
						
						thePanel2.add(tickBtn);
						thePanel2.add(crossBtn);
						tickBtn.setBackground(Color.WHITE);
						crossBtn.setBackground(Color.WHITE);
						
						contentPane.add("South", thePanel2);
						
						label1.setForeground(customColor);
						label2.setForeground(customColor2);
						
						txtArea.setText("Please Enter Your Address: \n");
						opTxtArea.setText("Your Chosen Pizza Options: \n");
						
						
						tickBtn.addActionListener(this);
						crossBtn.addActionListener(this);
						

					
					
						
					}
					
					
					public void itemStateChanged (ItemEvent event)
					
					{
						if ((event.getItemSelectable()==chk1) && (event.getStateChange()== ItemEvent.SELECTED)) opTxtArea.append("\nPepperoni added\n");
						if ((event.getItemSelectable()==chk2) && (event.getStateChange()== ItemEvent.SELECTED)) opTxtArea.append("\nSausage added\n");
						if ((event.getItemSelectable()==chk3) && (event.getStateChange()== ItemEvent.SELECTED)) opTxtArea.append("\nCajun Chicken added\n");
						if ((event.getItemSelectable()==chk4) && (event.getStateChange()== ItemEvent.SELECTED)) opTxtArea.append("\nHam added\n");
						if ((event.getItemSelectable()==chk5) && (event.getStateChange()== ItemEvent.SELECTED)) opTxtArea.append("\nMushroom added\n");
						if ((event.getItemSelectable()==chk6) && (event.getStateChange()== ItemEvent.SELECTED)) opTxtArea.append("\nPeppers added\n");
						
						
						if ((event.getItemSelectable()==chk1) && (event.getStateChange()== ItemEvent.DESELECTED)) opTxtArea.append("\nPepperoni removed\n");
						if ((event.getItemSelectable()==chk2) && (event.getStateChange()== ItemEvent.DESELECTED)) opTxtArea.append("\nSausage removed\n");
						if ((event.getItemSelectable()==chk3) && (event.getStateChange()== ItemEvent.DESELECTED)) opTxtArea.append("\nCajun Chicken removed\n");
						if ((event.getItemSelectable()==chk4) && (event.getStateChange()== ItemEvent.DESELECTED)) opTxtArea.append("\nHam removed\n");
						if ((event.getItemSelectable()==chk5) && (event.getStateChange()== ItemEvent.DESELECTED)) opTxtArea.append("\nMushroom removed\n");
						if ((event.getItemSelectable()==chk6) && (event.getStateChange()== ItemEvent.DESELECTED)) opTxtArea.append("\nPeppers removed\n");
						
						if ((event.getItemSelectable()==box1) && (event.getStateChange()== ItemEvent.SELECTED)) opTxtArea.append(event.getItem().toString()+ " selected\n");

						
						
						
					}
					
					public void actionPerformed (ActionEvent theEvent)
					{
						if (theEvent.getSource()==tickBtn) JOptionPane.showMessageDialog(this, "Your Order Has Been Received!", "Al Dente's",JOptionPane.INFORMATION_MESSAGE);
						
						
						
						
						
						
						
						if (theEvent.getSource()==crossBtn) JOptionPane.showMessageDialog(this, "Your Order Has Been Cancelled!", "Al Dente's",JOptionPane.WARNING_MESSAGE);
						if (theEvent.getSource()==crossBtn) txtArea.setText("Please Enter Your Address: \n");
						if (theEvent.getSource()==crossBtn) opTxtArea.setText("Your Chosen Pizza Options: \n");
					}
	
	
	
	

	public static void main(String[] args) {
		
		
		PizzaMenu gui = new PizzaMenu();
	

	}

}
