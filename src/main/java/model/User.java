package model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private long userId;
    private String userFirstName;
    private String userLastName;
    private int useAge;
    private String userPhoneNumber;
    private String userName;
    private String userEmail;
    private String userPassword;

}
