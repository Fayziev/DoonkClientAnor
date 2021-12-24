package uz.anorgroup.doonkclient.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.anorgroup.doonkclient.domain.repository.AuthRepository
import uz.anorgroup.doonkclient.domain.repository.repositoryimpl.AuthRepositoryImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    @Singleton
    fun getAppRepository(impl: AuthRepositoryImpl): AuthRepository

}