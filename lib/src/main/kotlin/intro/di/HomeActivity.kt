package intro.di

class HomeActivity {
    private lateinit var rootScope: RootScope

    fun onCreate() {
        rootScope = RootScopeImpl(object : RootScopeImpl.Dependencies {
        })
    }

    fun login() {
        val profile = rootScope.authService().login()
        rootScope.loggedInScope()
    }
}