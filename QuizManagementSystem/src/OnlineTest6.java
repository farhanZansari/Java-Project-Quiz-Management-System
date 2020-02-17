import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  
  
class OnlineTest6 extends JFrame implements ActionListener  
{  
    JLabel l;  
    JRadioButton jb[]=new JRadioButton[5];  
    JButton b1,b2;  
    ButtonGroup bg;  
    int count=0,current=0,x=1,y=1,now=0;  
    int m[]=new int[10];      
    OnlineTest6(String s)  
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
            l.setText("Que1: What is the name of the process used by most plants to make their food from sunlight?");  
            jb[0].setText(" Water cycle");jb[1].setText("Decomposition");jb[2].setText("Absorption");jb[3].setText("Photosynthesis");   
        }  //d
        if(current==1)  
        {  
            l.setText("Que2: What type of cells do plants have?");  
            jb[0].setText("Eukaryotic");jb[1].setText("Monocyte");jb[2].setText("Osteoclast");jb[3].setText("Prokaryotic");  
        }  //a
        if(current==2)  
        {  
            l.setText("Que3: What is the waxy layer on the surface of plants called?");  
            jb[0].setText("Spore");jb[1].setText("Leaf");jb[2].setText("Cuticle");jb[3].setText("Vacuole");  
        }  //c
        if(current==3)  
        {  
            l.setText("Que4: What structures inside plant cells help with photosynthesis?");  
            jb[0].setText("Nucleus");jb[1].setText("Ribosomes");jb[2].setText("Chloroplasts");jb[3].setText("Lysosomes");  
        }  //c
        if(current==4)  
        {  
            l.setText("Que5:  Which of the following describes a vascular plant?");  
            jb[0].setText("A plant with specific tissues to move materials such as water through the plant");jb[1].setText("  A plant that uses diffusion and osmosis to move material through the plant");
            jb[2].setText(" ");jb[3].setText(" ");  
        }  //a  
         
        l.setBounds(30,40,450,20);  
        for(int i=0,j=0;i<=90;i+=30,j++)  
            jb[j].setBounds(50,80+i,200,20);  
    }  
    boolean check()  
    {  
        if(current==0)  
            return(jb[3].isSelected());  
        if(current==1)  
            return(jb[0].isSelected());  
        if(current==2)  
            return(jb[2].isSelected());  
        if(current==3)  
            return(jb[2].isSelected());  
        if(current==4)  
            return(jb[0].isSelected());   
        return false;  
    }  
     
}  