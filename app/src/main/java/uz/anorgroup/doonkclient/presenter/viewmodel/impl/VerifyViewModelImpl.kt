package uz.anorgroup.doonkanorgroup.presenter.viewmodel.impl

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import uz.anorgroup.doonkclient.data.request.RegisterRequest
import uz.anorgroup.doonkclient.data.request.VerifyRequest
import uz.anorgroup.doonkclient.domain.usecase.VerifyScreenUseCase
import uz.anorgroup.doonkanorgroup.presenter.viewmodel.VerifyViewModel
import uz.anorgroup.doonkclient.utils.eventValueFlow
import uz.anorgroup.doonkclient.utils.isConnected
import javax.inject.Inject

@HiltViewModel
class VerifyViewModelImpl @Inject constructor(private val useCase: VerifyScreenUseCase) : ViewModel(), VerifyViewModel {
    override val errorFlow = eventValueFlow<String>()
    override val progressFlow = eventValueFlow<Boolean>()
    override val successFlow = eventValueFlow<Unit>()
    override val openMainFlow = eventValueFlow<Unit>()

    override fun verify(request: VerifyRequest) {
        if (!isConnected()) {
            viewModelScope.launch {
                errorFlow.emit("Internet bilan muammo bo'ldi")
            }
            return
        }
        viewModelScope.launch {
            progressFlow.emit(true)
        }
        useCase.sendSmsVerify(request).onEach {
            it.onSuccess {
                progressFlow.emit(false)
                successFlow.emit(Unit)
            }
            it.onFailure { throwable ->
                progressFlow.emit(false)
                errorFlow.emit(throwable.message.toString())
            }
        }.launchIn(viewModelScope)
    }

    override fun register(request: RegisterRequest) {

        if (!isConnected()) {
            viewModelScope.launch {
                errorFlow.emit("Internet bilan muammo bo'ldi")
            }
            return
        }
        viewModelScope.launch {
            progressFlow.emit(true)
        }
        useCase.register(request).onEach {
            it.onSuccess {
                progressFlow.emit(false)
                successFlow.emit(Unit)
            }
            it.onFailure { throwable ->
                progressFlow.emit(false)
                errorFlow.emit(throwable.message.toString())
            }
        }.launchIn(viewModelScope)
    }
}