

package com.danny.mapswithgeofencing.ui.events

import com.danny.mapswithgeofencing.db.entities.Contact

sealed class ContactsStateEvent {
    class OnFetchContacts : ContactsStateEvent()

    class OnContactsFound : ContactsStateEvent()

    class OnSaveContacts(val hSelectedContacts: List<Contact>) : ContactsStateEvent()

    class None : ContactsStateEvent()

    class OnGetContacts : ContactsStateEvent()
}