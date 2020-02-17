import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  
  
class OnlineTest2 extends JFrame implements ActionListener  
{  
    JLabel l;  
    JRadioButton jb[]=new JRadioButton[5];  
    JButton b1,b2;  
    ButtonGroup bg;  
    int count=0,current=0,x=1,y=1,now=0;  
    int m[]=new int[10];      
    OnlineTest2(String s)  
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
            l.setText("Que1: What does DNA stand for?");  
            jb[0].setText("Double nitrogen argon");jb[1].setText("Dioxide nickel acid");jb[2].setText("Deoxyribonucleic acid");jb[3].setText("non of these");   
        }  //c
        if(current==1)  
        {  
            l.setText("Que2: How many types of nucleotides are there in DNA?");  
            jb[0].setText("one");jb[1].setText("two");jb[2].setText("three");jb[3].setText("four");  
        }  //d
        if(current==2)  
        {  
            l.setText("Que3: Which of the following is not a letter that represents a nucleotide in DNA?");  
            jb[0].setText("R");jb[1].setText("G");jb[2].setText("C");jb[3].setText("T");  
        }  //a
        if(current==3)  
        {  
            l.setText("Que4: Three letters of DNA nucleotides make up a word called a _____.");  
            jb[0].setText("Codon");jb[1].setText("Chromosome");jb[2].setText("Nucleus");jb[3].setText("  Cell");  
        }  //a
        if(current==4)  
        {  
            l.setText("Que5: What is another name for the nucleotides in DNA?");  
            jb[0].setText("Chromosomes");jb[1].setText("Bases");jb[2].setText("Genes");jb[3].setText("Backbone");  
        }  //b 
         
        l.setBounds(30,40,450,20);  
        for(int i=0,j=0;i<=90;i+=30,j++)  
            jb[j].setBounds(50,80+i,200,20);  
    }  
    boolean check()  
    {  
        if(current==0)  
            return(jb[2].isSelected());  
        if(current==1)  
            return(jb[3].isSelected());  
        if(current==2)  
            return(jb[0].isSelected());  
        if(current==3)  
            return(jb[0].isSelected());  
        if(current==4)  
            return(jb[1].isSelected());   
        return false;  
    }  
     
}  