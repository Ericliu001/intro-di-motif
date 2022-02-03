package intro.di.network

import intro.di.Profile

class RideRequestServiceImpl(
    private val profile: Profile, private val networkClient:
    NetworkClient
) :
    RideRequestService {
    override fun requestRide() {
        //no-op.
        networkClient.newCall("www.example.com/request?token=" + profile.authToken)
    }
}