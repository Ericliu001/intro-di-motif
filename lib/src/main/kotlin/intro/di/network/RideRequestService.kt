package intro.di.network

import java.util.*

interface RideRequestService {
    fun requestRide(uuid: UUID, authToken: String)
}