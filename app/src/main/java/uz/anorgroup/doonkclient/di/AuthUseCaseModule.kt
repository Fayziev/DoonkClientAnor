package uz.anorgroup.doonkclient.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import uz.anorgroup.doonkclient.domain.usecase.LoginScreenUseCase
import uz.anorgroup.doonkclient.domain.usecase.RegisterScreenUseCase
import uz.anorgroup.doonkclient.domain.usecase.VerifyScreenUseCase
import uz.anorgroup.doonkclient.domain.usecase.usecaseimpl.LoginScreenUseCaseImpl
import uz.anorgroup.doonkclient.domain.usecase.usecaseimpl.RegisterScreenUseCaseImpl
import uz.anorgroup.doonkclient.domain.usecase.usecaseimpl.VerifyScreenUseCaseImpl


@Module
@InstallIn(ViewModelComponent::class)
interface AuthUseCaseModule {

    @Binds
    fun getRegisterUseCase(impl: RegisterScreenUseCaseImpl): RegisterScreenUseCase

    @Binds
    fun getVerifyUseCase(impl: VerifyScreenUseCaseImpl): VerifyScreenUseCase

    @Binds
    fun getLoginUseCase(impl: LoginScreenUseCaseImpl): LoginScreenUseCase

}