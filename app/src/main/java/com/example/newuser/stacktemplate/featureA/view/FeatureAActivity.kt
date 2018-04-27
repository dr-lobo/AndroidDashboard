package com.example.newuser.stacktemplate.featureA.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.newuser.stacktemplate.R
import com.example.newuser.stacktemplate.featureA.di.DaggerFeatureAComponent
import com.example.newuser.stacktemplate.featureA.di.FeatureAModule
import com.example.newuser.stacktemplate.featureA.presenter.FeatureAPresenter
import com.jakewharton.rxbinding2.view.clicks
import io.reactivex.Observable
import kotlinx.android.synthetic.main.activity_feature.*
import javax.inject.Inject

class FeatureAActivity : AppCompatActivity(), FeatureAViewModel {

    @Inject
    lateinit var featureAPresenter: FeatureAPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature)
        setSupportActionBar(toolbar)
        initDagger()
        featureAPresenter.onStart()
    }

    private fun initDagger() {
        DaggerFeatureAComponent
                .builder()
                .featureAModule(FeatureAModule(this))
                .build()
                .inject(this)
    }

    override fun onStop() {
        super.onStop()
        featureAPresenter.onStop()
    }

    override fun subscribeToFabClickEvent(): Observable<Unit> {
        return fab.clicks()
    }

}
