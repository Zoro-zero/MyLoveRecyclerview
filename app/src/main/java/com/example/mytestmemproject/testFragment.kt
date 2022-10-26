package com.example.mytestmemproject

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.mytestmemproject.databinding.FragmentTestBinding
import java.util.ArrayList
class testFragment : Fragment() {
    lateinit var binding: FragmentTestBinding
    private val carList = arrayListOf<Data>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentTestBinding.inflate(inflater,container,false)
        return binding.root }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        carList.add( Data(1,R.drawable.skillet1,R.drawable.skillet3,R.drawable.img_2,R.drawable.img_3,
            Color.RED,"Я буду в шоке эсли заработает"))
        binding.img1.setImageResource((R.drawable.img_3))
        /*val bundle = Bundle()
        val car: Data = arguments?.getSerializable("key,key1,key2,key3") as Data
        binding.img1.setImageResource(car.)
        binding.img2.setImageResource(car.img1)
        binding.img3.setImageResource(car.img2)
        binding.img4.setImageResource(car.img3)
        binding.txt.text=car.txt*/ } }