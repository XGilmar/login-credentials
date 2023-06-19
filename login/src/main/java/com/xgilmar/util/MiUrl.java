package com.xgilmar.util;

import com.xgilmar.login.LoaderForm;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MiUrl {

    public void MiDireccion(String direccion) {
        try {
            URL url = new URL(direccion);
            URI uri = url.toURI();
            Desktop.getDesktop().browse(uri);
        } catch (IOException e) {
        } catch (URISyntaxException ex) {
            Logger.getLogger(LoaderForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
