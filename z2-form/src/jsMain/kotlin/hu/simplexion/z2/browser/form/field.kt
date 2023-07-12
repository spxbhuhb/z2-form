package hu.simplexion.z2.browser.form

import hu.simplexion.z2.browser.material.html.Z2
import hu.simplexion.z2.browser.material.textfield.outlinedTextField
import hu.simplexion.z2.schema.Schema
import hu.simplexion.z2.schema.SchemaField

fun <T: Schema> Z2.field(form : Form<T>, accessor : () -> SchemaField<*>) =
    accessor().let {
        outlinedTextField(it.name)
    }