package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.MovieController;
import com.mycompany.dvdstore.service.DefaultMovieService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan({"com.mycompany.dvdstore.repository.file","com.mycompany.dvdstore.controller"/*,"com.mycompany.dvdstore.service"*/})
@PropertySource("classpath:application.properties")
public class App
{
    public static void main( String[] args )
    {

        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        MovieController movieController = context.getBean(MovieController.class);
        movieController.addUsingConsole();
    }
    @Bean
    public DefaultMovieService configureDefaultService() {
        return new DefaultMovieService();
    }
}
