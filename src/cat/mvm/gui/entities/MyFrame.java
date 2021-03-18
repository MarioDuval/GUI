package cat.mvm.gui.entities;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame{
    private JButton jbtOK;
    private JLabel jlbFirstName;
    private JLabel jlbLastName;
    private JLabel jlbPosition;
    private JTextField jtfFirstName;
    private JTextField jtfLastName;
    private JTextField jtfPosition;
    private JTextArea jtaData;
    private JButton jbtClear;
    private Object objTextField;

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
        jbtOK = new JButton();
        jtaData = new JTextArea();
        jbtClear = new JButton();

        getContentPane().setLayout(null);

        jlbFirstName.setText("First Name");
        getContentPane().add(jlbFirstName);
        jlbFirstName.setBounds(12, 28, 116, 14);

        jtfFirstName.setHorizontalAlignment(JTextField.LEFT);
        jtfFirstName.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                jtfFirstNamefocusGained(e);
            }
        });
        jtfFirstName.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                jtfFirstNameKeyTyped(e);
            }
        });
        getContentPane().add(jtfFirstName);
        jtfFirstName.setBounds(80, 25, 350, 20 );

        jlbLastName.setText("Last Name");
        getContentPane().add(jlbLastName);
        jlbLastName.setBounds(12, 68, 104, 24);

        jtfLastName.setHorizontalAlignment(JTextField.LEFT);
        jtfLastName.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                jtfLastNameFocusGained(e);
            }
        });
        jtfLastName.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                jtfLastNameKeyTyped(e);
            }
        });
        getContentPane().add(jtfLastName);
        jtfLastName.setBounds(80, 70, 350, 20);

        jlbPosition.setText("Position");
        getContentPane().add(jlbPosition);
        jlbPosition.setBounds(12, 108, 104, 24);

        jtfPosition.setHorizontalAlignment(JTextField.LEFT);
        jtfPosition.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                jtfPositionFocusGained(e);
            }
        });
        jtfPosition.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                jtfPositionKeyTyped(e);
            }
        });
        getContentPane().add(jtfPosition);
        jtfPosition.setBounds(80, 112, 350, 20);

        jbtOK.setText("OK");
        jbtOK.setMnemonic('O');
        getRootPane().setDefaultButton(jbtOK);
        getContentPane().add(jbtOK);
        jbtOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jbtOKActionPerformed(e);
            }
        });
        jbtOK.setBounds(355, 160, 75, 24);


        getContentPane().add(jtaData);
        jtaData.setBounds(12, 200,550, 200);

        jbtClear.setText("Clear");
        jbtClear.setMnemonic('C');
        getRootPane().setDefaultButton(jbtClear);
        getContentPane().add(jbtClear);
        jbtClear.setBounds(487, 410, 75,24);

    }

    private void jtfDataKeyTyped(KeyEvent evt) { objTextField = evt.getSource(); }

    private void jtfDataFocusGained(FocusEvent evt) {
        JTextField objEnfocado = (JTextField) evt.get
    }
}
