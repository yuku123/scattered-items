package org.springframework.samples.parent;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-18 21:39
 */
public class DerivedTestBean {
    private String name;
    private int age;

    public void info() {
        System.out.println("name : " + name + ", age : " + age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void initialize() {
    }
}
