package uz.anorgroup.doonkclient.data.responce

import uz.anorgroup.doonkclient.data.responce.Data

data class ContinueResponse(
    val code: Int,
    val data: Data,
    val message: String
)
