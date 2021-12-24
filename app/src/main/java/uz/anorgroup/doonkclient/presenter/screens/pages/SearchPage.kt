package uz.anorgroup.doonkclient.presenter.screens.pages

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import uz.anorgroup.doonkclient.R
import uz.anorgroup.doonkclient.databinding.PageSearchBinding

@AndroidEntryPoint
class SearchPage : Fragment(R.layout.page_search) {
    private val bind by viewBinding(PageSearchBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        load()

    }

    private fun load() {
        for (i in 0 until 7) {

        }
    }

}