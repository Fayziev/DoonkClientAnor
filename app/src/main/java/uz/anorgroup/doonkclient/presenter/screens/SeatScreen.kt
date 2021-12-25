package uz.anorgroup.doonkclient.presenter.screens

import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import uz.anorgroup.doonkclient.R
import uz.anorgroup.doonkclient.databinding.ScreenSeatBinding

@AndroidEntryPoint
class SeatScreen : Fragment(R.layout.screen_seat) {
    private val bind by viewBinding(ScreenSeatBinding::bind)

}