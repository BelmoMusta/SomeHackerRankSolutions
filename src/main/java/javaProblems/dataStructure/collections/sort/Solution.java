/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaProblems.dataStructure.collections.sort;
import java.util.*;

class Student{
   private int id;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.id = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getId() {
      return id;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
}

//Complete the code
public class Solution
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      
      List<Student> studentList = new ArrayList<Student>();
      while(testCases>0){
         int id = in.nextInt();
         String fname = in.next();
         double cgpa = in.nextDouble();
         
         Student st = new Student(id, fname, cgpa);
         studentList.add(st);
         
         testCases--;
      }
     Comparator<Student> cmp  = new Comparator<Student>() {

          @Override
          public int compare(Student a, Student b) {
              
              if(b.getCgpa()!=a.getCgpa()) return b.getCgpa()>a.getCgpa()?1:-1;
              if(b.getFname().compareTo(a.getFname())!=0) return b.getFname().compareTo(a.getFname());
              return b.getId()-a.getId();
          
          }
      };
     studentList.sort(cmp);
     for(Student st: studentList){
         System.out.println(st.getFname());
      }
   }
}
