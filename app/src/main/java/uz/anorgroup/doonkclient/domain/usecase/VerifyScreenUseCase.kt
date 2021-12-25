package uz.anorgroup.doonkclient.domain.usecase

import kotlinx.coroutines.flow.Flow
import uz.anorgroup.doonkclient.data.request.RegisterRequest
import uz.anorgroup.doonkclient.data.request.VerifyRequest
import uz.anorgroup.doonkclient.data.responce.RegisterResponse
import uz.anorgroup.doonkclient.data.responce.VerifyResponse


interface VerifyScreenUseCase {
    fun sendSmsVerify(request: VerifyRequest): Flow<Result<VerifyResponse>>
    fun register(request: RegisterRequest): Flow<Result<RegisterResponse>>
    fun saveData(phoneNumber: String, name: String, lastName: String)
}