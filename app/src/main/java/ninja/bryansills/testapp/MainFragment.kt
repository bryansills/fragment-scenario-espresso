package ninja.bryansills.testapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class MainFragment(val constArg: String) : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_main, container, false)
        val provider = view.context.applicationContext as Provider
        val textView = view.findViewById<TextView>(R.id.textView)
        textView.text = "${provider.getThing()} $constArg"
        return view
    }
}