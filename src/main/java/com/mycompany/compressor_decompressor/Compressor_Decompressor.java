/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.compressor_decompressor;
import com_decom.compressor;
import com_decom.decompress;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class Compressor_Decompressor extends JFrame implements ActionListener{
    JButton compressB;
    JButton decompressB;
    
    Compressor_Decompressor(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        compressB=new JButton("Select file to compress");
        compressB.setBounds(20,100,100,30);
        compressB.addActionListener(this);
        
        decompressB=new JButton("Select file to decompress");
        decompressB.setBounds(50,150,100,30);
        decompressB.addActionListener(this);
        
        this.add(compressB);
        this.add(decompressB);
        
        this.setSize(1000,500);
        this.getContentPane().setBackground(Color.green);
        this.setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==compressB){
            JFileChooser fc=new JFileChooser();
            int response=fc.showSaveDialog(null);
            if(response == JFileChooser.APPROVE_OPTION){
                File file=new File(fc.getSelectedFile().getAbsolutePath());
                System.out.print(file);
                try{
                    compressor.method(file);
                }
                catch(Exception ee){
                    JOptionPane.showMessageDialog(null,ee.toString());
                }
            }
             if(response == JFileChooser.APPROVE_OPTION){
                File file=new File(fc.getSelectedFile().getAbsolutePath());
                System.out.print(file);
                try{
                    decompress.method(file);
                }
                catch(Exception ee){
                    JOptionPane.showMessageDialog(null,ee.toString());
                }
            }
        }
    }
    public static void main(String[] args) {
        Compressor_Decompressor frame=new Compressor_Decompressor();
    }
}
