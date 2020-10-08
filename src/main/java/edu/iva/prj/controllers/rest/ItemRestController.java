package edu.iva.prj.controllers.rest;

import edu.iva.prj.model.Item;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/api/item")
public class ItemRestController {
    List<Item> list = Stream.of(
            new Item("1", "Coca-Cola", "drink", LocalDateTime.now(), LocalDateTime.now()),
            new Item("2", "Pepsi", "Drink", LocalDateTime.now(), LocalDateTime.now()),
            new Item("3", "Fanta", "Drink", LocalDateTime.now(), LocalDateTime.now())
    ).collect(Collectors.toList());

    @RequestMapping("/all")
    List<Item> getAll() {
        return list;
    }

}
