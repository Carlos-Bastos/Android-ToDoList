package com.example.todolist.model

import java.util.Date

class Tarefa (
    var id: Long,
    var nome: String,
    var descricao: String,
    var responsavel: String,
    var data: String,
    var status: Boolean,
    var categoria: Categoria
        ) {

}