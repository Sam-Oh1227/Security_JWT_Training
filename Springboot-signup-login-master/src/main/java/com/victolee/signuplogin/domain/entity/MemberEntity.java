package com.victolee.signuplogin.domain.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "member")
public class MemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column(length = 20, nullable = false)
    private String id;
    @Column(length = 100, nullable = false)
    private String password;

    @Column(length = 20, nullable = false)
    private String email;

    @Column(length = 20, nullable = false)
    private String tel;

    @Builder
    public MemberEntity(Long idx, String id, String password, String email, String tel) {
        this.idx = idx;
        this.id = id;
        this.password = password;
        this.email = email;
        this.tel = tel;
    }
}