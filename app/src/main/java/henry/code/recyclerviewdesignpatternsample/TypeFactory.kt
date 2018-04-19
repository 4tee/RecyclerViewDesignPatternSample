package henry.code.recyclerviewdesignpatternsample

import android.view.View
import henry.code.recyclerviewdesignpatternsample.holder.AbstractViewHolder
import henry.code.recyclerviewdesignpatternsample.model.Car
import henry.code.rvadapterpatternsample.Animal

interface TypeFactory {
    fun type(animal: Animal): Int
    fun type(car: Car): Int

    fun holder(type: Int, view: View): AbstractViewHolder<*>
}