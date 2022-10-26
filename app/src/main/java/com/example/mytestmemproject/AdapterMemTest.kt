package com.example.mytestmemproject
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.mytestmemproject.databinding.FragmentTestBinding
import com.example.mytestmemproject.databinding.ItemMemBinding
class AdapterMemTest(private val memList: ArrayList<Data>,
                     val onclick: (position: Int) -> Unit
                     ) : Adapter<AdapterMemTest.MemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MemViewHolder(
           ItemMemBinding.inflate(LayoutInflater.from(parent.context),parent,false),
            FragmentTestBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    override fun onBindViewHolder(holder: AdapterMemTest.MemViewHolder, position: Int) {
        holder.bind(memList[position]) }
    override fun getItemCount() = memList.size

//    init {
//        memList.add(Data(1,R.raw.test,R.drawable
//            .img_1,R.drawable.img_1,R.drawable.img_1, Color.GREEN,"TSt"))
//    }
    inner class MemViewHolder(
        private val binding: ItemMemBinding,
        private val  bind:FragmentTestBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Data) {
            binding.img1.setAnimation(data.img )
            binding.img2.setImageResource(data.img1)
                binding.img3.setImageResource(data.img2)
                binding.img4.setImageResource(data.img3)
            binding.txt.text=data.txt
            binding.txt.setTextColor(data.color)
}}}
