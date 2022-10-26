package com.example.mytestmemproject
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.mytestmemproject.databinding.FragmentItemBinding
class FragmentItem : Fragment() {
    lateinit var  binding:FragmentItemBinding
    private val memLIst = arrayListOf<Data>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentItemBinding.inflate(layoutInflater,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        val adapter = AdapterMemTest(memLIst,this::onClick)
        binding.memFragment.adapter=adapter }
    private fun loadData() {
            memLIst.add(Data(1,R.raw.animeation,R.drawable.onepiece_1,R.drawable.onepiece_3,R.drawable.img_3,Color.CYAN,"One piece"))
            memLIst.add(Data(2,R.raw.jack2_0,R.drawable.pirate2,R.drawable.pirate3,R.drawable.pirate4,Color.GREEN,"Jack Sparrow"))
            memLIst.add(Data(3,R.raw.billi2_0,R.drawable.bili_2,R.drawable.bili_3,R.drawable.billi_4,Color.YELLOW,"Bili Eilish"))
            memLIst.add(Data(4,R.raw.skillet2_0,R.drawable.img_1,R.drawable.skillet3,R.drawable.skillet4,Color.RED,"Skillet")) }
    private fun onClick(position:Int){
        val bundle = Bundle()
        bundle.putSerializable("key",memLIst[position])
        findNavController().navigate(R.id.testFragment,bundle) }}

