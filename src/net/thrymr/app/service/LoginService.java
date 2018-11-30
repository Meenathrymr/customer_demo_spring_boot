package net.thrymr.app.service;

import net.thrymr.app.bean.AppUserBean;
import org.springframework.stereotype.Service;

@Service
public interface LoginService {

    AppUserBean login(AppUserBean appUserBean);
}
