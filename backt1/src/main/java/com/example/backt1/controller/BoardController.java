package com.example.backt1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backt1.mapper.BoardMapper;
import com.example.backt1.vo.BoardVO;
 
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/board")
public class BoardController {
 
    @Autowired
    BoardMapper boardMapper;
    
    @GetMapping
    public List<BoardVO> boardList(){
        System.out.println("return baordlist success");
        return boardMapper.boardList(); 
    }

    @PostMapping
    void boardWrite(@RequestBody BoardVO board) {
        boardMapper.boardWrite(board);
        System.out.println("write success");
    }

    @DeleteMapping("/{number}")
    public void boardDelete(@PathVariable int number) {
        boardMapper.boardDelete(number);
        System.out.println("delete board success");
    }

    @GetMapping("/{number}")
    public BoardVO fetchBoardByID(@PathVariable int number) {
        System.out.println("fetch by number" + boardMapper.fetchBoardByID(number));
        BoardVO fetchBoard = boardMapper.fetchBoardByID(number);
        return fetchBoard;
    }

    @PutMapping("/{number}")
    public void updateBoard(@PathVariable int number, @RequestBody BoardVO board) {
        
        BoardVO updateBoard = board;
        System.out.println("업데이트 성공한 글  => " + updateBoard);
        
        updateBoard.setTitle(board.getTitle());
        updateBoard.setContent(board.getContent());
        updateBoard.setPasswrod(board.getPasswrod());
        updateBoard.setId(board.getId());

        boardMapper.updateBoard(updateBoard);
        
        
    }

    
    
}