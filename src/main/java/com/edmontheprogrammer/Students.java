package com.edmontheprogrammer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Component ; The @Component annotation is telling Spring Boot that the Students class  is a Spring bean. In other
 * words, this is how Spring Boot recognizes Java classes and executes them. Classes such as Students get
 * recognize by Spring Boot when objects of Students get created in places such as main.
 * @Autowired; The "@Autowired" annotation is used to enable one class such as "Students class" to recoginze the existance
 * of another class such as "Technologies class" within the Spring Boot framework. In other words, you must use the
 * "@Autowired" annotation to connect Java classes together.
 */
@Component
public class Students {

    // Creating instance variables for Students
    private int student_id;
    private String student_name;
    private String course_name;

    /**
     * The "@Autowired" annotation is used to enable one class such as "Students class" to recognize the existance of
     * another class such as "Technologies" using the Spring Boot framework. Here we are telling Spring Boot there are
     * two Java classes "Students" and "Technologies" and both of them work together.
     */
    @Autowired
    private Technologies technologies_detials;
    /**
     * Creating an instance variable of type Technologies
     * technologies_detials is an object and we can access all of its methods and properties using the dot notation
     */
    public Technologies getTechnologies_detials() {
        return technologies_detials;
    }

    public void setTechnologies_detials(Technologies technologies_detials) {
        this.technologies_detials = technologies_detials;
    }

    // getter method that gets the student_id when called
    public int getStudent_id() {
        return student_id;
    }

    // setter method that takes student_id integer as input and initializes to the "this.student_id", the instance
    // variable of the Students class
    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    // """
    public String getStudent_name() {
        return student_name;
    }

    // """
    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    // display method is created to verify that a Students object did get created successfully
    public void display()
    {
        System.out.println("Students Object is Created and Returned Successfully!");

        //  display() from Technologies class is called here to verify and confirm that an instance of the Technologies
        // class did get created from above using this line " private Technologies technologies_detials;"
        technologies_detials.display();
    }


}
