package com.example.employee.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employees")
public class Employee {

    @Id
    private long id;
    private String firstName;
    private String lastName;
    private String email;


public long getId(){
    return id;
}

public void setId(long id){
    this.id=id;
}

public String getfirstName(){
    return firstName;
}

public void setfirstName(String firstName){
    this.firstName=firstName;
}

public String getlastName(){
    return lastName;
}

public void setlastName(String lastName){
    this.lastName=lastName;
}

public String getemail(){
    return email;
}

public void setemail(String email){
    this.email=email;
}
    
    
}
