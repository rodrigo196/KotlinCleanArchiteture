package br.com.bulgasoftwares.kotlincleanarchiteture.data.repository

import br.com.bulgasoftwares.domain.Episode
import br.com.bulgasoftwares.domain.Podcast
import br.com.bulgasoftwares.domain.repository.PodcastRepository
import io.reactivex.Observable
import java.util.*
import javax.inject.Inject

/**
 * Podcast rpository implementation.
 */
class PodcastDataRepository @Inject constructor() : PodcastRepository {

    override fun podcasts(): Observable<List<Podcast>> {
        return Observable.create {
            val p1 = Podcast(name = "Mundo Freak Confidencial", description = "Mundo freak", feedUrl = "http://www.mundofreak.com.br/feed/podcast/", iconUrl = "http://www.mundofreak.com.br/wp-content/uploads/powerpress/mfc.jpg", registerDate = Date())
            val p2 = Podcast(name = "Mundo Freak Confidencial 2", description = "Mundo freak", feedUrl = "http://www.mundofreak.com.br/feed/podcast/", iconUrl = "http://www.mundofreak.com.br/wp-content/uploads/powerpress/mfc.jpg", registerDate = Date())
            it.onNext(listOf(p1, p2))
            it.onComplete()
        }
    }

    override fun episodes(podcast: Podcast): Observable<List<Episode>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}