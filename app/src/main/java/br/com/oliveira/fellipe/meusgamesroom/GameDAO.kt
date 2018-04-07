package br.com.oliveira.fellipe.meusgamesroom

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.*

/**
 * Created by logonrm on 07/04/2018.
 */
@Dao
interface GameDAO {
    @Insert
    fun inserir(game: Game)
    @Query("SELECT * FROM Game")
    fun lerGames(): LiveData<List<Game>>
    @Query("SELECT * FROM Game WHERE id = :arg0")
    fun buscarPor(id: Int): Game
    @Update
    fun atualizar(game: Game)
    @Delete
    fun apagar(game: Game)
}