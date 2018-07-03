package com.freshworks.freshworks;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@Entity(name="student")
@Table(name="student")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;


    String name;

    String email;

    long age;

    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate Date created_time;

    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    Date updated_time;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public Date getCreated_time() {
        return created_time;
    }

    public void setCreated_time(Date created_time) {
        this.created_time = created_time;
    }

    public Date getUpdated_time() {
        return updated_time;
    }

    public void setUpdated_time(Date updated_time) {
        this.updated_time = updated_time;
    }

    @Override public String toString() {
        return "StudentEntity{" + "id=" + id + ", name='" + name + '\'' + ", email='" + email + '\''
            + ", age=" + age + ", created_time=" + created_time + ", updated_time=" + updated_time
            + '}';
    }
}
