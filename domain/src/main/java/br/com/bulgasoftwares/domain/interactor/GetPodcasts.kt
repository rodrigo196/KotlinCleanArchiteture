package br.com.bulgasoftwares.domain.interactor

import br.com.bulgasoftwares.domain.Podcast
import br.com.bulgasoftwares.domain.executor.PostExecutionThread
import br.com.bulgasoftwares.domain.executor.ThreadExecutor
import br.com.bulgasoftwares.domain.repository.PodcastRepository
import io.reactivex.Observable
import javax.inject.Inject

class GetPodcasts @Inject constructor(threadExecutor: ThreadExecutor,
                                      postExecutionThread: PostExecutionThread,
                                      private val repository: PodcastRepository) :
        UseCase<List<Podcast>, Unit>(threadExecutor, postExecutionThread) {



    override fun buildUseCaseObservable(params: Unit): Observable<List<Podcast>> {
        return repository.podcasts()
    }
}