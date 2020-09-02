package com.skyroute66.membership;

public class BasicMember extends Member {

    public BasicMember(String newName, String newDescription) {
        super(newName, newDescription);
    }
 
    public String membershipDescription() {
        return "Basic";
    }

    public void showMember() {
        
         String msg = "";
         
         msg += "ID: " + memberID + "\n";
         msg += "Name: " + memberName + "\n";
         msg += "Bio: " + profileDescription + "\n";
         msg += "\nMembership Type: " + membershipDescription() + "\n";
         msg += "Days Remain: " + daysRemain + "\n";
         msg += "\n" + Helper.copyrightNotice;

         javax.swing.JOptionPane.showMessageDialog(null, msg);
    }
    
    public void renewMembership() {
        daysRemain = 30;
    }

}
