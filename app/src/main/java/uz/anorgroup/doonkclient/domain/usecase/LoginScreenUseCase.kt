package uz.anorgroup.doonkclient.domain.usecase

import kotlinx.coroutines.flow.Flow
import uz.anorgroup.doonkclient.data.request.LoginRequest
import uz.anorgroup.doonkanorgroup.data.responce.LoginResponse

interface LoginScreenUseCase {

    fun userLogin(authRequest: LoginRequest): Flow<Result<LoginResponse>>

}