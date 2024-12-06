package com.piashcse.hilt_mvvm_compose_movie.ui.preview

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.piashcse.hilt_mvvm_compose_movie.data.model.GenreId
import com.piashcse.hilt_mvvm_compose_movie.data.model.MovieItem
import com.piashcse.hilt_mvvm_compose_movie.data.model.moviedetail.Genre
import com.piashcse.hilt_mvvm_compose_movie.ui.component.MovieItems
import com.piashcse.hilt_mvvm_compose_movie.ui.toLazyPagingItems

@Composable
@Preview
fun PreviewMovieItems() {
    val navController = NavController(androidx.compose.ui.platform.LocalContext.current)
    val sampleGenres = arrayListOf(
        Genre(id = 1, name = "Action"),
        Genre(id = 2, name = "Comedy"),
        Genre(id = 2, name = "Comedy")
    )
    val sampleMovies = listOf(
        MovieItem(id = 1,
            adult = false,
            backdropPath = "/l94l89eMmFKh7na2a1u5q67VgNx.jpg",
            posterPath = "/o2cWCX48flnEgDwSWu0Gpia0i0N.jpg",
            genreIds = listOf(35, 18),
            title = "Varjoja paratiisissa",
            originalTitle = "Varjoja paratiisissa",
            video = false,
            overview = "",
            voteCount = 399,
            voteAverage = 6.2,
            popularity = 13.455,
            releaseDate = "1986-10-17",
            originalLanguage = "fi"),
        MovieItem(id = 1,
            adult = false,
            backdropPath = "/l94l89eMmFKh7na2a1u5q67VgNx.jpg",
            posterPath = "/o2cWCX48flnEgDwSWu0Gpia0i0N.jpg",
            genreIds = listOf(35, 18),
            title = "Varjoja paratiisissa",
            originalTitle = "Varjoja paratiisissa",
            video = false,
            overview = "",
            voteCount = 399,
            voteAverage = 6.2,
            popularity = 13.455,
            releaseDate = "1986-10-17",
            originalLanguage = "fi"),
        MovieItem(id = 1,
            adult = false,
            backdropPath = "/l94l89eMmFKh7na2a1u5q67VgNx.jpg",
            posterPath = "/o2cWCX48flnEgDwSWu0Gpia0i0N.jpg",
            genreIds = listOf(35, 18),
            title = "Varjoja paratiisissa",
            originalTitle = "Varjoja paratiisissa",
            video = false,
            overview = "",
            voteCount = 399,
            voteAverage = 6.2,
            popularity = 13.455,
            releaseDate = "1986-10-17",
            originalLanguage = "fi")
    )

    val lazyPagingItems = sampleMovies.toLazyPagingItems()

    MovieItems(
        navController = navController,
        moviesItems = lazyPagingItems,
        genres = sampleGenres,
        selectedName = sampleGenres.first(),
        onclick = {}
    )
}