package intro.di

class HomeActivity {
    private var profile: Profile? = null
    lateinit var rootScope: RootScope

    fun onCreate() {
        rootScope = RootScopeImpl()
    }

    /**
     * Login the user.
     *//**/
    fun login() {
        profile = rootScope.authService().login("eric.liu@uber.com", "xxxx")
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