package at.fh.swengb.hackensoellner

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        val EXTRA_MOVIE_ID = "MOVIE_ID_EXTRA"
    }


    val movieAdapter = MovieAdapter(){
        //Start MovieDetailActivity
        val intent = Intent(this, MovieDetailActivity ::class.java)
        intent.putExtra(EXTRA_MOVIE_ID, it.id)
        startActivity(intent)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Update the recycler view
        movieAdapter.updateList(MovieRepository.movieList())
        movie_recycler_view.layoutManager = LinearLayoutManager(this)
        movie_recycler_view.adapter = movieAdapter
    }



    override fun onRestart() {
        super.onRestart()
        //Update when coming back to this activity
        movieAdapter.updateList(MovieRepository.movieList())
    }

}
