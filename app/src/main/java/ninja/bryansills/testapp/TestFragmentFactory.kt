package ninja.bryansills.testapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory

class TestFragmentFactory(val input: String) : FragmentFactory() {
    override fun instantiate(classLoader: ClassLoader, className: String, args: Bundle?): Fragment {
        return MainFragment(input)
    }
}