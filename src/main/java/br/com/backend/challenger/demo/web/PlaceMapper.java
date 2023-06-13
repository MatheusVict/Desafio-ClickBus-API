package br.com.backend.challenger.demo.web;

import br.com.backend.challenger.demo.api.PlaceResponse;
import br.com.backend.challenger.demo.domain.Place;

public class PlaceMapper {
  public static PlaceResponse fromPlaceToResponse(Place place) {
    return new PlaceResponse(
            place.name(),
            place.slug(),
            place.state(),
            place.createdAt(),
            place.updatedAt()
    );
  }
}
