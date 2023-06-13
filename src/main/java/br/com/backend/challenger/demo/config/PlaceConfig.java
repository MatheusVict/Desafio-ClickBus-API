package br.com.backend.challenger.demo.config;

import br.com.backend.challenger.demo.domain.PlaceRepository;
import br.com.backend.challenger.demo.domain.PlaceService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PlaceConfig {

  @Bean
  PlaceService placeService(PlaceRepository placeRepository) {
    return new PlaceService(placeRepository);
  }
}
