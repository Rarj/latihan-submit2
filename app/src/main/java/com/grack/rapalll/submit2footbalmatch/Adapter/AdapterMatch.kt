package com.grack.rapalll.submit2footbalmatch.Adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.grack.rapalll.submit2footbalmatch.R
import com.grack.rapalll.submit2footbalmatch.model.EventItem
import kotlinx.android.synthetic.main.item_list.view.*
import org.jetbrains.anko.find

class AdapterMatch (private val nextmatch : MutableList<EventItem>, val listener: (EventItem) -> Unit):
        RecyclerView.Adapter<NextMatchViewHolder>(){
    override fun onBindViewHolder(holder: NextMatchViewHolder, position: Int) {
        holder.bindItem(nextmatch[position], listener)
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewtype: Int): NextMatchViewHolder {
        return NextMatchViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent, false))
           }

    override fun getItemCount() = nextmatch.size
  }

//    override fun onBindViewHolder(holder: NextMatchViewHolder, position: Int) {
//        holder.bindItem(nextmatch[position], listener)
//    }

    class NextMatchViewHolder(view : View) : RecyclerView.ViewHolder(view){
        private val teamHome: TextView = view.find(R.id.team_Home)
        private val teamAway: TextView = view.find(R.id.team_away)
        private val dateTime :TextView = view.find(R.id.date_event)
        private val homeScore: TextView = view.find(R.id.home_score)
        private val awayScore: TextView = view.find(R.id.away_score)
        private lateinit var idHome :String
        private lateinit var idAway :String
        private lateinit var eventMatch : String

        fun bindItem (nextmatch: EventItem, listener: (EventItem) -> Unit){
            teamHome.text = nextmatch.strHomeTeam
            teamAway.text = nextmatch.strAwayTeam
            dateTime.text = nextmatch.dateEvent
            idHome= nextmatch.idHomeTeam!!
            idAway = nextmatch.idAwayTeam!!
            eventMatch = nextmatch.strEvent!!

            if(nextmatch.intHomeScore.equals(null))homeScore.text = "-"
            else homeScore.text = nextmatch.intHomeScore
            if(nextmatch.intAwayScore.equals(null)) awayScore.text = "-"
            else awayScore.text = nextmatch.intAwayScore
            itemView.setOnClickListener {
                listener(nextmatch)
            }


        }
    }
