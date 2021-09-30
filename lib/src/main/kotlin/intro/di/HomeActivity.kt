package intro.di

class HomeActivity {
    private var profile: Profile? = null
    private val rootScope: RootScope? = null

    fun login() {
        object : Thread() {
            override fun run() {
                val name = "Eric"
                val email = "eric@uber.com"
                profile = Profile(name, email)
            }
        }
    }

    fun signOut() {
        throw UnsupportedOperationException()
    }

    fun onAttach() {
    }

    fun openDrawer() {
    }
}