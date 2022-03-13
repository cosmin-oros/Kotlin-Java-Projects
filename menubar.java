package Tutorial;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;

public class menubar extends JFrame implements ActionListener {
    JMenuItem loadItem;
    JMenuBar menu;
    JMenu fileMenu;
    menubar(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        menu = new JMenuBar();
        fileMenu = new JMenu("File");
        this.setJMenuBar(menu);
        loadItem = new JMenuItem("Load");
        loadItem.addActionListener(this);
        fileMenu.add(loadItem);
        menu.add(fileMenu);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==loadItem){
            System.out.println("da");
        }
    }
}
