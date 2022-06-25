package intro.di

import motif.ScopeFactory

class HomeActivity {
    private var profile: Profile? = null
    lateinit var rootScope: RootScope

    fun onCreate() {
        rootScope = ScopeFactory.create(RootScope::class.java, object : RootScope.Dependencies{} )
    }

    /**
     * Login the user.
     *//**/
    fun login() {
        profile = rootScope.authService().login("el@uber.com", "xxxx")
    }

    /**
     * Request a ride.
     */
    fun requestRide() {
        profile?.let {
            rootScope.loggedInScope(it).rideRequestService().requestRide()
        }
    }
}