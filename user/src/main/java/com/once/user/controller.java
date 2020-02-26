package com.once.user;



@Controller
@RequestMapping("/user")
public class UsuarioController {
    
    @RequestMapping("/form")
    public String showUserForm(Model model){
        model.addAttribute("usuario", new Usuario());
        return "userForm";
    }

    @RequestMapping("/create")
    public ModelAndView createUser(@Valid Usuario user, BindingResult result) {
        ModelAndView model = new ModelAndView();
        model.addObject("usuario", user);
        model.setViewName(result.hasErrors() ? "userForm" : "userReady"); 
        return model;
    }
}