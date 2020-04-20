package kr.tjeit.fragmentmore_20200420.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_main.*
import kr.tjeit.fragmentmore_20200420.R

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

//        액티비티의 onCreate에 대응되는 함수.
        okBtn.setOnClickListener {

            val inputMsg = messageEdt.text.toString()

            contentTxt.text = inputMsg

        }

    }

}