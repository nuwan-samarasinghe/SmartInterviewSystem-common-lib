package com.smartinterviewshedular.commonlib.auth.model.tokenstore;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "oauth_code")
public class OauthApprovals {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String userId;
    private String clientId;
    private String scope;
    private String status;
    private Timestamp expiresAt;
    private Timestamp lastModifiedAt;
}
