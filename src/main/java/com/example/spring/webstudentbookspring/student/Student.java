package com.example.spring.webstudentbookspring.student;

import javax.persistence.*;

@Entity
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;
    @Column(name="first_name")
    String firstName;
    @Column(name="last_name")
    String lastName;
    @Column(name="email")
    String email;
    public int getId() {return id;  }
    public void setId(int id) {this.id = id;  }
    public String getFirstName() {return firstName;  }
    public void setFirstName(String firstName) {this.firstName = firstName;  }
    public String getLastName() {return lastName;  }
    public void setLastName(String lastName) {this.lastName = lastName;  }
    public String getEmail() {return email;  }
    public void setEmail(String email) {this.email = email;  }
    public Student() {super();  }

    public Student(int id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Student(String firstName, String lastName, String email) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;  }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}