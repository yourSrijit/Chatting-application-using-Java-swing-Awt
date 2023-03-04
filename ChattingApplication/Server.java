package ChattingApplication;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Server extends JFrame implements ActionListener{
	private int a;
	Server(){
		 setLayout(null);
		 JPanel p=new JPanel();
		 p.setBackground(new Color(7,94,84));
		 p.setBounds(0,0,450,70);
		 add(p);
		 
		 ImageIcon i =new ImageIcon(ClassLoader.getSystemResource("icons/3.png"));
		 Image i1=i.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		 ImageIcon i2=new ImageIcon(i1);
		 JLabel back =new JLabel(i2);
		 back.setBounds(5,20,25,25);
		 p.setLayout(null);
		 p.add(back);
		 
		 back.addMouseListener(new MouseAdapter() {
			 public void mouseClicked(MouseEvent ae) {
				System.exit(0);
			}
		});
		 
		 ImageIcon i3 =new ImageIcon(ClassLoader.getSystemResource("icons/2.png"));
		 Image i4=i3.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
		 ImageIcon i5=new ImageIcon(i4);
		 JLabel profile1 =new JLabel(i5);
		 profile1.setBounds(40,10,50,50);
		 p.add(profile1);
		 
		 
		 ImageIcon i6 =new ImageIcon(ClassLoader.getSystemResource("icons/video.png"));
		 Image i7=i6.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
		 ImageIcon i8=new ImageIcon(i7);
		 JLabel vid =new JLabel(i8);
		 vid.setBounds(300,20,30,30);
//		 p.setLayout(null);
		 p.add(vid);
		 
		 ImageIcon i9 =new ImageIcon(ClassLoader.getSystemResource("icons/phone.png"));
		 Image i10=i9.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
		 ImageIcon i11=new ImageIcon(i10);
		 JLabel phn =new JLabel(i11);
		 phn.setBounds(360,20,30,30);
		 p.add(phn);
		 
		 ImageIcon i12 =new ImageIcon(ClassLoader.getSystemResource("icons/3icon.png"));
		 Image i13=i12.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
		 ImageIcon i14=new ImageIcon(i13);
		 JLabel dot3 =new JLabel(i14);
		 dot3.setBounds(395,20,30,30);
		 p.add(dot3);
		 
		 JLabel name1=new JLabel("Kamalika");
		 name1.setBounds(110,22,100,29);
		 name1.setForeground(Color.white);
		 name1.setFont(new Font("SAN_SARIF",Font.BOLD,20));
		 p.add(name1);		
		 
		 JLabel status=new JLabel("Active now");
		 status.setBounds(110,40,100,29);
		 status.setForeground(Color.white);
		 status.setFont(new Font("SAN_SARIF",Font.BOLD,10));
		 p.add(status);
		 
		 
		 	JPanel a1=new JPanel();
		 	a1.setBounds(5,75,440,570);
		 	add(a1);
		 	
		 	JTextField text =new JTextField();
		 	text.setBounds(5,655,310,40);
		 	text.setFont(new Font("SAN_SARIF",Font.PLAIN,18));
		 	add(text);
		 	
		 	JButton send =new JButton("Send");
		 	send.setBounds(320,655,123,40);

		 	add(send);
		 	
		 setSize(450,700);
		setLocation(200,50);
		setUndecorated(true);
		getContentPane().setBackground(Color.white);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Server s=new Server();
	}

}
