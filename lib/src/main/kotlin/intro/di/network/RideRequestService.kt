package intro.di.network

import java.util.*

interface RideRequestService {
    fun requestARide(uuid: UUID, authToken: String)
}