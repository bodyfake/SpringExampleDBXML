package arduinotoy.example.SpringReact.controller;

import arduinotoy.example.SpringReact.Model.Book;
import arduinotoy.example.SpringReact.SpringReactApplication;
import arduinotoy.example.SpringReact.configuration.MongoConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class MainController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringReactApplication.class);

    @PostMapping("/save/book")
    public ResponseEntity<?> saveBook(@RequestBody Book  book) {
        LOGGER.info("The Book : {}", book);
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(MongoConfig.class);
        MongoOperations mongoOperation =
                (MongoOperations) ctx.getBean("mongoTemplate");
        mongoOperation.save(book, "tableA");
        return new ResponseEntity("Book is saved in the Database", new HttpHeaders(), HttpStatus.OK);
    }

}