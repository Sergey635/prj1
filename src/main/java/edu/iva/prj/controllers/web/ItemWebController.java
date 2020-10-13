package edu.iva.prj.controllers.web;

import edu.iva.prj.model.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Controller
@RequestMapping("/web/item")
public class ItemWebController {
    List<Item> list = Stream.of(
            new Item("1", "Coca-Cola", "drink", LocalDateTime.now(), LocalDateTime.now()),
            new Item("2", "Pepsi", "Drink", LocalDateTime.now(), LocalDateTime.now()),
            new Item("3", "Fanta", "Drink", LocalDateTime.now(), LocalDateTime.now())
    ).collect(Collectors.toList());

    @RequestMapping("/all")
    String getAll(Model model) {
        model.addAttribute("items", list);
        return "itemsTable";
    }

}
