package worker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import worker.bean.Book;
import worker.service.BookService;

import java.util.List;
import java.util.Map;

@Controller
public class BookController {
    @Autowired
    BookService bookService;

    @RequestMapping("/index")
    public String toIndex(Map map) {
        List<Book> books = bookService.selectAll();
        map.put("book",books);
        return "forward:/index.ftl";
    }

    @RequestMapping("/toAdd")
    public String toAdd() {
        return "add";
    }

    @RequestMapping("/add")
    public String add(Book book) {
        bookService.insert(book);
        return "forward:/index";
    }

    @RequestMapping("/toEdit")
    public String toEdit(Integer id,Map map) {
        Book book = bookService.selectByPrimaryKey(id);
        map.put("book",book);
        return "edit";
    }
    @RequestMapping("/edit")
    public String edit(Book book) {
        bookService.updateByPrimaryKey(book);
        return "forward:/index";
    }
    @RequestMapping("/delete")
    public String delete(Integer id) {
        bookService.deleteByPrimaryKey(id);
        return "forward:/index";
    }



}
