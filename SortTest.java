import java.util.*;
 class Student implements Comparable<Student> {
    private String name;
    private int score;
    public void setName(String name){
        this.name = name;
    }
    public void setScore(int score){
        this.score = score;
    }
    public String getName(){
        return this.name;
    }
    public int getScore(){
        return this.score;
    }
    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Student vo){
        if(this.score < vo.score){
            return -1;
        }
        return 1;
    }
}
public class SortTest {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("KIM", 85));
        list.add(new Student("YOON", 95));

        Collections.sort(list);
        for(Student vo : list){
            System.out.print(vo.getName());
            System.out.print(" ");
        }
    }
}
