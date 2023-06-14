package br.com.backend.challenger.demo.api;

import java.time.LocalDateTime;

public record PlaceResponse(String name, String slug, String city, String state,
                            LocalDateTime createdAt, LocalDateTime updatedAt) {

}
