package uz.anorgroup.doonkanorgroup.presenter.viewmodel

import kotlinx.coroutines.flow.Flow
import uz.anorgroup.doonkclient.data.request.ContinueSignUpRequest

interface RegisterViewModel {

    val errorFlow: Flow<String>
    val progressFlow: Flow<Boolean>
    val successFlow: Flow<Unit>
    val openVerifyFlow:Flow<Unit>
    fun continueSignUpRequest(request: ContinueSignUpRequest)
}