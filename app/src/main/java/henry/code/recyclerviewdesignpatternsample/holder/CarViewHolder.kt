package henry.code.recyclerviewdesignpatternsample.holder

import android.view.View
import henry.code.recyclerviewdesignpatternsample.R
import henry.code.recyclerviewdesignpatternsample.viewmodel.CarVisitable
import kotlinx.android.synthetic.main.list_item_car.view.*

class CarViewHolder(view: View) : AbstractViewHolder<CarVisitable>(view) {

    override fun bind(element: CarVisitable) {
        // implementation of setText and setImage here for Animal type
        itemView.text_car_name.text = element.car.name
        itemView.image_car_icon.setImageResource(element.car.iconRes)
    }
}
