package com.study.springboard.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Board extends TimeEntity{

    @Id @GeneratedValue
    private Long id;

    @Column(length = 10, nullable = false)
    private String writer;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false) // TEXT 타입은 길이 제한이 없는 데이터 타입
    private String content; // 길이 제한이 없는 데이터 타입

    @Builder
    public Board(Long id, String writer, String title, String content){
        this.id = id;
        this.title = title;
        this.content = content;
        this.writer = writer;
    }

}
