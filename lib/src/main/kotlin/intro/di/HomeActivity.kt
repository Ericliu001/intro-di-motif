package intro.di

import intro.di.network.AuthServiceImpl
import intro.di.network.NetworkClient
import intro.di.network.RideRequestServiceImpl

class HomeActivity {
    private var profile: Profile? = null

    fun onCreate() {
    }

    fun login() {
        profile = AuthServiceImpl(NetworkClient()).login("eric@uber.com", "xxxx")
    }

    fun requestRide() {
        profile?.let {
            RideRequestServiceImpl(it, NetworkClient()).requestRide()
        }
    }
}