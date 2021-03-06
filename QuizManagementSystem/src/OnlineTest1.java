import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  
  
class OnlineTest1 extends JFrame implements ActionListener  
{  
	quizManagement q;
    JLabel l;  
    JRadioButton jb[]=new JRadioButton[5];  
    JButton b1,b2;  
    ButtonGroup bg;  
    int count=0,current=0,x=1,y=1,now=0;  
    int m[]=new int[10];      
    OnlineTest1(String s)  
    {  
        super(s);  
        l=new JLabel();  
        add(l);  
        bg=new ButtonGroup();  
        for(int i=0;i<5;i++)  
        {  
            jb[i]=new JRadioButton();     
            add(jb[i]);  
            bg.add(jb[i]);  
        }  
        b1=new JButton("Next");  
        b2=new JButton("Result");  
        b1.addActionListener(this);  
        b2.addActionListener(this);  
        add(b1);add(b2);   
        l.setBounds(30,40,450,20);  
        jb[0].setBounds(50,80,100,20);  
        jb[1].setBounds(50,110,100,20);  
        jb[2].setBounds(50,140,100,20);  
        jb[3].setBounds(50,170,100,20);  
        b1.setBounds(100,240,100,30);  
        b2.setBounds(270,240,100,30);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setLayout(null);  
        setLocation(250,100);  
        setVisible(true);  
        setSize(600,350);  
    }  
    public void actionPerformed(ActionEvent e)  
    {  
        if(e.getSource()==b1)  
        {  
            if(check())  
                count=count+1;  
            current++;  
            set();    
            if(current==4)  
            {  
                b1.setEnabled(false);  
                b2.setText("Result");  
            }  
        }  
      
        if(e.getActionCommand().equals("Result"))  
        {  
            if(check())  
                count=count+1;  
            current++;  
            JOptionPane.showMessageDialog(this,"correct ans="+count);  
            q.selectSubject(q.showMenuOptions());
            //System.exit(0);  
        }  
    }  
    void set()  
    {  
    	jb[4].setSelected(true);  
        if(current==0)  
        {  
            l.setText("Que1: Maurice Wilkins and Rosalind Franklin determine structure of DNA using technique called");  
            jb[0].setText("X-ray Diffraction");jb[1].setText("X-ray Refraction");jb[2].setText("X-ray Reflection");jb[3].setText("Y-ray Refraction");   
        }  //a
        if(current==1)  
        {  
            l.setText("Que2: Retroviruses can convert a single stranded RNA genome into double stranded viral DNA by special enzyme");  
            jb[0].setText("Transcriptase");jb[1].setText("Reverse transcriptase");jb[2].setText("Auto Transcriptase");jb[3].setText("Catalase");  
        }  //b
        if(current==2)  
        {  
            l.setText("Que3: A chromosome is composed of a DNA and");  
            jb[0].setText("lipids");jb[1].setText("proteins");jb[2].setText("gene");jb[3].setText("sugars");  
        }  //b
        if(current==3)  
        {  
            l.setText("Que4: If viral DNA is detached from host's chromosome, it leads to beginning of lytic cycle called");  
            jb[0].setText("invasion");jb[1].setText("development");jb[2].setText("induction");jb[3].setText("convection");  
        }  //c
        if(current==4)  
        {  
            l.setText("Que5: Two strands of DNA is a double helix structure, coiled with each other as");  
            jb[0].setText("parallel");jb[1].setText("ant parallel");jb[2].setText("opposite");jb[3].setText("connected");  
        }  //b
         
        l.setBounds(30,40,450,20);  
        for(int i=0,j=0;i<=90;i+=30,j++)  
            jb[j].setBounds(50,80+i,200,20);  
    }  
    boolean check()  
    {  
        if(current==0)  
            return(jb[0].isSelected());  
        if(current==1)  
            return(jb[1].isSelected());  
        if(current==2)  
            return(jb[1].isSelected());  
        if(current==3)  
            return(jb[2].isSelected());  
        if(current==4)  
            return(jb[1].isSelected());   
        return false;  
    }  
     
}  