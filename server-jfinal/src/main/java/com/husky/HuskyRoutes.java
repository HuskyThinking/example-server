package com.husky;

import com.husky.controller.Routes0001;
import com.jfinal.config.Routes;

public class HuskyRoutes extends Routes {
    @Override
    public void config() {
        add(new Routes0001());
    }
}
