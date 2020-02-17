import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  
  
class OnlineTest7 extends JFrame implements ActionListener  
{  
    JLabel l;  
    JRadioButton jb[]=new JRadioButton[5];  
    JButton b1,b2;  
    ButtonGroup bg;  
    int count=0,current=0,x=1,y=1,now=0;  
    int m[]=new int[10];      
    OnlineTest7(String s)  
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
            l.setText("Que1: Which of the following is a basic structure of a vascular plant?");  
            jb[0].setText("Leaf");jb[1].setText("Stem");jb[2].setText("Roots");jb[3].setText("  All of the above");   
        } //d 
        if(current==1)  
        {  
            l.setText("Que2: Which structure of the plant supports the plant and has tissues that move food and water around the plant?");  
            jb[0].setText("Leaf");jb[1].setText("Stem");jb[2].setText("Roots");jb[3].setText("  All of the above");  
        }  //b
        if(current==2)  
        {  
            l.setText("Que3: Which structure of the plant grows underground and keeps the plant from falling over?");  
            jb[0].setText("Leaf");jb[1].setText("Stem");jb[2].setText("Roots");jb[3].setText("  All of the above");  
        }  //c
        if(current==3)  
        {  
            l.setText("Que4: Which structure of the plant is designed to capture sunlight and carbon dioxide for photosynthesis?");  
            jb[0].setText("Leaf");jb[1].setText("Stem");jb[2].setText("Roots");jb[3].setText("  All of the above");  
        }  //a
        if(current==4)  
        {  
            l.setText("Que5: Which of the following is an example of a nonvascular plant?");  
            jb[0].setText("  Oak tree");jb[1].setText("Rose bush");jb[2].setText("Pine tree");jb[3].setText("Moss");  
        }  //d
         
        l.setBounds(30,40,450,20);  
        for(int i=0,j=0;i<=90;i+=30,j++)  
            jb[j].setBounds(50,80+i,200,20);  
    }  
    boolean check()  
    {  
        if(current==0)  
            return(jb[3].isSelected());  
        if(current==1)  
            return(jb[1].isSelected());  
        if(current==2)  
            return(jb[2].isSelected());  
        if(current==3)  
            return(jb[0].isSelected());  
        if(current==4)  
            return(jb[3].isSelected());   
        return false;  
    }  
     
}  