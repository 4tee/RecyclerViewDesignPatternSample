package henry.code.recyclerviewdesignpatternsample.viewmodel

import henry.code.recyclerviewdesignpatternsample.TypeFactory
import henry.code.recyclerviewdesignpatternsample.model.Car
import henry.code.rvadapterpatternsample.Animal

class CarVisitable(val car: Car) : Visitable {
    override fun type(typeFactory: TypeFactory): Int {
        return typeFactory.type(car)
    }
}