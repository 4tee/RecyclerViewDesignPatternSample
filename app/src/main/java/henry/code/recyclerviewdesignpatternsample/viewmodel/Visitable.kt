package henry.code.recyclerviewdesignpatternsample.viewmodel

import henry.code.recyclerviewdesignpatternsample.TypeFactory

interface Visitable {
    fun type(typeFactory: TypeFactory): Int
}