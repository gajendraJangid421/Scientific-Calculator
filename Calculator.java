import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayDeque;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;

public class Calculator {

	private JFrame frmCalculator;
	private JTextField tf_input;
	String text = "", output = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setResizable(false);
		frmCalculator.setTitle("CALCULATOR");
		frmCalculator.setBounds(100, 100, 531, 656);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Scientific Calculator");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setBounds(160, 29, 222, 38);
		frmCalculator.getContentPane().add(lblNewLabel);
		
		tf_input = new JTextField();
		tf_input.setFont(new Font("Courier New", Font.PLAIN, 20));
		tf_input.setBounds(73, 91, 323, 54);
		frmCalculator.getContentPane().add(tf_input);
		tf_input.setColumns(10);
		
		JButton btnNewButton_Dot = new JButton(".");
		btnNewButton_Dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf_input.setText(tf_input.getText() + ".");
			}
		});
		btnNewButton_Dot.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_Dot.setBounds(157, 524, 65, 55);
		frmCalculator.getContentPane().add(btnNewButton_Dot);
		
		JButton btnNewButton_0 = new JButton("0");
		btnNewButton_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf_input.setText(tf_input.getText() + "0");
			}
		});
		btnNewButton_0.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_0.setBounds(232, 524, 65, 55);
		frmCalculator.getContentPane().add(btnNewButton_0);
		
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf_input.setText(tf_input.getText() + "1");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(157, 459, 65, 55);
		frmCalculator.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("2");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf_input.setText(tf_input.getText() + "2");
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.setBounds(232, 459, 65, 55);
		frmCalculator.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("3");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf_input.setText(tf_input.getText() + "3");
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3.setBounds(307, 459, 65, 55);
		frmCalculator.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf_input.setText(tf_input.getText() + "4");
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_4.setBounds(157, 394, 65, 55);
		frmCalculator.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf_input.setText(tf_input.getText() + "5");
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_5.setBounds(232, 394, 65, 55);
		frmCalculator.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf_input.setText(tf_input.getText() + "6");
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_6.setBounds(307, 394, 65, 55);
		frmCalculator.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("7");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf_input.setText(tf_input.getText() + "7");
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_7.setBounds(157, 329, 65, 55);
		frmCalculator.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("8");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf_input.setText(tf_input.getText() + "8");
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_8.setBounds(232, 329, 65, 55);
		frmCalculator.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("9");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf_input.setText(tf_input.getText() + "9");
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_9.setBounds(307, 329, 65, 55);
		frmCalculator.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_Add = new JButton("+");
		btnNewButton_Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf_input.setText(tf_input.getText() + "+");
			}
		});
		btnNewButton_Add.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_Add.setBounds(382, 329, 65, 55);
		frmCalculator.getContentPane().add(btnNewButton_Add);
		
		JButton btnNewButton_Sub = new JButton("-");
		btnNewButton_Sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf_input.setText(tf_input.getText() + "-");
			}
		});
		btnNewButton_Sub.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_Sub.setBounds(382, 394, 65, 55);
		frmCalculator.getContentPane().add(btnNewButton_Sub);
		
		JButton btnNewButton_Mul = new JButton("x");
		btnNewButton_Mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf_input.setText(tf_input.getText() + "*");
			}
		});
		btnNewButton_Mul.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_Mul.setBounds(382, 459, 65, 55);
		frmCalculator.getContentPane().add(btnNewButton_Mul);
		
		JButton btnNewButton_Div = new JButton("/");
		btnNewButton_Div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf_input.setText(tf_input.getText() + "/");
			}
		});
		btnNewButton_Div.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_Div.setBounds(382, 524, 65, 55);
		frmCalculator.getContentPane().add(btnNewButton_Div);
		
		JButton btnNewButton_brac1 = new JButton("(");
		btnNewButton_brac1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf_input.setText(tf_input.getText() + "(");
			}
		});
		btnNewButton_brac1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_brac1.setBounds(82, 459, 65, 55);
		frmCalculator.getContentPane().add(btnNewButton_brac1);

		JButton btnNewButton_brac2 = new JButton(")");
		btnNewButton_brac2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf_input.setText(tf_input.getText() + ")");
			}
		});
		btnNewButton_brac2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_brac2.setBounds(82, 524, 65, 55);
		frmCalculator.getContentPane().add(btnNewButton_brac2);
		
		JButton btnNewButton_cube = new JButton("x\u00B3");
		btnNewButton_cube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text = tf_input.getText();
				
				output = calculate(text);
				
				if(output.equals("error")) {
					JOptionPane.showMessageDialog(null, "Can't be divided by 0", "Warning!!!",2);
				}else {
					tf_input.setText(Math.pow(Double.parseDouble(output), 3)+"");
				}
			}
		});
		btnNewButton_cube.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_cube.setBounds(82, 394, 65, 55);
		frmCalculator.getContentPane().add(btnNewButton_cube);
		
		JButton btnNewButton_sq = new JButton("x\u00B2");
		btnNewButton_sq.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text = tf_input.getText();
				
				output = calculate(text);
				
				if(output.equals("error")) {
					JOptionPane.showMessageDialog(null, "Can't be divided by 0", "Warning!!!",2);
				}else {
					tf_input.setText(Math.pow(Double.parseDouble(output), 2)+"");
				}
			}
		});
		btnNewButton_sq.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_sq.setBounds(82, 329, 65, 55);
		frmCalculator.getContentPane().add(btnNewButton_sq);
		
		JButton btnNewButton_sqrt = new JButton("\u221A");
		btnNewButton_sqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text = tf_input.getText();
				
				output = calculate(text);
				
				if(output.equals("error")) {
					JOptionPane.showMessageDialog(null, "Can't be divided by 0", "Warning!!!",2);
				}else if(output.charAt(0)=='-'){
					JOptionPane.showMessageDialog(null, "Square root of negative number is not possible", "Warning!!!",2);
				}else {
					tf_input.setText(Math.sqrt(Double.parseDouble(output))+"");
				}
			}
		});
		btnNewButton_sqrt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_sqrt.setBounds(82, 264, 65, 55);
		frmCalculator.getContentPane().add(btnNewButton_sqrt);
		
		JButton btnNewButton_ac = new JButton("AC");
		btnNewButton_ac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tf_input.setText("");
			}
		});
		btnNewButton_ac.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_ac.setBounds(82, 199, 65, 55);
		frmCalculator.getContentPane().add(btnNewButton_ac);
		
		JButton btnNewButton_log = new JButton("lg10");
		btnNewButton_log.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text = tf_input.getText();
				
				output = calculate(text);
				
				if(output.equals("error")) {
					JOptionPane.showMessageDialog(null, "Can't be divided by 0", "Warning!!!",2);
				}else if(output.charAt(0)=='-'){
					JOptionPane.showMessageDialog(null, "Log base 10 of negative number is not possible", "Warning!!!",2);
				}else if(Double.parseDouble(output)==0) {
					tf_input.setText("Infinity");
				}else {
					tf_input.setText(Math.log10(Double.parseDouble(output))+"");
				}
			}
		});
		btnNewButton_log.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_log.setBounds(160, 200, 65, 55);
		frmCalculator.getContentPane().add(btnNewButton_log);

		JRadioButton rdbtnRadian = new JRadioButton("Radian");
		rdbtnRadian.setSelected(true);
		rdbtnRadian.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rdbtnRadian.setBounds(275, 162, 82, 21);
		frmCalculator.getContentPane().add(rdbtnRadian);
		
		JRadioButton rdbtnDegree = new JRadioButton("Degree");
		rdbtnDegree.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rdbtnDegree.setBounds(365, 162, 82, 21);
		frmCalculator.getContentPane().add(rdbtnDegree);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnRadian);
		bg.add(rdbtnDegree);
		
		JButton btnNewButton_sin = new JButton("sin");
		btnNewButton_sin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text = tf_input.getText();
				
				output = calculate(text);
				
				if(output.equals("error")) {
					JOptionPane.showMessageDialog(null, "Can't be divided by 0", "Warning!!!",2);
				}else {
					if(rdbtnDegree.isSelected()) {
						output = Math.toRadians(Double.parseDouble(output)) + "";
					}
					
					tf_input.setText(Math.sin(Double.parseDouble(output))+"");
				}
			}
		});
		btnNewButton_sin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_sin.setBounds(232, 199, 65, 55);
		frmCalculator.getContentPane().add(btnNewButton_sin);
		
		JButton btnNewButton_cos = new JButton("cos");
		btnNewButton_cos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text = tf_input.getText();
				
				output = calculate(text);
				
				if(output.equals("error")) {
					JOptionPane.showMessageDialog(null, "Can't be divided by 0", "Warning!!!",2);
				}else {
					if(rdbtnDegree.isSelected()) {
						output = Math.toRadians(Double.parseDouble(output)) + "";
					}
					
					tf_input.setText(Math.cos(Double.parseDouble(output))+"");
				}
			}
		});
		btnNewButton_cos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_cos.setBounds(307, 199, 65, 55);
		frmCalculator.getContentPane().add(btnNewButton_cos);
		
		JButton btnNewButton_tan = new JButton("tan");
		btnNewButton_tan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text = tf_input.getText();
				
				output = calculate(text);
				
				if(output.equals("error")) {
					JOptionPane.showMessageDialog(null, "Can't be divided by 0", "Warning!!!",2);
				}else if(Double.parseDouble(output)==90 || Double.parseDouble(output)==270) {
					tf_input.setText("Infinity");
				}else {
					if(rdbtnDegree.isSelected()) {
						output = Math.toRadians(Double.parseDouble(output)) + "";
					}
					
					tf_input.setText(Math.tan(Double.parseDouble(output))+"");
				}
			}
		});
		btnNewButton_tan.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_tan.setBounds(382, 199, 65, 55);
		frmCalculator.getContentPane().add(btnNewButton_tan);
		
		JButton btnNewButton_asin = new JButton("asin");
		btnNewButton_asin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text = tf_input.getText();
				
				output = calculate(text);
				
				if(output.equals("error")) {
					JOptionPane.showMessageDialog(null, "Can't be divided by 0", "Warning!!!",2);
				}else {
					if(rdbtnDegree.isSelected()) {
						output = Math.toRadians(Double.parseDouble(output)) + "";
					}
					
					tf_input.setText(Math.asin(Double.parseDouble(output))+"");
				}
			}
		});
		btnNewButton_asin.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_asin.setBounds(232, 264, 65, 55);
		frmCalculator.getContentPane().add(btnNewButton_asin);
		
		JButton btnNewButton_acos = new JButton("acos");
		btnNewButton_acos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text = tf_input.getText();
				
				output = calculate(text);
				
				if(output.equals("error")) {
					JOptionPane.showMessageDialog(null, "Can't be divided by 0", "Warning!!!",2);
				}else {
					if(rdbtnDegree.isSelected()) {
						output = Math.toRadians(Double.parseDouble(output)) + "";
					}
					
					tf_input.setText(Math.acos(Double.parseDouble(output))+"");
				}
			}
		});
		btnNewButton_acos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_acos.setBounds(307, 264, 65, 55);
		frmCalculator.getContentPane().add(btnNewButton_acos);
		
		JButton btnNewButton_atan = new JButton("atan");
		btnNewButton_atan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text = tf_input.getText();
				
				output = calculate(text);
				
				if(output.equals("error")) {
					JOptionPane.showMessageDialog(null, "Can't be divided by 0", "Warning!!!",2);
				}else {
					if(rdbtnDegree.isSelected()) {
						output = Math.toRadians(Double.parseDouble(output)) + "";
					}
					
					tf_input.setText(Math.atan(Double.parseDouble(output))+"");
				}
			}
		});
		btnNewButton_atan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_atan.setBounds(382, 264, 65, 55);
		frmCalculator.getContentPane().add(btnNewButton_atan);
		
		JButton btnNewButton_expo = new JButton("e^x");
		btnNewButton_expo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text = tf_input.getText();
				
				output = calculate(text);
				
				if(output.equals("error")) {
					JOptionPane.showMessageDialog(null, "Can't be divided by 0", "Warning!!!",2);
				}else {
					tf_input.setText(Math.exp(Double.parseDouble(output))+"");
				}
			}
		});
		btnNewButton_expo.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_expo.setBounds(157, 265, 65, 55);
		frmCalculator.getContentPane().add(btnNewButton_expo);
		
		JButton btnNewButton_Equal = new JButton("=");
		btnNewButton_Equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text = tf_input.getText();
				
				output = calculate(text);
				
				if(output.equals("error")) {
					JOptionPane.showMessageDialog(null, "Can't be divided by 0", "Warning!!!",2);
				}else {
					tf_input.setText(output);
				}
			}
		});
		btnNewButton_Equal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_Equal.setBounds(307, 524, 65, 55);
		frmCalculator.getContentPane().add(btnNewButton_Equal);
		
		JButton btnNewButton_cl = new JButton("CL");
		btnNewButton_cl.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				StringBuilder sb = new StringBuilder(tf_input.getText());
				
				sb.deleteCharAt(sb.length()-1);
				
				tf_input.setText(sb.toString());
			}
		});
		btnNewButton_cl.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_cl.setBounds(394, 91, 53, 54);
		frmCalculator.getContentPane().add(btnNewButton_cl);
		
	}
	
	public static String calculate(String text) {
		ArrayDeque<Double> stackOfNumber = new ArrayDeque<>();
		ArrayDeque<Character> stackOfSymbol = new ArrayDeque<>();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<text.length();i++) {
			
			if(text.charAt(i)<59 && text.charAt(i)>47 || text.charAt(i)=='.') {
				sb.append(text.charAt(i));
			}else {
				if(sb.length()!=0) {
					stackOfNumber.push(Double.parseDouble(sb.toString()));
					sb.delete(0, sb.length());
				}
				
				if(stackOfSymbol.size()==0) {
					stackOfSymbol.push(text.charAt(i));
				}
				else if(text.charAt(i)==')') {
					while(stackOfSymbol.peek()!='(' && stackOfNumber.size()>1) {
//						System.out.println(stackOfNumber);
//						System.out.println(stackOfSymbol);
						int num1 = solve(stackOfNumber, stackOfSymbol);
						
						if(num1==0) {
							return "error";
						}
					}

					stackOfSymbol.pop();
				}
				else if(text.charAt(i)!='(' && stackOfSymbol.peek()!='(' && precedence(stackOfSymbol.peek())>=precedence(text.charAt(i))) {
//					System.out.println(stackOfNumber);
//					System.out.println(stackOfSymbol);
					
					int num1 = solve(stackOfNumber, stackOfSymbol);
					
					if(num1==0) {
						return "error";
					}
					
//					double num1 = stackOfNumber.pop();
//					double num2 = stackOfNumber.pop();
//					char ch = stackOfSymbol.pop();
//					
//					if(ch=='+') {
//						stackOfNumber.push(num2 + num1);
//					}else if(ch=='-') {
//						stackOfNumber.push(num2 - num1);
//					}else if(ch=='*') {
//						stackOfNumber.push(num2 * num1);
//					}else if(ch=='/'){
//						if(num1==0) {
//							return "error";
//						}
//					else {
//							stackOfNumber.push(num2 / num1);
//						}
//					}
					
					stackOfSymbol.push(text.charAt(i));
				}else {
					stackOfSymbol.push(text.charAt(i));
				}
				
			}

//			System.out.println(stackOfNumber);
//			System.out.println(stackOfSymbol);
		}
		
		if(sb.length()!=0)
			stackOfNumber.push(Double.parseDouble(sb.toString()));
		
//		System.out.println(stackOfNumber);
		
		while(stackOfSymbol.size()!=0) {
			int num1 = solve(stackOfNumber, stackOfSymbol);
			
			if(num1==0) {
				return "error";
			}
			if(num1==-1) {
				break;
			}
			
//			double num1 = stackOfNumber.pop();
//			double num2 = stackOfNumber.pop();
//			char ch = stackOfSymbol.pop();
//			
//			if(ch=='+') {
//				stackOfNumber.push(num2 + num1);
//			}else if(ch=='-') {
//				stackOfNumber.push(num2 - num1);
//			}else if(ch=='*') {
//				stackOfNumber.push(num2 * num1);
//			}else if(ch=='/'){
//				if(num1==0) {
//					return "error";
//				}
//				else {
//					stackOfNumber.push(num2 / num1);
//				}
//			}
		}

//		System.out.println(stackOfNumber);
		
		return String.valueOf(stackOfNumber.peek());
		
//		System.out.println(text);
//		System.out.println(stackOfNumber);
//		System.out.println(stackOfSymbol);
//		return "1";
	}
	
	public static int precedence(char ch) {
		if(ch=='+' || ch=='-') {
			return 1;
		}else if(ch=='*' || ch=='/'){
			return 2;
		}
		
		return 3;
	}
	
	public static int solve(ArrayDeque<Double> stackOfNumber, ArrayDeque<Character> stackOfSymbol) {
//		while(stackOfSymbol.size()!=0) {
		if(stackOfNumber.size()<2) {
			return -1;
		}
			double num1 = stackOfNumber.pop();
			double num2 = stackOfNumber.pop();
			char ch = stackOfSymbol.pop();
			
			if(ch=='+') {
				stackOfNumber.push(num2 + num1);
			}else if(ch=='-') {
				stackOfNumber.push(num2 - num1);
			}else if(ch=='*') {
				stackOfNumber.push(num2 * num1);
			}else if(ch=='/'){
				if(num1==0) {
					return 0;
				}else {
					stackOfNumber.push(num2 / num1);
				}
			}
//		}
			return 100000000;
	}
}
