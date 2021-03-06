package com.yastyas.wartacom.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.yastyas.wartacom.R
import com.yastyas.wartacom.modeldata.Berita
import com.yastyas.wartacom.modeldata.BeritaData

class HomeFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private var list: ArrayList<Berita> = arrayListOf()

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_home, container, false)

        list.addAll(BeritaData.listData)

        recyclerView = root.findViewById(R.id.rv_home)
        recyclerView.setHasFixedSize(true)

        recyclerView.layoutManager = LinearLayoutManager(activity)
        val homeAdapter = HomeAdapter(list)
        recyclerView.adapter = homeAdapter

        return root
    }
}
