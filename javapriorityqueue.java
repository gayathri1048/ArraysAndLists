// Question 10: Java Priority Queue

// Skill Mapping: Basic

// Description: Solve the HackerRank Problem given as a link below -

// https://www.hackerrank.com/challenges/java-priority-queue/problem

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
import java.io.*;
/*
 * Create the Student and Priorities classes here.
 */
 class Student {
  private int id;
  private String name;
  private double cgpa;

  public Student(int id, String name, double cgpa) {
    this.id = id;
    this.name = name;
    this.cgpa = cgpa;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public double getCgpa() {
    return cgpa;
  }
}

class Priorities {
  public List<Student> getStudents(List<String> events) {
    PriorityQueue<Student> queue = new PriorityQueue<>(Comparator.comparingDouble(Student::getCgpa).reversed().thenComparing(Student::getName).thenComparingInt(Student::getId));
    List<Student> students = new ArrayList<>();
    for (String event : events) {
      String[] tokens = event.split("\\s");
      if (tokens[0].equals("ENTER")) {
        int id = Integer.parseInt(tokens[3]);
        String name = tokens[1];
        double cgpa = Double.parseDouble(tokens[2]);
        Student student = new Student(id, name, cgpa);
        queue.add(student);
      }
      else if (tokens[0].equals("SERVED")) {
        queue.poll();
      }
    }
    while (!queue.isEmpty()) {
      students.add(queue.poll());
    }
    return students;
  }
}



public class javapriorityqueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
