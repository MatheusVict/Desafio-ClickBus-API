package br.com.backend.challenger.demo.web;

import br.com.backend.challenger.demo.api.PlaceRequest;
import br.com.backend.challenger.demo.api.PlaceResponse;
import br.com.backend.challenger.demo.domain.Place;
import br.com.backend.challenger.demo.domain.PlaceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/places")
public class PlaceController {
  public PlaceController(PlaceService placeService) {
    this.placeService = placeService;
  }

  private PlaceService placeService;



  @PostMapping
  public ResponseEntity<Mono<PlaceResponse>> create(@RequestBody PlaceRequest request) {
    var placeResponse = placeService.create(request).map(PlaceMapper::fromPlaceToResponse);
    return ResponseEntity.status(HttpStatus.CREATED).body(placeResponse);
  }
}
