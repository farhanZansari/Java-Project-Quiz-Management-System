import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  
  
class OnlineTest extends JFrame implements ActionListener  
{  
    JLabel l;  
    JRadioButton jb[]=new JRadioButton[5];  
    JButton b1,b2;  
    ButtonGroup bg;  
    int count=0,current=0,x=1,y=1,now=0;  
    int m[]=new int[10];      
    OnlineTest(String s)  
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
        b2=new JButton("Bookmark");  
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
            //System.out.println("correct ans="+count);  
            JOptionPane.showMessageDialog(this,"correct ans="+count);  
            System.exit(0);  
        }  
    }  
    void set()  
    {  
        jb[4].setSelected(true);  
        if(current==0)  
        {  
            l.setText("Que1: Considering Deoxyribonucleic Acid (DNA) structure, backbone outside double helix is made up of");  
            jb[0].setText("sugar and nitrogen");jb[1].setText("nitrogen and carbon");jb[2].setText("phosphate and sugar");jb[3].setText("phosphate and nitrogen");   
        }  //c
        if(current==1)  
        {  
            l.setText("Que2: Considering Deoxyribonucleic Acid (DNA) structure, inside basis of double helix is made up of");  
            jb[0].setText("nitrogen");jb[1].setText("oxygen");jb[2].setText("phosphorus");jb[3].setText("magnesium");  
        }  //a
        if(current==2)  
        {  
            l.setText("Que3: Deoxyribonucleic Acid (DNA) structure was proposed in");  
            jb[0].setText("1949");jb[1].setText("1963");jb[2].setText("1958");jb[3].setText("1953");  
        }	//  d
        if(current==3)  
        {  
            l.setText("Que4: Scientists who proposed Deoxyribonucleic Acid (DNA) structures are");  
            jb[0].setText("Francis Crick and James Watson");jb[1].setText("James Crick and Francis Watson");jb[2].setText("Marie Curie and Niels Bohr");jb[3].setText("Nikola Tesla and Marie Curie");  
        } // a
        if(current==4)  
        {  
            l.setText("Que5: Sequence of amino acids (R-CH(NH2)-COOH) of Deoxyribonucleic Acid (DNA) is controlled by sequence of");  
            jb[0].setText("dominant proteins");jb[1].setText("nucleosomes");jb[2].setText("nucleotides");jb[3].setText("chromatin");  
        }  //c
         
        l.setBounds(30,40,450,20);  
        for(int i=0,j=0;i<=90;i+=30,j++)  
            jb[j].setBounds(50,80+i,200,20);  
    }  
    boolean check()  
    {  
        if(current==0)  
            return(jb[2].isSelected());  
        if(current==1)  
            return(jb[0].isSelected());  
        if(current==2)  
            return(jb[3].isSelected());  
        if(current==3)  
            return(jb[0].isSelected());  
        if(current==4)  
            return(jb[2].isSelected());   
        return false;  
    }  
     
}  