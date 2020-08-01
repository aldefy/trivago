package com.trivago.data.repository

import com.trivago.core.api.StarWarsAPI
import com.trivago.core.models.*
import com.trivago.data.dao.CharacterDao

class CharacterDetailsRepository(
    private val starWarsAPI: StarWarsAPI,
    private val characterDao: CharacterDao
) {

    suspend fun fetchSpecies(characterUrl: String): SpeciesResponse =
        starWarsAPI.fetchSpecies(characterUrl)

    suspend fun fetchSpeciesDetails(speciesUrl: String): SpeciesDetailResponse =
        starWarsAPI.fetchSpeciesDetails(speciesUrl)

    suspend fun fetchFilms(characterUrl: String): FilmsResponse =
        starWarsAPI.fetchFilms(characterUrl)

    suspend fun fetchFilmDetails(filmsUrl: String): FilmDetailResponse =
        starWarsAPI.fetchFilmDetails(filmsUrl)

    suspend fun fetchPlanet(characterUrl: String): PlanetResponse =
        starWarsAPI.fetchPlanet(characterUrl)

    suspend fun fetchPlanetDetails(planetUrl: String): PlanetDetailsResponse =
        starWarsAPI.fetchPlanetDetails(planetUrl)
}