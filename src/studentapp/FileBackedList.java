/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package studentapp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JList;

/**
 *
 * @author mowyas
 */
public class FileBackedList extends JList<Student> implements Serializable {
    private ArrayList<Student> backing;
    
    public FileBackedList() {
        super();
      //  load();
    }
    
    private Student[] getData() {
        Student[] a = new Student[0];
        a = backing.toArray(a);
        return a;
    }
    public int length() {
        return backing.size();
    }
    public void addStudent(Student s) {
        backing.add(s);
        this.setListData(getData());
        save();
    }
    
    public void removeStudent(int i) {
        backing.remove(i);
        this.setListData(getData());
        save();
    }
    public void gotoWithScroll(int i) {
        if (i >= 0 && i < backing.size())
            this.setSelectedValue(backing.get(i), true);
    }
    
    public void load() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("students.txt"));
            backing = new ArrayList<Student>();
            while (true) {
                String line = br.readLine();
                if (line == null) break;
                String[] splitted = line.split(",");
            
                String name = splitted[0];
                int grade = Integer.parseInt(splitted[1]);
                double mark = Double.parseDouble(splitted[2]);
                backing.add(new Student(name, grade, mark));

            }
           this.setListData(getData());
        } catch (IOException e) {
        } finally {
            try {
                br.close();
            } catch (IOException ex) {}
        }
        
    }
    
    public void save() {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("students.txt"));
            for (Student s: backing) {
                bw.write(s.getName() + "," + s.getGrade() + "," + s.getMark() + "\n");
            }
        } catch (IOException e) {
            
        } finally {
            try {
                bw.flush();
                bw.close();
            } catch (IOException ex) {
            }
        }
    }
}