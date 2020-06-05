package com.smartinterviewshedular.commonlib.auth.model.tokenstore;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "oauth_code")
public class OauthCode {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String code;
    @Lob
    @Column(columnDefinition = "MEDIUMBLOB")
    private byte[] authentication;
}
