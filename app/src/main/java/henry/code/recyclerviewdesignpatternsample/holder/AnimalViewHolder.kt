package henry.code.recyclerviewdesignpatternsample.holder

import android.view.View
import henry.code.recyclerviewdesignpatternsample.viewmodel.AnimalVisitable
import kotlinx.android.synthetic.main.list_item_animal.view.*

class AnimalViewHolder(view: View) : AbstractViewHolder<AnimalVisitable>(view) {

    override fun bind(element: AnimalVisitable) {
        // implementation of setText and setImage here for Animal type
        itemView.text_animal_name.text = element.animal.name
        itemView.text_animal_legs.text = "has ${element.animal.leg} legs"
    }
}
