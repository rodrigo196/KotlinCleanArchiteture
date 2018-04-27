package br.com.bulgasoftwares.kotlincleanarchiteture.internal.di.modules

import br.com.bulgasoftwares.domain.repository.PodcastRepository
import br.com.bulgasoftwares.kotlincleanarchiteture.data.repository.PodcastDataRepository
import br.com.bulgasoftwares.kotlincleanarchiteture.internal.di.PerActivity
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module class PodcastModule {

    @PerActivity
    @Provides
    internal fun providePodcastRepository(podcastDataRepository: PodcastDataRepository)
            : PodcastRepository {
        return podcastDataRepository
    }

}