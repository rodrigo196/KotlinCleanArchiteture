package br.com.bulgasoftwares.domain

import java.util.*

data class Podcast(val name: String, val feedUrl: String, val iconUrl: String, val registerDate: Date, val description : String)

data class Episode(val name: String, val url: String, val iconUrl: String, val publishedDate: Date, val description : String )