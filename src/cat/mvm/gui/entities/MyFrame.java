package cat.mvm.gui.entities;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame{
    private JButton jbtAceptar;
    private JLabel jlbFirstName;
    private JLabel jlbLastName;
    private JLabel jlbPosition;
    private JTextField jtfFirstName;
    private JTextField jtfLastName;
    private JTextField jtfPosition;

    public MyFrame(){
        /*Toolkit screen = Toolkit.getDefaultToolkit();
        Dimension screenSize = screen.getScreenSize();
        int screenHeight = screenSize.height;
        int screeWidth = screenSize.width;
        this.setSize(screeWidth/2, screenHeight/2);
        this.setLocation(screeWidth/4, screenHeight/4);

        this.setTitle("Name and position");
        JSplitPane mainPannel =
                new JSplitPane(JSplitPane.VERTICAL_SPLIT);
        this.getContentPane().add(mainPannel);*/
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,500);
        this.setLocation(500, 100);
        this.setTitle("Name and position");
        initComponents();
    }

    private void initComponents() {
        jlbFirstName = new JLabel();
        jlbLastName = new JLabel();
        jlbPosition = new JLabel();
        jtfFirstName = new JTextField();
        jtfLastName = new JTextField();
        jtfPosition = new JTextField();
        jbtAceptar = new JButton();

        getContentPane().setLayout(null);

        jlbFirstName.setText("First Name");
        getContentPane().add(jlbFirstName);
        jlbFirstName.setBounds(12, 28, 116, 14);

        jtfFirstName.setHorizontalAlignment(JTextField.RIGHT);
        /*jtfFirstName.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                jtfFirstNamefocusGained(e);
            }
        });
        jtfFirstName.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                jtfFirstNamekeyTyped(e);
            }
        });*/
        getContentPane().add(jtfFirstName);
        jtfFirstName.setBounds(120, 28, 350, 20 );
    }
}
