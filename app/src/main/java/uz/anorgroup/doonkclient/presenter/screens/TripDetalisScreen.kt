package uz.anorgroup.doonkclient.presenter.screens

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import uz.anorgroup.doonkclient.R
import uz.anorgroup.doonkclient.databinding.ScreenOrderDetalisBinding

@AndroidEntryPoint
class TripDetalisScreen : Fragment(R.layout.screen_order_detalis) {
    private val bind by viewBinding(ScreenOrderDetalisBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bind.resume.setOnClickListener {
            findNavController().navigate(R.id.action_tripDetalisScreen_to_seatScreen)
        }
    }
}