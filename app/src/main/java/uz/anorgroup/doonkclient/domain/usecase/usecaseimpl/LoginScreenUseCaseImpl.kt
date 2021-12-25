package uz.anorgroup.doonkclient.domain.usecase.usecaseimpl

import kotlinx.coroutines.flow.Flow
import uz.anorgroup.doonkclient.data.request.LoginRequest
import uz.anorgroup.doonkclient.data.responce.LoginResponse
import uz.anorgroup.doonkclient.domain.repository.AuthRepository
import uz.anorgroup.doonkclient.domain.usecase.LoginScreenUseCase
import javax.inject.Inject

class LoginScreenUseCaseImpl @Inject constructor(private val repositoryImpl: AuthRepository) : LoginScreenUseCase {
    override fun userLogin(authRequest: LoginRequest): Flow<Result<LoginResponse>> = repositoryImpl.login(authRequest)
}