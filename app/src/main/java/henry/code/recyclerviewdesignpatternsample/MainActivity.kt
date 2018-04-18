package henry.code.recyclerviewdesignpatternsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import henry.code.rvadapterpatternsample.Animal
import henry.code.rvadapterpatternsample.AnimalAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerList.layoutManager = LinearLayoutManager(this)
        recyclerList.adapter = AnimalAdapter(getAnimals(), this)
    }

    private fun getAnimals() : ArrayList<Animal> {
        var animals = ArrayList<Animal>()
        animals.add(Animal("Dog", 4))
        animals.add(Animal("Cat", 4))
        animals.add(Animal("Owl", 2))
        animals.add(Animal("Bear",4))
        animals.add(Animal("Lion", 4))
        animals.add(Animal("Tiger", 4))
        animals.add(Animal("Fox", 4))
        animals.add(Animal("Monkey",2))
        animals.add(Animal("Penguin",2))
        return animals
    }

}
