package com.victolee.signuplogin.dto;

import com.victolee.signuplogin.domain.entity.MemberEntity;
import lombok.*;

import javax.persistence.Column;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class MemberDto {
    private Long idx;
    private String id;
    private String password;
    private String email;
    private String tel;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    public MemberEntity toEntity(){
        return MemberEntity.builder()
                .idx(idx)
                .id(id)
                .password(password)
                .email(email)
                .tel(tel)
                .build();
    }



}
