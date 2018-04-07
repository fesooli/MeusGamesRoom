package br.com.oliveira.fellipe.meusgamesroom

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by logonrm on 07/04/2018.
 */
@Entity
class Game {
    //A anotacao PrimaryKey indica que a variável id será chave primária
//da nossa base dados e ativamos o autoGenerate para que o id
//seja gerado automaticamente
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
    var nome: String? = null
    var plataforma: String? = null

    constructor() {}
    constructor(nome: String, plataforma: String) {
        this.nome = nome
        this.plataforma = plataforma
    }

    constructor(id: Int, nome: String, plataforma: String) {
        this.id = id
        this.nome = nome
        this.plataforma = plataforma
    }
}
