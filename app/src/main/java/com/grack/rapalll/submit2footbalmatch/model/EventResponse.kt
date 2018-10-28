package com.grack.rapalll.submit2footbalmatch.model

import com.google.gson.annotations.SerializedName

data class EventResponse(
        @SerializedName("events")
        var events: List<EventItem?>?
)