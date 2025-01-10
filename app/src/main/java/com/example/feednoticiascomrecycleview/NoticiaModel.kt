package com.example.feednoticiascomrecycleview

data class NoticiaModel(
    val nomeAutor: String,
    val imagemAutorUrl: String,
    val imagemNoticiaUrl: String,
    val tituloNoticia: String,
    val textoNoticia: String,
    val link: String,
    val dataNoticia: String,

)