package uz.anorgroup.doonkclient.presenter.screens.pages

import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import uz.anorgroup.doonkclient.R
import uz.anorgroup.doonkclient.databinding.PageProfileBinding

@AndroidEntryPoint
class ProfilePage : Fragment(R.layout.page_profile) {
    private val bind by viewBinding(PageProfileBinding::bind)

}