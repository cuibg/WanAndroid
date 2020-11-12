package com.sbingo.wanandroid_mvvm.base

import android.app.AlertDialog
import android.content.Context
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.core.content.ContextCompat
import androidx.core.content.PermissionChecker
import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import java.util.*

/**
 * Author: Sbingo666
 * Date:   2019/4/15
 */
abstract class BaseFragment : Fragment() {

    protected abstract var layoutId: Int

    protected abstract fun initData()

    protected abstract fun subscribeUi()

    private lateinit var deniedPermissions: HashMap<String, Array<String>>
    private var showPermissionDialogOnDenied: Boolean = true
    protected var isRefreshFromPull = false

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(layoutId, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initData()
        subscribeUi()
    }

    open fun onRetry() {

    }

}