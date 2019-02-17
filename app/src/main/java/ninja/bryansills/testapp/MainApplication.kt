package ninja.bryansills.testapp

import android.app.Application

class MainApplication : Application(), Provider {
    override fun getThing() = "this is a real app"
}