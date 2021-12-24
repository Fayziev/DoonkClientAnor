package uz.anorgroup.doonkclient.domain.repository

import kotlinx.coroutines.flow.Flow
import uz.anorgroup.doonkclient.data.request.ContinueSignUpRequest
import uz.anorgroup.doonkclient.data.request.LoginRequest
import uz.anorgroup.doonkclient.data.request.RegisterRequest
import uz.anorgroup.doonkclient.data.request.VerifyRequest
import uz.anorgroup.doonkanorgroup.data.responce.ContinueResponse
import uz.anorgroup.doonkanorgroup.data.responce.LoginResponse
import uz.anorgroup.doonkanorgroup.data.responce.RegisterResponse
import uz.anorgroup.doonkanorgroup.data.responce.VerifyResponse

interface AuthRepository {

    fun login(request: LoginRequest): Flow<Result<LoginResponse>>
    fun register(request: RegisterRequest): Flow<Result<RegisterResponse>>
    fun verify(request: VerifyRequest): Flow<Result<VerifyResponse>>
    fun confrim(request: ContinueSignUpRequest): Flow<Result<ContinueResponse>>
    fun saveData(phoneNumber: String, name: String, lastName: String)

}