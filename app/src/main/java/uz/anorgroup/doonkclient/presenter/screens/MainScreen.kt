package uz.anorgroup.doonkclient.presenter.screens

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import uz.anorgroup.doonkclient.R
import uz.anorgroup.doonkclient.databinding.ScreenMainBinding
import uz.anorgroup.doonkclient.presenter.adapters.PageAdapter

@AndroidEntryPoint
class MainScreen : Fragment(R.layout.screen_main) {
    private val bind by viewBinding(ScreenMainBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val pageAdapter = PageAdapter(childFragmentManager, lifecycle)
        bind.pager.adapter = pageAdapter

        bind.pager.isUserInputEnabled = false
        bind.tablayout.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.trip -> {
                    bind.pager.setCurrentItem(0, true)
                }
                R.id.search -> {
                    bind.pager.setCurrentItem(1, true)
                }
                R.id.create -> {
                    bind.pager.setCurrentItem(2, true)
                }
                R.id.profile -> {
                    bind.pager.setCurrentItem(3, true)
                }
            }
            return@setOnItemSelectedListener true
        }
    }
}