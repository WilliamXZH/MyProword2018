package com.jkxy.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.jkxy.main.ChatManager;

import javax.swing.JTextArea;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainWindow extends JFrame {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private JPanel contentPane; 
    JTextArea txt;
    private JTextField ip;
    private JTextField send;

    /**
     * Launch the application.
     */

    /**
     * Create the frame.
     */
    public MainWindow() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        
        txt = new JTextArea();
        txt.setText("Ready...");
        
        ip = new JTextField();
        ip.setText("127.0.0.1");
        ip.setColumns(10);
        
        JButton btnNewButton = new JButton("\u8FDE\u63A5\u5230\u670D\u52A1\u5668");
        btnNewButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ChatManager.getCM().connect(ip.getText());
            }
        });
        
        send = new JTextField();
        send.setText("\u4F60\u597D....");
        send.setColumns(10);
        
        JButton btnNewButton_1 = new JButton("\u53D1\u9001");
        btnNewButton_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ChatManager.getCM().send(send.getText());
                appendText("Œ“Àµ£∫"+send.getText());
                send.setText("");
            }
        });
        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
            gl_contentPane.createParallelGroup(Alignment.LEADING)
                .addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
                        .addComponent(txt, GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                        .addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
                            .addComponent(ip, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE)
                            .addGap(18)
                            .addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
                            .addComponent(send, GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE)
                            .addGap(18)
                            .addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))
                    .addContainerGap())
        );
        gl_contentPane.setVerticalGroup(
            gl_contentPane.createParallelGroup(Alignment.TRAILING)
                .addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                        .addComponent(btnNewButton)
                        .addComponent(ip, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(txt, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addGap(69)
                    .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                        .addComponent(send, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                    .addContainerGap())
        );
        contentPane.setLayout(gl_contentPane);
    }
    
    public void appendText(String in){
        txt.append("\n"+in);
    }
}
