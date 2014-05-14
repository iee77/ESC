
 /****************************************************************/ 
 /*                      Main	                            */ 
 /*                                                              */ 
 /****************************************************************/ 
 import java.awt.*; 
 import java.awt.event.*; 
 import javax.swing.*; 
 /** 
  * Summary description for Main 
  * 
  */ 
 public class Main extends JFrame 
 { 
 	// Variables declaration 
 	private JRadioButton jRadioButton1; 
 	private JRadioButton jRadioButton2; 
 	private static JTextArea jTextArea1; 
 	private JButton jButton1; 
 	private JPanel contentPane; 
 	public static String toCrypt;
 	// End of variables declaration 
  
  
 	public Main() 
 	{ 
 		super(); 
 		initializeComponent(); 
 		// 
 		// TODO: Add any constructor code after initializeComponent call 
 		// 
  
 		this.setVisible(true); 
 	} 
  
 	/** 
 	 * This method is called from within the constructor to initialize the form. 
 	 * WARNING: Do NOT modify this code. The content of this method is always regenerated 
 	 * by the Windows Form Designer. Otherwise, retrieving design might not work properly. 
 	 * Tip: If you must revise this method, please backup this GUI file for JFrameBuilder 
 	 * to retrieve your design properly in future, before revising this method. 
 	 */ 
 	private void initializeComponent() 
 	{ 
 		jRadioButton1 = new JRadioButton(); 
 		jRadioButton2 = new JRadioButton(); 
 		setjTextArea1(new JTextArea()); 
 		jButton1 = new JButton(); 
 		contentPane = (JPanel)this.getContentPane(); 
  
 		// 
 		// jRadioButton1 
 		// 
 		jRadioButton1.setText("Decrypt"); 
 		jRadioButton1.addItemListener(new ItemListener() { 
 			public void itemStateChanged(ItemEvent e) 
 			{ 
 				jRadioButton1_itemStateChanged(e); 
 			} 
  
 		}); 
 		// 
 		// jRadioButton2 
 		// 
 		jRadioButton2.setText("Crypt"); 
 		jRadioButton2.addItemListener(new ItemListener() { 
 			public void itemStateChanged(ItemEvent e) 
 			{ 
 				jRadioButton2_itemStateChanged(e); 
 			} 
  
 		}); 
 		// 
 		// jTextArea1 
 		// 
 		// 
 		// jButton1 
 		// 
 		jButton1.setText("Go"); 
 		jButton1.addActionListener(new ActionListener() { 
 			public void actionPerformed(ActionEvent e) 
 			{ 
 				jButton1_actionPerformed(e); 
 			} 
  
 		}); 
 		// 
 		// contentPane 
 		// 
 		contentPane.setLayout(null); 
 		addComponent(contentPane, jRadioButton1, 0,211,100,24); 
 		addComponent(contentPane, jRadioButton2, 1,185,100,24); 
 		addComponent(contentPane, getjTextArea1(), 1,1,374,184); 
 		addComponent(contentPane, jButton1, 279,198,83,28); 
 		// 
 		// Main 
 		// 
 		this.setTitle("Main - extends JFrame"); 
 		this.setLocation(new Point(48, 20)); 
 		this.setSize(new Dimension(390, 270)); 
 	} 
  
 	/** Add Component Without a Layout Manager (Absolute Positioning) */ 
 	private void addComponent(Container container,Component c,int x,int y,int width,int height) 
 	{ 
 		c.setBounds(x,y,width,height); 
 		container.add(c); 
 	} 
  
 	// 
 	// TODO: Add any appropriate code in the following Event Handling Methods 
 	// 
 	private void jRadioButton1_itemStateChanged(ItemEvent e) 
 	{ 
 		jRadioButton2.setSelected(false);
 	} 
  
 	private void jRadioButton2_itemStateChanged(ItemEvent e) 
 	{ 
 		jRadioButton1.setSelected(false);
 	} 
  
 	private void jButton1_actionPerformed(ActionEvent e) 
 	{ 
 		toCrypt = getjTextArea1().getText();
 		if(jRadioButton2.isSelected()) {
 			file.crypt();
 		} else if(jRadioButton1.isSelected()) {
 			file.deCrypt();
 		}
 	} 
  
 	// 
 	// TODO: Add any method code to meet your needs in the following area 
 	// 
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
   
  
 //============================= Testing ================================// 
 //=                                                                    =// 
 //= The following main method is just for testing this class you built.=// 
 //= After testing,you may simply delete it.                            =// 
 //======================================================================// 
 	public static void main(String[] args) 
 	{ 
 		JFrame.setDefaultLookAndFeelDecorated(true); 
 		JDialog.setDefaultLookAndFeelDecorated(true); 
 		try 
 		{ 
 			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); 
 		} 
 		catch (Exception ex) 
 		{ 
 			System.out.println("Failed loading L&F: "); 
 			System.out.println(ex); 
 		} 
 		new Main(); 
 	} 
 //= End of Testing = 

	public static JTextArea getjTextArea1() {
		return jTextArea1;
	}

	public void setjTextArea1(JTextArea jTextArea1) {
		this.jTextArea1 = jTextArea1;
	}
  
  
 } 
  
 