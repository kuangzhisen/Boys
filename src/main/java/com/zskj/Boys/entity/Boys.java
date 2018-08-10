package com.zskj.Boys.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

@Entity
public class Boys {

    @Id
    @GeneratedValue
    private Integer id ;


    private String name ;

    @Min(value = 18, message = "未成年禁止入门")
    private Integer  age;

    public  Boys(){

    }

    @Override
    public String toString() {
        return "Boys{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
