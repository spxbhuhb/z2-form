package hu.simplexion.z2.browser.form

import hu.simplexion.z2.browser.material.html.Z2
import hu.simplexion.z2.schema.Schema

class Form<T : Schema>(
    val schema: T
) {
    companion object {

        fun <T : Schema> Z2.form(
            schema: T,
            builder: Z2.(form: Form<T>, schema: T) -> Unit
        ) = Form(schema).run { builder(this@run, this@run.schema) }

    }

    var submit : suspend () -> Unit = {  }
}