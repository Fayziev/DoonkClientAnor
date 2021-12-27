package uz.anorgroup.doonkclient.presenter.screens

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import uz.anorgroup.doonkclient.R
import uz.anorgroup.doonkclient.databinding.ScreenFrameBinding

@AndroidEntryPoint
class FrameScreen : Fragment(R.layout.screen_frame) {
    private val bind by viewBinding(ScreenFrameBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind.finished.setOnClickListener {
            findNavController().navigate(R.id.action_frameScreen_to_ticketScreen)
        }
    }
}