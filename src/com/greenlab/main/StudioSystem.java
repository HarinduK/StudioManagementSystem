/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.greenlab.main;

import com.greenlab.view.LoginForm;

/**
 *
 * @author Zeon-IT
 */
public class StudioSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new LoginForm().setVisible(true);
//            }
//        });

        LoginForm loginForm=new LoginForm();
        loginForm.setVisible(true);
    }
    
}
