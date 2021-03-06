package com.spring.two.chapterSix.WebView.resolverJstl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping("/spittler")
public class SpitterController {

    private SpittleRepository spittleRepository;

    public SpitterController() {}

    @Autowired
    public SpitterController(SpittleRepository mockRepository) {
        this.spittleRepository = mockRepository;
    }

    @RequestMapping(value = "/register", method = GET)
    public String showRegistrationForm(Model model) {

        model.addAttribute("spitter",new Spitter());
        return "registerForm";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String showRegistrationForm(
            //校验Spitter
            @Valid Spitter spitter,
            Errors errors) {

        //如果校验失败，则重新返回表单
        if(errors.hasErrors()) return "registerForm";

        spittleRepository.save(spitter);
        return  "redirect:/spitter/"+ spitter.getUsername();
    }

    @RequestMapping(value = "/{username}", method = GET)
    public String showSpitterProfile(
        @PathVariable String username, Model model){
        Spitter spitter = spittleRepository.findByUserName(username);
        model.addAttribute(spitter);
        return "profile";
    }
}