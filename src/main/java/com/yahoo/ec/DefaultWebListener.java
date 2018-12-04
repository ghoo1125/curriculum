package com.yahoo.ec;

import javax.servlet.ServletContextEvent;
import javax.servlet.annotation.WebListener;

import com.yahoo.ec.parsec_generated.ParsecWebListener;

/**
 * Default Web listener, replace web.xml.
 */
@WebListener
public class DefaultWebListener extends ParsecWebListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // Parsec default servlet registrations
        super.contextInitialized(sce);

        // Add additional servlet filter here
    }
}

