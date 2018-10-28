package com.grack.rapalll.submit2footbalmatch


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class PastMatchFragment : Fragment() {

    companion object {
        fun getInstance(): PastMatchFragment = PastMatchFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_past_match, container, false)
    }


}
