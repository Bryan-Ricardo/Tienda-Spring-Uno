package com.proyectos.spring.app.contollers;

import com.proyectos.spring.app.models.domain.Producto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public List<Producto> llenarAlmacen(){
        Producto producto1 = new Producto("Huawey Y9","3GB","64GB","200,000mh","HarmonyOS 2","Gran pantalla de 6.5, 4 Camaras IA" ,"$7,000");
        Producto producto2 = new Producto("Huawey Y8","2GB","32GB","1,900mh","HarmonyOS 2","Gran pantalla de 6, 3 Camaras IA" ,"$6,000");
        Producto producto3 = new Producto("S9","4GB","128GB","300,000mh","Android 12","Gran pantalla de 7, 4 Camaras IA" ,"$30,000");
        Producto producto4 = new Producto("S8","3GB","64GB","200,000mh","Android 11","Gran pantalla de 6.5, 2 Camaras IA" ,"$15,000");
        Producto producto5 = new Producto("Motorola g8","3GB","64GB","200,000mh","Android 9","Gran pantalla de 5, 2 Camaras IA" ,"$7,000");
        Producto producto6 = new Producto("Motorola g7","2GB","32GB","100,000mh","Android 9","Gran pantalla de 5, 1 Camaras IA" ,"$5,000");
        Producto producto7 = new Producto("Iphone 10","5GB","128GB","500,000mh","IOS","Gran pantalla de 10, 5 Camaras IA" ,"$40,000");
        Producto producto8 = new Producto("Iphone 9","3GB","64GB","200,000mh","IOS","Gran pantalla de 9, 4 Camaras IA" ,"$30,000");
        return Arrays.asList(producto1,producto2,producto3,producto4,producto5,producto6,producto7,producto8);
    }

}
