package org.example

import com.google.gson.Gson
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody

val client = OkHttpClient()

open class ReqBinResponse
    (open var success: String)



fun response(): ReqBinResponse {
    val gson = Gson()

    val mediaType = "application/json".toMediaTypeOrNull()
    val body =
        "{\"id\": 1000,\"name\": \"feather pillow\",\"customer\": \"Jackson D.\",\"price\": 18.00}".toRequestBody(
            mediaType
        )
    val request = Request.Builder()
        .url("https://reqbin.com/echo/post/json")
        .post(body)
        .addHeader("Content-Type", "application/json")
        .build()

    val response = client.newCall(request).execute()

    return gson.fromJson(response.body!!.string(), ReqBinResponse::class.java)
}

fun main() {
    println(response().success)
}