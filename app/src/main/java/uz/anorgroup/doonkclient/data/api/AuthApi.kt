package uz.anorgroup.doonkclient.data.api

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST
import uz.anorgroup.doonkclient.data.request.ContinueSignUpRequest
import uz.anorgroup.doonkclient.data.request.LoginRequest
import uz.anorgroup.doonkclient.data.request.RegisterRequest
import uz.anorgroup.doonkclient.data.request.VerifyRequest
import uz.anorgroup.doonkclient.data.responce.ContinueResponse
import uz.anorgroup.doonkclient.data.responce.LoginResponse
import uz.anorgroup.doonkclient.data.responce.RegisterResponse
import uz.anorgroup.doonkclient.data.responce.VerifyResponse

interface AuthApi {

    @POST("signIn")
    suspend fun login(@Body data: LoginRequest): Response<LoginResponse>

    @POST("signUp")
    suspend fun register(@Body data: RegisterRequest): Response<RegisterResponse>

    @POST("confirm")
    suspend fun continueSingUp(@Body data: ContinueSignUpRequest): Response<ContinueResponse>

    @POST("verify")
    suspend fun verifyCode(@Body data: VerifyRequest): Response<VerifyResponse>
}