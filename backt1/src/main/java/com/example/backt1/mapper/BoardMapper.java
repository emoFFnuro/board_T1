package com.example.backt1.mapper;

import java.util.List;

import com.example.backt1.vo.BoardVO;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface BoardMapper {

    List<BoardVO> boardList();
    BoardVO fetchBoardByID(int number);
    void boardWrite(BoardVO board);
    void boardDelete(int number);
    void updateBoard(BoardVO board);
    
}
