package hostelapp.gui;

import javax.swing.*;
import java.awt.*;

public class GuestGui {

    private JFrame jFrame;
    private JPanel jPanel;

    private JLabel jLabelFormTitle;
    private JLabel jLabelFooter;
    private JLabel jLabelTitle;

    private JLabel jLabelName;
    private JTextField jTextFieldName;



    public GuestGui(){
        jFrame = new JFrame("Create Guest");
        jPanel = new JPanel();
        jLabelFormTitle = new JLabel("Guest Form");
        jLabelFooter = new JLabel("Hostel App");

        jLabelName = new JLabel("First Name");
        jTextFieldName = new JTextField(40);

    }
    /**
     * Tá funcionando, mas não do jeito desejado (não consegui adicionar o titulo da caixa de texto)
     *
     *
     */
    public void buildGUI(){
        jFrame.setSize(1080,720);
        jFrame.setResizable(false);
        jFrame.setVisible(true);

        jPanel.add(jPanel, BorderLayout.CENTER);

        jPanel.add(jLabelFormTitle);
        jFrame.add(jLabelFormTitle, BorderLayout.NORTH);

        jPanel.add(jLabelName);
        jFrame.add(jLabelName,BorderLayout.NORTH);
        jPanel.add(jTextFieldName);
        jFrame.add(jTextFieldName,BorderLayout.NORTH);




    }



    public static void main(String[] args) {
        GuestGui guestGui = new GuestGui();
        guestGui.buildGUI();
    }
}
