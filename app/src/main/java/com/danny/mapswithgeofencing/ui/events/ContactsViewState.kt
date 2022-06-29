

package com.danny.mapswithgeofencing.ui.events

import com.danny.mapswithgeofencing.db.entities.Contact

data class ContactsViewState(
        val hContactsFields: ContactsFields = ContactsFields()
) {
    data class ContactsFields(
            val hContactList: List<Contact>? = null
    )


}
