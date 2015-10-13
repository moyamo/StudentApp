package studentapp;

/**
 *
 * @author mowyas
 */
public class Student {
    private String name = "unknown";
    private int grade = 8;
    private double mark = 0.0;
    
    public Student() {
        
    }
    
    public Student(String n, int g, double m) {
        setName(n);
        setGrade(g);
        setMark(m);
    }
    public void setGrade(int g) {
        if (g >= 8 && g <= 12)
            grade = g;
    }
    public int getGrade(){
        return grade;
    }

    public void setMark(double m) {
        mark = Math.min(Math.max(m, 0.0), 100.0);
    }

    public double getMark(){
        return mark;
    }
 
     public void setName(String m) {
        if (!m.equals(""))
            name = m;
    }
    public String getName(){
        return name;
    }
    
    @Override
    public String toString() {
        return name;
    }
}