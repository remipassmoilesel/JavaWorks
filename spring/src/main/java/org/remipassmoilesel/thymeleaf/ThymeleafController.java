package org.remipassmoilesel.thymeleaf;

import org.remipassmoilesel.Mappings;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by remipassmoilesel on 10/12/16.
 */
@Controller
public class ThymeleafController {

    @RequestMapping(value = Mappings.THYMELEAF, method = RequestMethod.GET)
    public String greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name,
                           Model model) {
        model.addAttribute("name", name);

        // name of template
        return "greeting";
    }

}
