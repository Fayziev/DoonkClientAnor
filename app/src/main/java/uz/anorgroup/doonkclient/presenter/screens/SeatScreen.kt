package uz.anorgroup.doonkclient.presenter.screens

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import uz.anorgroup.doonkclient.R
import uz.anorgroup.doonkclient.data.others.SeatData
import uz.anorgroup.doonkclient.databinding.ScreenSeatBinding
import uz.anorgroup.doonkclient.presenter.adapters.SeatsAdapter

@AndroidEntryPoint
class SeatScreen : Fragment(R.layout.screen_seat) {
    private val bind by viewBinding(ScreenSeatBinding::bind)
    private var adapter = SeatsAdapter()
    private val list = ArrayList<SeatData>()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bind.listView.adapter = adapter
        load()
        adapter.submitList(list)
        bind.listView.layoutManager = StaggeredGridLayoutManager(5, StaggeredGridLayoutManager.VERTICAL)
        bind.finished.setOnClickListener {
            findNavController().navigate(R.id.action_seatScreen_to_frameScreen)
        }
    }


    private fun load() {
        for (i in 0 until 7) {
            list.add(SeatData(1))
            list.add(SeatData(1))
            list.add(SeatData(0))
            list.add(SeatData(2))
            list.add(SeatData(3))
        }

    }
}