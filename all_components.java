import java.awt.*;
public class all_components
{
    all_components()
    {
        Frame f=new Frame();
        Label l=new Label("employee id:");
        l.setBounds(30,70,150,30);
        f.add(l);
        Button b=new Button("Submit");
        b.setBounds(30,130,80,30);
        f.add(b);
        TextArea t=new TextArea();
        t.setBounds(30,180,100,100);
        f.add(t);
        Checkbox c1=new Checkbox("c++");
        c1.setBounds(140,130,50,50);
        f.add(c1);
        Checkbox c2=new Checkbox("java");
        c2.setBounds(190,130,50,50);
        f.add(c2);
        Choice c=new Choice();
        c.setBounds(390, 70, 75, 75);
        c.add("Item 1");
        c.add("Item 2");
        c.add("Item 3");
        c.add("Item 4");
        c.add("Item 5");
        f.add(c);
        MenuBar mb=new MenuBar();
        Menu m=new Menu("Menu");
        Menu submenu=new Menu("Sub Menu");
        MenuItem i1 = new MenuItem("Item 1");
        MenuItem i2 = new MenuItem("Item 2");
        MenuItem i3 = new MenuItem("Item 3");
        MenuItem i4 = new MenuItem("Item 4");
        MenuItem i5 = new MenuItem("Item 5");
        m.add(i1);
        m.add(i2);
        m.add(i3);
        submenu.add(i4); 
        submenu.add(i5);
        m.add(submenu);
        mb.add(m);
        f.setMenuBar(mb);

        Panel panel = new Panel();
        panel.setBounds(30, 400, 80, 80);
        panel.setBackground(Color.gray);
        f.add(panel);

        f.setSize(500, 500);
        f.setTitle("Employee info");
        f.setLayout(null);
        f.setVisible(true);

    }

    public static void main(String args[]) {

        all_components obj = new all_components();




    }
}
