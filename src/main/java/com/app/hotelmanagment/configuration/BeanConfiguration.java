package com.app.hotelmanagment.configuration;

import com.app.hotelmanagment.CustomActuatorEndpoint.CustomGitInformation;
import com.app.hotelmanagment.entity.APIResponse;
import com.app.hotelmanagment.entity.Client;
import com.app.hotelmanagment.entity.ReservationEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource({"git.properties"})
public class BeanConfiguration {

    @Bean
    public Client client() {
        return new Client() ;
    }

    @Bean
    public APIResponse apiResponse(){
        return new APIResponse();
    }

    @Bean
    public ReservationEntity reservationEntity(){
        return new ReservationEntity();
    }


}
