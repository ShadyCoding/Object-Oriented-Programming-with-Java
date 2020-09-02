package com.skyroute66.membership;

/**
 *
 * @author harrisonkong
 */

interface Renewable {
    public void renewMembership();
}

interface Showable {
    public void showMember();
}
        
public abstract class Member implements Renewable, Showable {
    
    public long memberID;
    public String memberName;
    public String profileDescription;
    protected int daysRemain = 0;
    
    public Member(String newName, String newDescription) {
        memberID = Helper.generateUniqueLong();
        memberName = newName;
        profileDescription = newDescription;
        
        renewMembership();
        showMember();
    }
    
    public abstract String membershipDescription();
    
    public final int getPopularity() {
        return memberID % 2 == 0 ? 100 : 1;
    }

}

