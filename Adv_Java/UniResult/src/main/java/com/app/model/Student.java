package com.app.model;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student {

    private String prn;
    private String name;
    private String password;
    private int sub1, sub2, sub3, sub4, sub5;

    public int getTotal() {

        return sub1 + sub2 + sub3 + sub4 + sub5;
    }

    public double getPercentage() {

        return getTotal() / 5.0;
    }

    public String getGrade() {

        double percentage = getPercentage();

        if (percentage >= 75) {

            return "Distinction";

        } else if (percentage >= 60) {

            return "First Class";

        } else if (percentage >= 40) {

            return "Pass";

        } else {

            return "Fail";
        }
    }

}
