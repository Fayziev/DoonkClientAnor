package uz.anorgroup.doonkclient.presenter.screens.pages

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import uz.anorgroup.doonkclient.R
import uz.anorgroup.doonkclient.databinding.PageTripBinding
import uz.anorgroup.doonkclient.presenter.dialogs.ClientInfoBottomDialog

@AndroidEntryPoint
class TripPage : Fragment(R.layout.page_trip) {
    private val bind by viewBinding(PageTripBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind.naytiBtn.setOnClickListener {
            val dialog = ClientInfoBottomDialog()
            dialog.show(childFragmentManager, "ClientInfoBottomDialog")
        }
    }

}