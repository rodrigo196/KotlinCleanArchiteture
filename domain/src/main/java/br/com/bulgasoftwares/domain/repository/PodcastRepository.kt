package br.com.bulgasoftwares.domain.repository

import br.com.bulgasoftwares.domain.Episode
import br.com.bulgasoftwares.domain.Podcast
import io.reactivex.Observable

/**
 * Repository for podcasts objects.
 */
interface PodcastRepository {

    /**
     * Get all podcasts.
     * @return A Observable that resolves the operation.
     */
    fun podcasts() : Observable<List<Podcast>>

    /**
     * Get a list of episodes from the given podcast.
     * @param podcast The podcast to get episodes.
     * @return A Observable that resolves the operation.
     */
    fun episodes(podcast : Podcast) : Observable<List<Episode>>
}