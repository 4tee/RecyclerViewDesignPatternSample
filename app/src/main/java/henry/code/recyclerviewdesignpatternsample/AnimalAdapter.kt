package henry.code.rvadapterpatternsample

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import henry.code.recyclerviewdesignpatternsample.R
import kotlinx.android.synthetic.main.list_item.view.*

class AnimalAdapter(private val animals: ArrayList<Animal>, private val context: Context) : RecyclerView.Adapter<AnimalAdapter.ViewHolder>() {

    class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        // Holds the TextView that will add each animal to
        val tvAnimalName = view.text_name
        val tvAnimalLegs = view.text_legs
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // Inflate the layout
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_item, parent, false))
    }

    override fun getItemCount(): Int {
        return animals.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.tvAnimalName.text = animals[position].name
        holder?.tvAnimalLegs.text = animals[position].leg.toString()
    }

}
