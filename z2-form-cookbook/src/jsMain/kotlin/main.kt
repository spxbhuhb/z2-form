import hu.simplexion.z2.browser.form.Form.Companion.form
import hu.simplexion.z2.browser.form.field
import hu.simplexion.z2.browser.material.button.textButton
import hu.simplexion.z2.browser.material.snackbar.Snackbar.Companion.snackbar
import hu.simplexion.z2.commons.i18n.LocalizedTextStore
import hu.simplexion.z2.commons.util.UUID
import hu.simplexion.z2.schema.Schema
import kotlinx.browser.document

object AccountSchema : Schema(UUID()) {
    val name by textual(minLength = 5, maxLength = 50, blank = false, pattern = "\\p{Print}{5,50}")
}

object strings : LocalizedTextStore(UUID()) {
    val login by "Login"
    val loggedIn by "Logged in!"
}

fun main() {
    with (document.body!!) {

        form(AccountSchema) { form, schema ->

            field(form) { schema.name }

            textButton(strings.login) { snackbar(strings.loggedIn) }

        }
    }
}