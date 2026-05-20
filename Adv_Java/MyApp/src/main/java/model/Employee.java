package model;

import lombok.Data;
import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private int id;
    private String firstName;
    private String password;
    private String email;
    private String gender;
    private int age;
}