package ninja.bryansills.testapp

import androidx.fragment.app.testing.FragmentScenario
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.lifecycle.Lifecycle
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import ninja.bryansills.testapp.R.id
import org.junit.Before
import org.junit.Test

class MainFragmentTest {

    lateinit var scenario: FragmentScenario<MainFragment>

    @Before
    fun setup() {
        val fragmentFactory = TestFragmentFactory("BLARG!")
        scenario = launchFragmentInContainer(factory = fragmentFactory)
    }

    @Test
    fun basic() {
        scenario.moveToState(Lifecycle.State.RESUMED)
        onView(withId(id.textView)).check(matches(withText("This... is... testing! BLARG!")))
    }
}