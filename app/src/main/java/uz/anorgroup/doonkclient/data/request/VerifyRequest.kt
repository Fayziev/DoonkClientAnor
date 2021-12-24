package uz.anorgroup.doonkclient.data.request

data class VerifyRequest(
    val code: String,
    val phone: String
)
