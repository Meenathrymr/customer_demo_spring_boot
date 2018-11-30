package net.thrymr.app.controllers;

import net.thrymr.app.bean.AppUserBean;
import net.thrymr.app.models.AppUser;
import net.thrymr.app.serviceimpl.LoginServiceIMpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    LoginServiceIMpl loginServiceIMpl;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public void userLogin(AppUserBean appUserBean) {
        loginServiceIMpl.login(appUserBean);
    }

}
