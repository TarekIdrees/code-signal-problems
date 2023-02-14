package challenge

class TheChanceFirstChallenge {
    fun solution(l: List<Any>) =
        if(l.all{it in listOf("a","b") } &&
            l.any{it =="a"} &&
            l.any{it =="b"})
            ((l.count{ it =="a"}*1f)/l.size)
        else
            -1.0f
}