package intro.di

import intro.di.network.AuthService
import intro.di.network.AuthServiceImpl
import intro.di.network.NetworkClient
import intro.di.network.RideRequestService
import intro.di.network.RideRequestServiceImpl

class RootComponent {
    private var networkClient: NetworkClient? = null
    private var rideRequestService: RideRequestService? = null


    fun authService(): AuthService {
        val networkClient2 = networkClient()
        return AuthServiceImpl(networkClient2)
    }

    fun rideRequestService(profile: Profile): RideRequestService {
        if (rideRequestService == null) {
            val networkClient1 = networkClient()
            rideRequestService = RideRequestServiceImpl(profile, networkClient1)
        }
        return rideRequestService!!
    }

    fun networkClient(): NetworkClient {
        if (networkClient == null) {
            networkClient = NetworkClient()
        }
        return networkClient!!
    }
}