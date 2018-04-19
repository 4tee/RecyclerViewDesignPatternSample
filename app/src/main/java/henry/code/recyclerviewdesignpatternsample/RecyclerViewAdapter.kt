package henry.code.rvadapterpatternsample

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import henry.code.recyclerviewdesignpatternsample.TypeFactory
import henry.code.recyclerviewdesignpatternsample.holder.AbstractViewHolder
import henry.code.recyclerviewdesignpatternsample.viewmodel.Visitable

class RecyclerViewAdapter(var objects: ArrayList<Visitable>, var typeFactory: TypeFactory) : RecyclerView.Adapter<AbstractViewHolder<Visitable>>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AbstractViewHolder<Visitable> {
        val view = LayoutInflater.from(parent.context).inflate(viewType, parent, false)
        return typeFactory.holder(viewType, view) as AbstractViewHolder<Visitable>
    }

    override fun getItemCount(): Int {
        return objects.count()
    }

    override fun onBindViewHolder(holder: AbstractViewHolder<Visitable>, position: Int) {
        return holder.bind(objects[position])
    }

    override fun getItemViewType(position: Int): Int {
        return objects[position].type(typeFactory)
    }
}
