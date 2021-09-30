package intro.di

@motif.Scope
interface RootScope {

    @motif.Objects
    abstract class Objects {
        fun name(): String {
            return "Eric"
        }
    }
}