package com.example.demo.repository;

import com.example.demo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class BookRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private RowMapper<Book> rowMapper = new RowMapper<Book>() {
        @Override
        public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
            Book book = new Book();
            book.setBookid(rs.getInt("bookid"));
            book.setBookname(rs.getString("bookname"));
            book.setAuthor(rs.getString("author"));
            book.setPrice(rs.getDouble("price"));
            return book;
        }
    };

    public List<Book> findAll() {
        String sql = "SELECT * FROM books";
        return jdbcTemplate.query(sql, rowMapper);
    }

    public int save(Book book) {
        String sql = "INSERT INTO books (bookid, bookname, author, price) VALUES (?, ?, ?, ?)";
        return jdbcTemplate.update(sql, book.getBookid(), book.getBookname(), book.getAuthor(), book.getPrice());
    }
}

