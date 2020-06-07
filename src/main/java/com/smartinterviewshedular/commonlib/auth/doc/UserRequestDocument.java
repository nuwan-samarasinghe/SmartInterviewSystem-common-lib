package com.smartinterviewshedular.commonlib.auth.doc;

import lombok.Data;

@Data
public class UserRequestDocument {

    private String userName;
    private String password;
    private String email;

}
