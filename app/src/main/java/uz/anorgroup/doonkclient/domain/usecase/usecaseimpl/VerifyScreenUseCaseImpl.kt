package uz.anorgroup.doonkclient.domain.usecase.usecaseimpl

import kotlinx.coroutines.flow.Flow
import uz.anorgroup.doonkclient.data.request.RegisterRequest
import uz.anorgroup.doonkclient.data.request.VerifyRequest
import uz.anorgroup.doonkanorgroup.data.responce.RegisterResponse
import uz.anorgroup.doonkanorgroup.data.responce.VerifyResponse
import uz.anorgroup.doonkclient.domain.repository.AuthRepository
import uz.anorgroup.doonkclient.domain.usecase.VerifyScreenUseCase
import javax.inject.Inject

class VerifyScreenUseCaseImpl @Inject constructor(private val repository: AuthRepository) : VerifyScreenUseCase {

    override fun register(request: RegisterRequest): Flow<Result<RegisterResponse>> = repository.register(request)
    override fun saveData(phoneNumber: String, name: String, lastName: String) {
        repository.saveData(phoneNumber, name, lastName)
    }

    override fun sendSmsVerify(request: VerifyRequest): Flow<Result<VerifyResponse>> = repository.verify(request)
}