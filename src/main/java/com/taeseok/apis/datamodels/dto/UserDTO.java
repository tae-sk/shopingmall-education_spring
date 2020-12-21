package com.taeseok.apis.datamodels.dto;

import com.taeseok.apis.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserDTO {
    private int userId;
    private String email;
    private String name;
    private String phone;

    public UserDTO(User user){
        this.userId = user.getUserId();
        this.email = user.getEmail();
        this.name = user.getName();
        this.phone = user.getPhone();
    }

    @Override
    public String toString(){
        return String.format(
                "User[user_id=%d, email='%s', name='%s', phone='%s']",
                this.userId, this.email, this.name, this.phone
        );
    }
}
