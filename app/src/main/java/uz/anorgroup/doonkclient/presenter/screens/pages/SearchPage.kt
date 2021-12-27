package uz.anorgroup.doonkclient.presenter.screens.pages

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import uz.anorgroup.doonkclient.R
import uz.anorgroup.doonkclient.data.OrdersInfo
import uz.anorgroup.doonkclient.databinding.PageSearchBinding
import uz.anorgroup.doonkclient.presenter.adapters.OrdersAdapter

@AndroidEntryPoint
class SearchPage : Fragment(R.layout.page_search) {
    private val bind by viewBinding(PageSearchBinding::bind)
    private val adapter = OrdersAdapter()
    private val list = ArrayList<OrdersInfo>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        load()
        bind.recykler.adapter = adapter
        adapter.submitList(list)
        bind.recykler.layoutManager = LinearLayoutManager(requireContext())
        adapter.setListener {
            findNavController().navigate(R.id.action_mainScreen_to_tripDetalisScreen)
        }
    }


    private fun load() {
        for (i in 0 until 12) {
            list.add(
                OrdersInfo(
                    "ООО “ТРАНСФЕРT”", "08:30",
                    "Автостанция “Котельники” метро Котельники; микр...",
                    "21:30", "13 м. 0 мин", "Санкт - Петербург", "1799 руб.", "10"
                )
            )
        }
    }

}