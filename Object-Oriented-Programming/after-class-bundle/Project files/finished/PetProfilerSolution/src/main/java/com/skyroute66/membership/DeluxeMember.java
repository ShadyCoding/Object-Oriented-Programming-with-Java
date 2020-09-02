/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skyroute66.membership;

/**
 *
 * @author harrisonkong
 */
public class DeluxeMember extends Member {

    public DeluxeMember(String newName, String newDescription) {
        super(newName, newDescription);
    }
    
    public String membershipDescription() {
        return "Deluxe";
    }
    
    public void showMember() {
         String msg = "";
         
         msg += "ID: " + memberID + "\n";
         msg += "Name: " + memberName + "\n";
         msg += "Bio: " + profileDescription + "\n";
         msg += "\nMembership Type: " + membershipDescription() + "\n";
         msg += "Days Remain: *** Membership does not expire ***\n";
         msg += "\n" + Helper.copyrightNotice;

         javax.swing.JOptionPane.showMessageDialog(null, msg);
    }
    
    public void renewMembership() {
        daysRemain = 999999;
    }
    
}
