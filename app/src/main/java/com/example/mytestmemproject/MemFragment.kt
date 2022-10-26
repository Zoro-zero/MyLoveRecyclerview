package com.example.mytestmemproject
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.mytestmemproject.databinding.FragmentItemBinding
import com.example.mytestmemproject.databinding.FragmentMemBinding
class MemFragment : Fragment() {
lateinit var binding: FragmentMemBinding
    private val memLIst = arrayListOf<Data>()
    private  val number=1
    private val number1=2
    private val number2=3
    private val number3=4
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?{
        binding = FragmentMemBinding.inflate(layoutInflater,container,false)
        return binding.root }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        }}
