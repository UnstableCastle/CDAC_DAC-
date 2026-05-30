package com.app.entity;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Data

public class Customer {
private String firstName;
@NotNull@Size(min=1,message = "Enter Atleast 1 char ")
private String lastName;

}
