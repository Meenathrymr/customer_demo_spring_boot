package net.thrymr.app.serviceimpl;

import net.thrymr.app.bean.AppUserBean;
import net.thrymr.app.models.AppUser;
import net.thrymr.app.repository.LoginRepository;
import net.thrymr.app.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceIMpl implements LoginService {

    @Autowired
    LoginRepository loginRepository;

    @Override
    public AppUserBean login(AppUserBean appUserBean) {

        AppUser appUser = new AppUser();
        appUser.setId(loginRepository.count() + 1);
        appUser.setName(appUserBean.getName());
        appUser.setPassword(appUser.getPassword());

        return appUserBean;
    }
}
