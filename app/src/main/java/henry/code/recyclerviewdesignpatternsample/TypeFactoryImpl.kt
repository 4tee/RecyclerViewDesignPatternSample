package henry.code.recyclerviewdesignpatternsample

import android.view.View
import henry.code.recyclerviewdesignpatternsample.holder.AbstractViewHolder
import henry.code.recyclerviewdesignpatternsample.holder.AnimalViewHolder
import henry.code.recyclerviewdesignpatternsample.holder.CarViewHolder
import henry.code.recyclerviewdesignpatternsample.model.Car
import henry.code.rvadapterpatternsample.Animal

class TypeFactoryImpl : TypeFactory {

    override fun type(animal: Animal): Int = R.layout.list_item_animal

    override fun type(car: Car): Int = R.layout.list_item_car

    override fun holder(type: Int, view: View): AbstractViewHolder<*> {
        return when (type) {
            R.layout.list_item_animal -> {
                AnimalViewHolder(view)
            }
            R.layout.list_item_car -> {
                CarViewHolder(view)
            }
            else -> throw RuntimeException("Illegal view type")
        }
    }
}