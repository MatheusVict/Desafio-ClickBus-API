package br.com.backend.challenger.demo.domain;

import br.com.backend.challenger.demo.api.PlaceRequest;
import reactor.core.publisher.Mono;

public class PlaceService {
  private PlaceRepository placeRepository;

  public PlaceService(PlaceRepository placeRepository) {
    this.placeRepository = placeRepository;
  }

  public Mono<Place> create(PlaceRequest placeRequest) {
    var place = new Place(
            null, placeRequest.name(),
            placeRequest.slug(),
            placeRequest.state(),
            placeRequest.createdAt(),
            placeRequest.updatedAt()
    );
    return placeRepository.save(place);
  }
}
