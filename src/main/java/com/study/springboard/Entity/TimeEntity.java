package com.study.springboard.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@MappedSuperclass // 테이블로 생성되지 않고 자식 클래스에게 매핑 정보만 제공하는 클래스
@EntityListeners(AuditingEntityListener.class)// JPA에게 해당 Entity는 Auditing 기능을 사용한다는 것을 알림
public class TimeEntity {

    @CreatedDate // Entity가 생성되어 저장될 때 시간이 자동 저장
    @Column(updatable = false) // 해당 어노테이션이 적용된 필드는 update 쿼리에서 제외
    private String createdDate;

    @LastModifiedDate// 조회한 Entity의 값을 변경할 때 시간이 자동 저장
    private LocalDateTime modifiedDate; // 수정일
}
