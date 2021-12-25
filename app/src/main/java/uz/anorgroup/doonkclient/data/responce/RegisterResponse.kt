package uz.anorgroup.doonkclient.data.responce

import uz.anorgroup.doonkclient.data.responce.Data


data class RegisterResponse(
    val code: Int,
    val data: Data,
    val message: String
)