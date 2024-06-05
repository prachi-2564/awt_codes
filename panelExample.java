import java.awt.*;
public class panelExample 
{
    panelExample()
    {
        Frame f=new Frame("panel example");
        Panel p=new Panel();
        p.setBounds(40,80,200,200);
        p.setBackground(Color.gray);
        Button b1=new Button("button 1");
        b1.setBounds(50,100,80,30);
        b1.setBackground(Color.pink);
        Button b2=new Button("button 1");
        b2.setBounds(50,100,80,30);
        b2.setBackground(Color.yellow);
        p.add(b1);
        p.add(b2);
        f.add(p);
        f.setSize(400,400);    
        f.setLayout(null);    
        f.setVisible(true); 
         }
    public static void main(String args[])  
        {  
            panelExample obj = new panelExample();
        }
    }
