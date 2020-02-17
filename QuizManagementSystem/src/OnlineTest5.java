import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  
  
class OnlineTest5 extends JFrame implements ActionListener  
{  
    JLabel l;  
    JRadioButton jb[]=new JRadioButton[5];  
    JButton b1,b2;  
    ButtonGroup bg;  
    int count=0,current=0,x=1,y=1,now=0;  
    int m[]=new int[10];      
    OnlineTest5(String s)  
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
            l.setText("Que1:  What is the Calvin Cycle");  
            jb[0].setText("The second phase of photosynthesis");jb[1].setText(" Where energy from sunlight is stored in ATP");jb[2].setText("Another name for the water cycle");jb[3].setText("All of the above");   
        }  //a
        if(current==1)  
        {  
            l.setText("Que2: True or False: All plants need the same amount of sun to make enough food to be healthy.");  
            jb[0].setText("TRUE");jb[1].setText("FALSE");jb[2].setText(" ");jb[3].setText(" ");  
        }  //b
        if(current==2)  
        {  
            l.setText("Que3: What are the structures inside plant cells that contain chlorophyll called?");  
            jb[0].setText("Nucleus");jb[1].setText("Ribosomes");jb[2].setText("Chloroplasts");jb[3].setText("Lysosomes");  
        }  //c
        if(current==3)  
        {  
            l.setText("Que4: True or False: Sunlight is not needed during the Calvin Cycle phase of photosynthesis.");  
            jb[0].setText("TRUE");jb[1].setText("FALSE");jb[2].setText(" ");jb[3].setText(" ");  
        }  //a
        if(current==4)  
        {  
            l.setText("Que5: True or False: Photosynthesis is responsible for the world's oxygen supply which is needed for animals to survive.");  
            jb[0].setText("TRUE");jb[1].setText("FALSE");jb[2].setText(" ");jb[3].setText(" ");  
        }  //a  
         
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
            return(jb[2].isSelected());  
        if(current==3)  
            return(jb[0].isSelected());  
        if(current==4)  
            return(jb[0].isSelected());   
        return false;  
    }  
     
}  