/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package studentapp;

/**
 *
 * @author mowyas
 */
public class Teacher {
    private String name = "Unallocated";
    private String groupName = "00UA";
    private String phoneNumber = "0000000000";
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    
    public Teacher() {
    }
    
    public Teacher(String name, String groupName, String phoneNumber) {
        setName(name);
        setGroupName(groupName);
        setPhoneNumber(phoneNumber);
    }
    
}
