package henry.code.recyclerviewdesignpatternsample.viewmodel

import henry.code.recyclerviewdesignpatternsample.TypeFactory
import henry.code.rvadapterpatternsample.Animal

class AnimalVisitable(val animal: Animal) : Visitable {
    override fun type(typeFactory: TypeFactory): Int {
        return typeFactory.type(animal)
    }
}