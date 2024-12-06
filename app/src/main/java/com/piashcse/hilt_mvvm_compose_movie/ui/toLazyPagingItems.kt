package com.piashcse.hilt_mvvm_compose_movie.ui

import androidx.compose.runtime.Composable
import androidx.paging.PagingData
import androidx.paging.compose.LazyPagingItems
import androidx.paging.compose.collectAsLazyPagingItems
import kotlinx.coroutines.flow.flowOf

@Composable
fun <T : Any> List<T>.toLazyPagingItems(): LazyPagingItems<T> {
    return flowOf(PagingData.from(this)).collectAsLazyPagingItems()
}