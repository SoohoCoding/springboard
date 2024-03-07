package com.study.springboard.service;

import com.study.springboard.dto.BoardDto;
import com.study.springboard.repository.BoardRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;


@Service
public class BoardService {

    private BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @Transactional
    public Long savePost(BoardDto boardDto) {
        return boardRepository.save(boardDto.toEntity()).getId();
    }
}
