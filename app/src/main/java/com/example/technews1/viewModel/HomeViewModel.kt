package com.example.technews1.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.technews1.model.News
import com.example.technews1.network.ApiInterface
import kotlinx.coroutines.launch


class HomeViewModel(private val apiInterface: ApiInterface) :ViewModel(){

    private val newsLiveData = MutableLiveData<List<News>>()

    val news : LiveData<List<News>>

    get() = newsLiveData


    suspend fun getNews(authHeader: String){

        viewModelScope.launch {

            val response = apiInterface.getAllNews(authHeader)

            newsLiveData.postValue(response.body()!!)

        }

    }

}