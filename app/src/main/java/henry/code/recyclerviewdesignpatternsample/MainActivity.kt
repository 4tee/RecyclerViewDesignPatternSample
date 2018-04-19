package henry.code.recyclerviewdesignpatternsample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import henry.code.recyclerviewdesignpatternsample.model.Car
import henry.code.recyclerviewdesignpatternsample.viewmodel.AnimalVisitable
import henry.code.recyclerviewdesignpatternsample.viewmodel.CarVisitable
import henry.code.recyclerviewdesignpatternsample.viewmodel.Visitable
import henry.code.rvadapterpatternsample.Animal
import henry.code.rvadapterpatternsample.RecyclerViewAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerList.layoutManager = LinearLayoutManager(this)
        recyclerList.adapter = RecyclerViewAdapter(getObjects(), TypeFactoryImpl())
    }

    private fun getObjects(): ArrayList<Visitable> {
        var objects = ArrayList<Visitable>()
        objects.add(AnimalVisitable(Animal("Cat", 4)))
        objects.add(AnimalVisitable(Animal("Owl", 2)))
        objects.add(AnimalVisitable(Animal("Bear", 4)))
        objects.add(AnimalVisitable(Animal("Lion", 4)))
        objects.add(AnimalVisitable(Animal("Tiger", 4)))
        objects.add(AnimalVisitable(Animal("Monkey", 2)))
        objects.add(CarVisitable(Car("BMW", R.drawable.ic_airport_shuttle)))
        return objects
    }

}
