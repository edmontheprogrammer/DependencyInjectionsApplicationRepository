package com.edmontheprogrammer;

import org.springframework.stereotype.Component;

/**
 * @Component; The @Component annotation is telling Spring Boot that the "Technologies class" is a spring bean.
 * In other words, This is how Spring Boot recoignizes Java classes and executes them. Classes such as Technologies get
 * recoginize by Spring Boot when Objects of Technologies gets created in places such as main.
 */
@Component
public class Technologies {
        private int tech_id;
        private String tech_name;

    public int getTech_id() {
        return tech_id;
    }

    public void setTech_id(int tech_id) {
        this.tech_id = tech_id;
    }

    public String getTech_name() {
        return tech_name;
    }

    public void setTech_name(String tech_name) {
        this.tech_name = tech_name;
    }
    public  void display() {
        System.out.println("Technologies Object is Created and Returned Successfully!");
    }
}
