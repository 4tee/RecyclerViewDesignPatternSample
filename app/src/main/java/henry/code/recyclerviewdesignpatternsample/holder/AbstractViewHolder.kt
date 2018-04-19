package henry.code.recyclerviewdesignpatternsample.holder

import android.support.v7.widget.RecyclerView
import android.view.View

abstract class AbstractViewHolder<in T>(view: View) : RecyclerView.ViewHolder(view) {
    abstract fun bind(element: T)
}