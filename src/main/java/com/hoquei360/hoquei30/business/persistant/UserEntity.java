package com.hoquei360.hoquei30.business.persistant;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Table(name = "users")

public class UserEntity {
    @Id
    @GeneratedValue()
    private Long id;
//    @NotNull(message = "UserName is mandatory ")
    private String userName;
//    @Email(message = "must be a valid e-mail")
//    @NotNull(message = "E-mail is mandatory")
    private String email;
//    @Past(message = "This date must be in the past")
//    @NotNull(message = "Birth date is mandatory")
    private Date birthDate;
//    @NotNull(message = "Password is mandatory")
    private String password;   //put validation with limit of number
    private String adreess;
    private String phoneNumber;
//    @NotNull(message = "role is mandatory")
    private Integer roles;                   //1 is admin, 2 is the salesman, 3 is the operator and 4 is trainee


}
