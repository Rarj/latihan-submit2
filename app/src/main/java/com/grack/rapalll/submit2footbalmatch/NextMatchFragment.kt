package com.grack.rapalll.submit2footbalmatch


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.grack.rapalll.submit2footbalmatch.Adapter.AdapterMatch
import com.grack.rapalll.submit2footbalmatch.model.EventItem
import com.grack.rapalll.submit2footbalmatch.model.EventResponse
import com.grack.rapalll.submit2footbalmatch.network.ApiClient
import com.grack.rapalll.submit2footbalmatch.network.ApiInterface
import org.jetbrains.anko.support.v4.ctx
import org.jetbrains.anko.support.v4.find
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class NextMatchFragment : Fragment() {

    companion object {
        fun getInstance(): NextMatchFragment = NextMatchFragment()
    }

    private lateinit var mAdapter: AdapterMatch

//    private lateinit var a : RecyclerView

    private val events: MutableList<EventItem> = mutableListOf()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
//        a = this.find(R.id.next_match)
//
//        a.layoutManager = LinearLayoutManager(ctx)
//        a.adapter = mAdapter
        // Inflate the layout for this fragment
        loadData()
        return inflater.inflate(R.layout.fragment_next_match, container, false)

    }

    private fun loadData() {
        val api: ApiInterface = ApiClient.getRetrofit().create(ApiInterface::class.java)
        val call = api.getNextMatch()
        call.enqueue(object : Callback<EventResponse> {
            override fun onResponse(call: Call<EventResponse>, response: Response<EventResponse>) {
                if (response.isSuccessful()) {
                    val event: List<EventItem> = (response.body()?.events as List<EventItem>?)!!
                    var msg = ""
                    for (item: EventItem? in event.iterator()) {
                        msg = msg + item?.strEvent + "\n"
                        events  .clear()
                        events.addAll(event)
//                        mAdapter.notifyDataSetChanged()
                    }
                    Log.e("API: ", event.toString() + "\n")
                    Log.e("COUNT: ", msg)
                }
            }

            override fun onFailure(call: Call<EventResponse>, t: Throwable) {
//                Toasty.error(ctx, "Gagal Load Data!!").show()
            }
            //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        })
    }
}

