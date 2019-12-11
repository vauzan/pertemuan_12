package com.vauzan.pertemuan12.API

import com.vauzan.pertemuan12.Model.Photo
import io.reactivex.Single
import retrofit2.http.GET

interface PhotosApi {
    @GET("photos")
    fun getPhotos(): Single<List<Photo>>
}
