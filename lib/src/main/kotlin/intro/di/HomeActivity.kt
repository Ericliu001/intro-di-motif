package intro.di

class HomeActivity {
    private lateinit var rootScope: RootScope
    private var profile: Profile? = null

    fun onCreate() {
        rootScope = RootScopeImpl(object : RootScopeImpl.Dependencies {
        })
    }

    fun login() {
        profile = rootScope.authService().login("eric@uber.com", "xxxx")
    }

    fun requestRide() {
        profile?.let {
            rootScope.loggedInScope(it).rideRequestService().requestRide()
        }
    }
}