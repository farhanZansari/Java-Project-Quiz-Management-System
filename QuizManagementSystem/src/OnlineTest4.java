import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  
  
class OnlineTest4 extends JFrame implements ActionListener  
{  
    JLabel l;  
    JRadioButton jb[]=new JRadioButton[5];  
    JButton b1,b2;  
    ButtonGroup bg;  
    int count=0,current=0,x=1,y=1,now=0;  
    int m[]=new int[10];      
    OnlineTest4(String s)  
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
            l.setText("Que1: What three things do plants need for the process of photosynthesis?");  
            jb[0].setText(" Sunlight, oxygen, and sugar");jb[1].setText("Water, soil, and oxygen");jb[2].setText("Sunlight, carbon dioxide, and water");jb[3].setText("Carbon dioxide, oxygen, and soil");   
        }  //c
        if(current==1)  
        {  
            l.setText("Que2: If plants breathe in carbon dioxide, what do they breathe out?");  
            jb[0].setText("Nitrogen");jb[1].setText("Oxygen");jb[2].setText("Carbon monoxide");jb[3].setText(" Hydrogen");  
        }  //b
        if(current==2)  
        {  
            l.setText("Que3: What is the compound that plants use to absorb the energy from light?");  
            jb[0].setText("H2O");jb[1].setText("Nitrogen");jb[2].setText("DNA");jb[3].setText("Chlorophyll");  
        }  //d
        if(current==3)  
        {  
            l.setText("Que4: What color is chlorophyll");  
            jb[0].setText("Red");jb[1].setText("Blue");jb[2].setText("Yellow");jb[3].setText("Green");  
        }  //d
        if(current==4)  
        {  
            l.setText("Que5: What is the name of the chemical where the energy is stored during the first phase of photosynthesis?");  
            jb[0].setText("ATP");jb[1].setText("Carbon dioxide");jb[2].setText("Chlorophyll");jb[3].setText("Oxygen");  
        }  //a  
         
        l.setBounds(30,40,450,20);  
        for(int i=0,j=0;i<=90;i+=30,j++)  
            jb[j].setBounds(50,80+i,200,20);  
    }  
    boolean check()  
    {  
        if(current==0)  
            return(jb[2].isSelected());  
        if(current==1)  
            return(jb[1].isSelected());  
        if(current==2)  
            return(jb[3].isSelected());  
        if(current==3)  
            return(jb[3].isSelected());  
        if(current==4)  
            return(jb[0].isSelected());   
        return false;  
    }  
     
}  