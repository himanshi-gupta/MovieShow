package com.example.movieshow

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.movieshow.repository.MovieRepo
import com.example.movieshow.viewModels.MovieViewModel

@Suppress("UNCHECKED_CAST")
class MovieViewModelFactory(private val repo: MovieRepo) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(MovieViewModel::class.java)){
            return MovieViewModel(repo) as T
        }
        throw IllegalArgumentException("ViewModel not created")
    }
}
