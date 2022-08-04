package com.victolee.signuplogin.domain.repository;

import com.victolee.signuplogin.domain.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {

    MemberEntity findById(String id);

}
