package ninja.bryansills.testapp.test

import ninja.bryansills.testapp.MainApplication

class TestApplication : MainApplication() {
    override fun getThing(): String = "This... is... testing!"
}